package com.capgemini.jdbc.dao;

import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.jdbc.bean.UserBean;
import com.mysql.jdbc.Connection;

public class UserDaoimpl implements UserDao {
	FileReader reader;
	Properties prop;
	UserBean user;

	public UserDaoimpl() {
		try {

			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<UserBean> getAllUsers() {
		List<UserBean> list = new ArrayList<UserBean>();
		try (java.sql.Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"), prop.getProperty("dbPassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query1"))) {
			while (rs.next()) {
				user = new UserBean();
				user.setUserid(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setEmail(rs.getString(3));
				list.add(user);
			}
			// return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public UserBean userLogin(String username, String password) {
		UserBean user = new UserBean();
		try (java.sql.Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"), prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("Userlogin"))) {
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				user = new UserBean();
				user.setUserid(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setEmail(rs.getString(3));
			}
			return user;
		} catch (Exception e) {

		}
		return null;
	}

	@Override
	public boolean updateUser(int userid, String username, String email) {
		try (java.sql.Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"), prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("updatequery"))) {
			pstmt.setString(1, email);
			pstmt.setString(2, username);
			pstmt.setInt(3, userid);
			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			} else
				return false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean deleteUser(int userid, String password) {
		try (java.sql.Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"), prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("deleteQuery"))) {
			pstmt.setInt(1, userid);
			pstmt.setString(2, password);
			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {

		}

		return true;
	}

	@Override
	public boolean insertUser(UserBean user) {
		try (java.sql.Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"), prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("insertQuery"));) {

			pstmt.setInt(1, user.getUserid());

			pstmt.setString(2, user.getUsername());

			pstmt.setString(3, user.getEmail());

			pstmt.setString(4, user.getPassword());

			int count = pstmt.executeUpdate();
			if (count > 0) {
				System.out.println("updated");
			} else
				System.out.println("smtng wrong");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

}
