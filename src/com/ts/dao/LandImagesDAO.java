package com.ts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ts.dbutility.DBConnection;
import bvrit.LandImages;


public class LandImagesDAO {
public LandImages getLandImages(){
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rst = null;
	LandImages landimages=null;
final String SELECT_QUERY = "select * from landimages where image = ? ";
try{
	con = DBConnection.getConnection();
	pst = con.prepareStatement(SELECT_QUERY);
	rst = pst.executeQuery();
	if(rst.next()){
		 landimages=new LandImages();
		 landimages.setImage(rst.getString(2));
		 
	System.out.println(landimages);
	}
} catch (SQLException e) {
	e.printStackTrace();
}
return landimages;
}

	
	public int add(LandImages landimages){
		final String INSERT_QUERY="insert into landimages(image) values(?)";
		PreparedStatement pst = null;
		
		int status=0;
		
		try {
Connection con=DBConnection.getConnection();

			pst=con.prepareStatement(INSERT_QUERY);
			pst.setString(1, landimages.getImage());
			status=pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	


public List<LandImages> getAllLandImages(){
	List<LandImages> list=new ArrayList<>();
	
	PreparedStatement pst = null;
	ResultSet rst = null;
final String SELECT_QUERY = "select * from landimages ";
try{
	Connection con = DBConnection.getConnection();
	pst = con.prepareStatement(SELECT_QUERY);
	rst = pst.executeQuery();
	while(rst.next()){
		LandImages landimages=new LandImages();
		landimages.setImage(rst.getString(1));
		list.add(landimages);
	}
} catch (SQLException e) {
	e.printStackTrace();
}
return list;
}

public void delete() {
	Connection con=null;
	PreparedStatement pst=null;
	final String SELECT_QUERY="delete from LandImages where image=?";
	try {
		con=DBConnection.getConnection();
		pst=con.prepareStatement(SELECT_QUERY);
		//pst.setInt(1,  id);
		pst.executeUpdate();
	} catch(Exception e) {
		System.out.println(e);
	}
	
	}

public int editLandImages(LandImages landimages) {
Connection con = null;
PreparedStatement pst = null;
int x = 0;
	try {
		con = DBConnection.getConnection();
		pst = con.prepareStatement("update landimges set image= ?");
		pst.setString(1, landimages.getImage());		
		x = pst.executeUpdate();
		System.out.println("Inside Update....."+landimages);
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