package com.capgemini.forestrymanagementsystemjdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.capgemini.forestrymanagementsystemjdbc.bean.UsersBean;
import com.capgemini.forestrymanagementsystemjdbc.exceptions.UsersException;
import com.capgemini.forestrymanagementsystemjdbc.bean.ContractorBean;

public class ClientDaoImpl implements ClientDao {
	public static List<ContractorBean> l = new ArrayList<ContractorBean>();
	Scanner sc = new Scanner(System.in);
	FileReader file;
	Properties properties;
	

	public ClientDaoImpl() {
		try {
			file = new FileReader("Client.properties");
			properties = new Properties();
			properties.load(file);
			Class.forName(properties.getProperty("dbClass"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean addClient(UsersBean bean) {
		try (Connection conn = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(properties.getProperty("addQuery"))) {
			pstmt.setString(1, bean.getRole());
			pstmt.setString(2, bean.getUserName());
			pstmt.setString(3, bean.getPassword());
			pstmt.setString(4, bean.getEmail());
			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			} 
		} catch (Exception e) {
			throw new UsersException("username already exists");
		}
		return false;
	}

	@Override
	public boolean login(String name, String password) {
		try (Connection conn = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword")); 
				PreparedStatement pstmt = conn.prepareStatement(properties.getProperty("login"))){
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				return true;
			} 
			
		} catch (Exception e) {
		}
		throw new UsersException("Invalid credintials");
		
	}

	@Override
	public boolean delete(String name, String password) {
		try (Connection conn = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(properties.getProperty("clientdeleteQuery"))){
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		throw new UsersException("Invalid credintials");
	}

	@Override
	public boolean update(String name, String password) {
		try (Connection conn = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(properties.getProperty("clientupdateQuery"))){
			pstmt.setString(2, name);
			pstmt.setString(1, password);
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		throw new UsersException("Id does not exists");
	}

}
