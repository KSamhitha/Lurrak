package com.ts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ts.dbutility.DBConnection;

import bvrit.Property;

public class PropertyDAO {
public Property getProperty(){
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rst = null;
	Property property=null;
final String SELECT_QUERY = "select * from property where price = ? ";
try{
	con = DBConnection.getConnection();
	pst = con.prepareStatement(SELECT_QUERY);
	rst = pst.executeQuery();
	if(rst.next()){
		 property=new Property();
		 property.setPrice(rst.getInt(2));
		 
	System.out.println(property);
	}
} catch (SQLException e) {
	e.printStackTrace();
}
return property;
}
	public int add(Property property){
		final String INSERT_QUERY="insert into property(price) values(?)";
		PreparedStatement pst = null;
		
		int status=0;
		
		try {
Connection con=DBConnection.getConnection();

			pst=con.prepareStatement(INSERT_QUERY);
			pst.setInt(1, property.getPrice());
						
			status=pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}

public List<Property> getAllProperties(){
	List<Property> list=new ArrayList<>();
	
	PreparedStatement pst = null;
	ResultSet rst = null;
final String SELECT_QUERY = "select * from property ";
try{
	Connection con = DBConnection.getConnection();
	pst = con.prepareStatement(SELECT_QUERY);
	rst = pst.executeQuery();
	while(rst.next()){
		Property property=new Property();
		property.setPrice(rst.getInt(1));
		list.add(property);
	}
} catch (SQLException e) {
	e.printStackTrace();
}
return list;
}

public void delete() {
	Connection con=null;
	PreparedStatement pst=null;
	final String SELECT_QUERY="delete from Property where price=?";
	try {
		con=DBConnection.getConnection();
		pst=con.prepareStatement(SELECT_QUERY);
		//pst.setInt(1,  id);
		pst.executeUpdate();
	} catch(Exception e) {
		System.out.println(e);
	}
	
	}

public int editProperty(Property property) {
Connection con = null;
PreparedStatement pst = null;
int x = 0;
	try {
		con = DBConnection.getConnection();
		pst = con.prepareStatement("update property where price= ?");
		pst.setInt(1, property.getPrice());		
		x = pst.executeUpdate();
		System.out.println("Inside Update....."+property);
	} catch (SQLException e) {				
		e.printStackTrace();
	}	
	finally{
		try {
			con.close();
		} catch (SQLException e) {				
			e.printStackTrace();
		}
	}
	return x;
}
}