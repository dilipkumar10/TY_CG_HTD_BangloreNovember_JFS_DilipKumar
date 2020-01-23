package com.capgemini.forestrymanagementsystemjdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

import com.capgemini.forestrymanagementsystemjdbc.bean.UsersBean;
import com.capgemini.forestrymanagementsystemjdbc.exceptions.UsersException;

public class AdminDaoImpl implements AdminDao {
	Scanner sc = new Scanner(System.in);
	FileReader file;
	Properties properties;

	public AdminDaoImpl() {
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
	public boolean login(String name, String password) {
		try (Connection conn = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword")); PreparedStatement pstmt = conn.prepareStatement(properties.getProperty("login"))) {
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				return true;
			} 
		} catch (Exception e) {
		}
		throw new UsersException("Invalid credintials");
	}

	@Override
	public boolean signup(UsersBean bean) {
		try (Connection conn = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(properties.getProperty("signup"))) {
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

	public boolean delete(String name, String password) {
		try (Connection conn = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(properties.getProperty("managerdeleteQuery"))) {
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			} 
		} catch (Exception e) {
		}
		throw new UsersException("Invalid credintials");
	}

	@Override
	public boolean update(String name, String password) {
		try (Connection conn = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(properties.getProperty("managerupdateQuery"))) {
			pstmt.setString(1, password);
			pstmt.setString(2, name);
			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			} 
		} catch (Exception e) {
		}
		throw new UsersException("Invalid credintials");
	}
}
