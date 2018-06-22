package com.ts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.ts.dbutility.DBConnection;
import bvrit.LandCategory;

public class LandCategoryDAO {
public LandCategory getLandCategory(int no){
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rst = null;
	LandCategory landcategory=null;
final String SELECT_QUERY = "select * from landcategory where no = ? , type = ?";
try{
	con = DBConnection.getConnection();
	pst = con.prepareStatement(SELECT_QUERY);
	pst.setInt(1, no);
	rst = pst.executeQuery();
	if(rst.next()){
		 landcategory=new LandCategory();
		 landcategory.setNo(rst.getInt(1));
		 landcategory.setType(rst.getString(2));

	System.out.println(landcategory);
	}
} catch (SQLException e) {
	e.printStackTrace();
}
return landcategory;
}
	
	
	public int add(LandCategory landcategory){
		final String INSERT_QUERY="insert into landcategory(no,type) values(?,?)";
		PreparedStatement pst = null;
		
		int status=0;
		
		try {
Connection con=DBConnection.getConnection();

			pst=con.prepareStatement(INSERT_QUERY);
			pst.setInt(1, landcategory.getNo());
			pst.setString(2, landcategory.getType());
			
			status=pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
public List<LandCategory> getAllLandCategories(){
	List<LandCategory> list=new ArrayList<>();
	
	PreparedStatement pst = null;
	ResultSet rst = null;
final String SELECT_QUERY = "select * from landcategory ";
try{
	Connection con = DBConnection.getConnection();
	pst = con.prepareStatement(SELECT_QUERY);
	rst = pst.executeQuery();
	while(rst.next()){
		LandCategory landcategory=new LandCategory();
		landcategory.setNo(rst.getInt(1));
		landcategory.setType(rst.getString(2));
		list.add(landcategory);
	}
} catch (SQLException e) {
	e.printStackTrace();
}
return list;
}

public void delete(int no) {
	Connection con=null;
	PreparedStatement pst=null;
	final String SELECT_QUERY="delete from LandCategory where no=?";
	try {
		con=DBConnection.getConnection();
		pst=con.prepareStatement(SELECT_QUERY);
		pst.setInt(1,  no);
		pst.executeUpdate();
	} catch(Exception e) {
		System.out.println(e);
	}
	
	}

public int editLandCategory(LandCategory landcategory) {
Connection con = null;
PreparedStatement pst = null;
int x = 0;
	try {
		con = DBConnection.getConnection();
		pst = con.prepareStatement("update landcategory set type= ? where no = ?");
		pst.setInt(2, landcategory.getNo());
		pst.setString(1, landcategory.getType());
					
		x = pst.executeUpdate();
		System.out.println("Inside Update....."+landcategory);
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

