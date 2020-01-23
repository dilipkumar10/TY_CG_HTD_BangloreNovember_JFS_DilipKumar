package com.capgemini.forestrymanagementsystemjdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.capgemini.forestrymanagementsystemjdbc.bean.LandBean;
import com.capgemini.forestrymanagementsystemjdbc.exceptions.LandException;
import com.capgemini.forestrymanagementsystemjdbc.factory.Factory;
import com.mysql.jdbc.PreparedStatement;

public class LandDaoImpl implements LandDao {
	Scanner sc = new Scanner(System.in);
	FileReader file;
	Properties properties;

	public LandDaoImpl() {
		try {
			file = new FileReader("land.properties");
			properties = new Properties();
			properties.load(file);
			Class.forName(properties.getProperty("driverClass"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean add(LandBean land) {
		try (Connection conn = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				java.sql.PreparedStatement pstmt = conn.prepareStatement(properties.getProperty("add"))) {
			pstmt.setInt(1, land.getLandId());
			pstmt.setString(2, land.getLandOwner());
			pstmt.setString(3, land.getProduct());
			pstmt.setInt(4, land.getLandSize());
			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			}
		} catch (Exception e) {
			throw new LandException("LandId already exists");
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		try (Connection conn = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				java.sql.PreparedStatement pstmt = conn.prepareStatement(properties.getProperty("delete"))) {
			pstmt.setInt(1, id);
			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
		}
		throw new LandException("Id does not exists");
	}

	@Override
	public List<LandBean> getAllLands() {
		List<LandBean> list = new ArrayList<LandBean>();
		try (Connection conn = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(properties.getProperty("getalllands"));) {
			while (rs.next()) {
				LandBean land1 = new LandBean();
				land1.setLandId(rs.getInt(1));
				land1.setLandOwner(rs.getString(2));
				land1.setLandSize(rs.getInt(4));
				land1.setProduct(rs.getString(3));
				list.add(land1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean updateName(int id, String name) {
		try (Connection conn = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				java.sql.PreparedStatement pstmt = conn.prepareStatement(properties.getProperty("updatename"))) {
			pstmt.setString(1, name);
			pstmt.setInt(2, id);
			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		throw new LandException("Id doesnot exists");
	}

	@Override
	public boolean updateSize(int id, int size) {
		try (Connection conn = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				java.sql.PreparedStatement pstmt = conn.prepareStatement(properties.getProperty("updatesize"))) {
			pstmt.setInt(1, size);
			pstmt.setInt(2, id);
			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			}
		} catch (Exception e) {
		}
		throw new LandException("Id does not exists");
	}

	@Override
	public boolean updateProduct(int id, String product) {
		try (Connection conn = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				java.sql.PreparedStatement pstmt = conn.prepareStatement(properties.getProperty("updateproduct"))) {
			pstmt.setString(1, product);
			pstmt.setInt(2, id);
			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			} 
		} catch (Exception e) {
		}
		throw new LandException("Id does not exists");
	}

}
