package com.capgemini.phonesimulatorapplicationdevelopment.Dao;

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

import com.capgemini.phonesimulatorapplicationdevelopment.bean.ContactBean;

public class ContactDaoImpl implements ContactDao {
	Scanner sc=new Scanner(System.in);
	List<ContactBean> l=new ArrayList<ContactBean>();
	FileReader file=null;
	Properties prop=null;
public ContactDaoImpl() {
	
	try {
		file = new FileReader("dbb.properties");
		prop = new Properties();
		prop.load(file);
		Class.forName(prop.getProperty("dbclass"));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	@Override
	public boolean add(ContactBean bean) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("addQuery"))){
			pstmt.setString(1, bean.getName());
			pstmt.setLong(2, bean.getNumber());
			pstmt.setString(3, bean.getGroup());
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}else
				return false;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean delete(String name) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("deleteQuery"))){
			pstmt.setString(1,name);
			//pstmt.setLong(2, arg1);
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}else
				return false;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean edit(String name,long number) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("updateQuery"))){
			pstmt.setLong(1, number);
			pstmt.setString(2, name);
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}else
				return false;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		return false;
	}

	@Override
	public List<ContactBean> getAllContacts() {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				Statement pstmt = conn.createStatement();
				ResultSet rs = pstmt.executeQuery(prop.getProperty("getcustomer"))){
			while(rs.next()) {
				ContactBean c=new ContactBean();
				c.setName(rs.getString(1));
				c.setNumber(rs.getLong(2));
				l.add(c);				}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return l;
}
	@Override
	public boolean search(String name) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("search"))){
			pstmt.setString(1, name);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
			return true;	
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
	

