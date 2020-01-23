package com.capgemini.forestrymanagementsystemjdbc.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.capgemini.forestrymanagementsystemjdbc.bean.ContractorBean;
import com.capgemini.forestrymanagementsystemjdbc.exceptions.ContractException;

public class ContractorDaoImpl implements ContractorDao {
	
	Scanner sc = new Scanner(System.in);
	FileReader file;
	Properties properties;

	public ContractorDaoImpl() {
		try {
			file = new FileReader("dab.properties");
			properties = new Properties();
			properties.load(file);
			Class.forName(properties.getProperty("driverClass"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean addContractor(ContractorBean bean) {
		try (Connection conn = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(properties.getProperty("addQuery"))) {
			pstmt.setInt(1, bean.getContractNo());
			pstmt.setInt(2, bean.getCustomerId());
			pstmt.setInt(3, bean.getProductId());
			pstmt.setString(4, bean.getDeliveryDate());
			pstmt.setInt(5, bean.getQuantity());
			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			} 
		} catch (Exception e) {
			throw new ContractException("Id already exists");
		}
		return false;
	}

	@Override
	public boolean deleteContractorBean(int contractNo) {
		try (Connection conn = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(properties.getProperty("deleteQuery"))) {
			pstmt.setInt(1, contractNo);
			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			} 
		} catch (Exception e) {
		}
		throw new ContractException("Id does not exists");
	}

	
	@Override
	public List<ContractorBean> getAllContractors() {
		List<ContractorBean> list = new ArrayList<ContractorBean>();
		try (Connection conn = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
			Statement pstmt = conn.createStatement();
				ResultSet rs=pstmt.executeQuery(properties.getProperty("getAllContractors"))){
			while(rs.next()) {
				ContractorBean c=new ContractorBean();
				c.setContractNo(rs.getInt(1));
				c.setCustomerId(rs.getInt(2));
				c.setProductId(rs.getInt(3));
				c.setDeliveryDate(rs.getString(4));
				c.setQuantity(rs.getInt(5));
				list.add(c);			
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
