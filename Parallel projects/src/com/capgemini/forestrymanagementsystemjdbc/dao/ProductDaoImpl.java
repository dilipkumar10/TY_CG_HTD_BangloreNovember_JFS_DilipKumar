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

import com.capgemini.forestrymanagementsystemjdbc.bean.ProductBean;
import com.capgemini.forestrymanagementsystemjdbc.exceptions.ProductException;

public class ProductDaoImpl implements ProductDao {
	FileReader file;
	Properties properties;
	public ProductDaoImpl(){
		try {
		file=new FileReader("db.properties");
		properties=new Properties();
		properties.load(file);
		
			Class.forName(properties.getProperty("driverClass"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("hello");
			e.printStackTrace();
		}
	}
	@Override
	public boolean addProduct(ProductBean bean) {
		try(Connection conn=DriverManager.getConnection(properties.getProperty("dbUrl"),properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(properties.getProperty("addQuery")))
		{
			pstmt.setInt(2, bean.getProductId());
			pstmt.setString(1, bean.getProductName());
			pstmt.setDouble(3, bean.getQuantity());
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
				}
		}catch(Exception e) {
			throw new ProductException("Id already exists");
		}
		return false;
		
	}

	@Override
	public boolean deleteProduct(int productId) {
		try(Connection conn=DriverManager.getConnection(properties.getProperty("dbUrl"),    properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				PreparedStatement ps=conn.prepareStatement(properties.getProperty("deleteQuery"))){
			ps.setInt(1, productId);
			int count=ps.executeUpdate();
			if(count>0) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		throw new ProductException("Id doesnot exists");
	}

	@Override
	public boolean modifyProduct(int ProductId,String productName) {
		try(Connection conn=DriverManager.getConnection(properties.getProperty("dbUrl"),    properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));PreparedStatement pst=conn.prepareStatement(properties.getProperty("modifyQuery")))
		{
			pst.setString(1,productName);
			pst.setInt(2, ProductId);
			int count=pst.executeUpdate();
			if(count>0) {
				return true;
			}
		}
			catch(Exception e) {
			e.printStackTrace();
		}
		throw new ProductException("Id doesnot exists");
	}

	@Override
	public List<ProductBean> getAllProducts() {
		 List<ProductBean> l=new ArrayList<ProductBean>();
		// TODO Auto-generated method stub
		try(Connection conn=DriverManager.getConnection(properties.getProperty("dbUrl"),    properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(properties.getProperty("getAllProducts"))){
			while(rs.next()) {
				ProductBean p=new ProductBean();
				p.setProductId(rs.getInt(2));
				p.setProductName(rs.getString(1));
				l.add(p);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	return l;
	}
	@Override
	public boolean modifyprodquantity(int productId, double productQuantity) {
		try(Connection conn=DriverManager.getConnection(properties.getProperty("dbUrl"),    properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));PreparedStatement pst=conn.prepareStatement(properties.getProperty("modifyQuery1")))
		{
			pst.setDouble(1,productQuantity);
			pst.setInt(2, productId);
			int count=pst.executeUpdate();
			if(count>0) {
				return true;
			}
		}
			catch(Exception e) {
			e.printStackTrace();
		}
		throw new ProductException("Id doesnot exists");
	}
	public ProductBean searchProduct(int product_id) {
		// TODO Auto-generated method stub
	 
		try(Connection con = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("dbUser"),
				properties.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(properties.getProperty("searchproduct")))
		{
			pstmt.setInt(1, product_id);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				ProductBean pro=new ProductBean();
				pro.setProductId(rs.getInt(2));
				pro.setProductName(rs.getString(1));
				pro.setQuantity(rs.getDouble(3));
				return pro;
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		throw new ProductException("productId does not exists");
	}
	
	

}
