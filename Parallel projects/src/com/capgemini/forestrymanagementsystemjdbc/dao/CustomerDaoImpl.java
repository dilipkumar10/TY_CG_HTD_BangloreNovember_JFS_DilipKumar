package com.capgemini.forestrymanagementsystemjdbc.dao;

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
import com.capgemini.forestrymanagementsystemjdbc.bean.CustomerBean;
import com.capgemini.forestrymanagementsystemjdbc.exceptions.CustomerExceptions;
import com.capgemini.forestrymanagementsystemjdbc.factory.Factory;

public class CustomerDaoImpl implements CustomerDao {
	List<CustomerBean> list = new ArrayList<CustomerBean>();
	Scanner sc = new Scanner(System.in);
	FileReader file;
	Properties properties;
	
	public CustomerDaoImpl() {
		try {
			file = new FileReader("daab.properties");
			properties = new Properties();
			properties.load(file);
			Class.forName(properties.getProperty("dbClass"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean addCustomer(CustomerBean custo1) {
		try (Connection conn = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(properties.getProperty("addQuery"))) {
			pstmt.setInt(1, custo1.getCustomerId());
			pstmt.setString(2, custo1.getCustomerName());
			pstmt.setString(3, custo1.getStreetAddress1());
			pstmt.setString(4, custo1.getStreetAddress2());
			pstmt.setString(5, custo1.getTown());
			pstmt.setLong(6, custo1.getPostalCode());
			pstmt.setString(7, custo1.getEmail());
			pstmt.setLong(8, custo1.getTelePhoneNum());
			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			} 
		} catch (Exception e) {
			throw new CustomerExceptions("Id already exists");
		}
		return false;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		try (Connection conn = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(properties.getProperty("deleteQuery"))) {
			pstmt.setInt(1, customerId);
			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			} 
		} catch (Exception e) {
		}
		throw new CustomerExceptions("Id doesnot exists");
	}





	@Override
	public boolean modify(int cutomer_id, String name) {
		try(Connection con = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				PreparedStatement pstmt = con.prepareStatement(properties.getProperty("updatecustomername"))) {
			pstmt.setString(1, name);
			pstmt.setInt(2,cutomer_id);
			
			int count=pstmt.executeUpdate();
			if(count>0)
				return true;
		}
		catch(Exception e)
		{
			
		}
		throw new CustomerExceptions("Id does not exists");
	}

	@Override
	public boolean modifyAdd1(int cutomer_id, String address1) {
		try(Connection con = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				PreparedStatement pstmt = con.prepareStatement(properties.getProperty("updatecustomeraddress1")))
		{
			pstmt.setString(1, address1);
			pstmt.setInt(2, cutomer_id);
			
			int count=pstmt.executeUpdate();
			if(count >0)
				return true;
		}
		catch(Exception e)
		{
			
		}
		throw new CustomerExceptions("Id does not exists");
	}

	@Override
	public boolean modifyAddr2(int cutomer_id, String address2) {
		try(Connection con = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				PreparedStatement pstmt = con.prepareStatement(properties.getProperty("updatecustomeraddress2")))
		{
			pstmt.setString(1, address2);
			pstmt.setInt(2, cutomer_id);
			
			int count=pstmt.executeUpdate();
			if(count >0)
				return true;
		}
		catch(Exception e)
		{
			
		}
		throw new CustomerExceptions("Id does not exists");
	}

	@Override
	public boolean modifyTown(int cutomer_id, String town) {
		try(Connection con = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				PreparedStatement pstmt = con.prepareStatement(properties.getProperty("updatecustomertown")))
		{
			pstmt.setString(1, town);
			pstmt.setInt(2, cutomer_id);
			
			int count=pstmt.executeUpdate();
			if(count >0)
				return true;
		}
		catch(Exception e)
		{
			
		}
		throw new CustomerExceptions("Id does not exists");
	}

	@Override
	public boolean modifyCode(int cutomer_id, int postal_code) {
		try(Connection con = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				PreparedStatement pstmt = con.prepareStatement(properties.getProperty("updatecustomercode")))
		{
			pstmt.setInt(1, postal_code);
			pstmt.setInt(2, cutomer_id);
			
			int count=pstmt.executeUpdate();
			if(count >0)
				return true;
		}
		catch(Exception e)
		{
		}
		throw new CustomerExceptions("Id does not exists");
	}

	@Override
	public boolean modifyEmail(int cutomer_id, String email) {
		try(Connection con = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				PreparedStatement pstmt = con.prepareStatement(properties.getProperty("updatecustomeremail")))
		{
			pstmt.setString(1, email);
			pstmt.setInt(2, cutomer_id);
			
			int count=pstmt.executeUpdate();
			if(count >0)
				return true;
		}
		catch(Exception e)
		{
			
		}
		throw new CustomerExceptions("Id does not exists");
	}

	@Override
	public boolean modifyTelphone(int cutomer_id, int telphone_no) {
		try(Connection con = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				PreparedStatement pstmt = con.prepareStatement(properties.getProperty("updatecustomertelphone")))
		{
			pstmt.setInt(1,telphone_no);
			pstmt.setInt(2, cutomer_id);
			
			int count=pstmt.executeUpdate();
			if(count >0)
				return true;
		}
		catch(Exception e)
		{
		}
		throw new CustomerExceptions("Id does not exists");

	}

	

	@Override
	public List<CustomerBean> getAllCustomer() {
		try (Connection conn = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				Statement pstmt = conn.createStatement();
				ResultSet rs = pstmt.executeQuery(properties.getProperty("getAllCustomers"))) {
			while (rs.next()) {
				CustomerBean c = new CustomerBean();
				c.setCustomerId(rs.getInt(1));
				c.setCustomerName(rs.getString(2));
				c.setStreetAddress1(rs.getString(3));
				c.setStreetAddress2(rs.getString(4));
				c.setTown(rs.getString(5));
				c.setPostalCode(rs.getLong(6));
				c.setEmail(rs.getString(7));
				c.setTelePhoneNum(rs.getLong(8));
				list.add(c);
			}
		} catch (Exception e) {
		}
		return list;

	}
	
	public CustomerBean search(int customer_id) {
		try(Connection con = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(properties.getProperty("searchcustomer")))
		{
			pstmt.setInt(1, customer_id);
			ResultSet rst=pstmt.executeQuery();
			if(rst.next())
			{
				CustomerBean customer =new CustomerBean();
				customer.setCustomerId(rst.getInt(1));
				customer.setCustomerName(rst.getString(2));
				customer.setStreetAddress1(rst.getString(3));
				customer.setStreetAddress2(rst.getString(4));
				customer.setTown(rst.getString(5));
				customer.setPostalCode(rst.getLong(6));
				customer.setEmail(rst.getString(7));
				customer.setTelePhoneNum(rst.getLong(8));
				return customer;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		throw new CustomerExceptions("Customer Id does not exists");
	}
	

}
