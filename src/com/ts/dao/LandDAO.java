package com.ts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ts.dbutility.DBConnection;
import bvrit.Land;

public class LandDAO {
public Land getLand(int sno){
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rst = null;
	Land land=null;
final String SELECT_QUERY = "select * from land where sno = ? , surveyNo = ? , area = ? , criteria = ? , doc = ? , price = ? , city = ? , pincode = ? ";
try{
	con = DBConnection.getConnection();
	pst = con.prepareStatement(SELECT_QUERY);
	pst.setInt(1, sno);
	rst = pst.executeQuery();
	if(rst.next()){
		 land=new Land();
		 land.setSno(rst.getInt(1));
		 land.setSurveyNo(rst.getInt(2));
		 land.setArea(rst.getInt(3));
		 land.setCriteria(rst.getString(4));
		 land.setDoc(rst.getString(5));
		 land.setPrice(rst.getInt(6));
		 land.setCity(rst.getString(7));
		 land.setPincode(rst.getInt(8));
	System.out.println(land);
	}
} catch (SQLException e) {
	e.printStackTrace();
}
return land;
}

		public int add(Land land){
		final String INSERT_QUERY="insert into land(sno, surveyNo, area, criteria, doc, price, city, pincode) values(?,?,?,?,?,?,?,?)";
		PreparedStatement pst = null;
		
		int status=0;
		
		try {
Connection con=DBConnection.getConnection();

			pst=con.prepareStatement(INSERT_QUERY);
			pst.setInt(1, land.getSno());
			pst.setInt(2, land.getSurveyNo());
			pst.setInt(3, (int) land.getArea());
			pst.setString(4, land.getCriteria());
			pst.setString(5, land.getDoc());
			pst.setInt(6, land.getPrice());
			pst.setString(7, land.getCity());
			pst.setInt(8, land.getPincode());
			
			status=pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}

public List<Land> getAllLands(){
	List<Land> list=new ArrayList<>();
	
	PreparedStatement pst = null;
	ResultSet rst = null;
final String SELECT_QUERY = "select * from land ";
try{
	Connection con = DBConnection.getConnection();
	pst = con.prepareStatement(SELECT_QUERY);
	rst = pst.executeQuery();
	while(rst.next()){
		Land land=new Land();
		land.setSno(rst.getInt(1));
		land.setSurveyNo(rst.getInt(2));
		land.setArea(rst.getInt(3));
		land.setCriteria(rst.getString(4));
		land.setDoc(rst.getString(5));
		land.setPrice(rst.getInt(6));
		land.setCity(rst.getString(7));
		land.setPincode(rst.getInt(8));
		list.add(land);
	}
} catch (SQLException e) {
	e.printStackTrace();
}
return list;
}

public void delete(int sno) {
	Connection con=null;
	PreparedStatement pst=null;
	final String SELECT_QUERY="delete from Land where sno=?";
	try {
		con=DBConnection.getConnection();
		pst=con.prepareStatement(SELECT_QUERY);
		pst.setInt(1,  sno);
		pst.executeUpdate();
	} catch(Exception e) {
		System.out.println(e);
	}
	
	}

public int editLand(Land land) {
Connection con = null;
PreparedStatement pst = null;
int x = 0;
	try {
		con = DBConnection.getConnection();
		pst = con.prepareStatement("update land set surveyNo = ?, area = ?,criteria = ?, doc = ? , price = ? , city = ? , pincode = ? where sno = ?");
		pst.setInt(8, land.getSno());
		pst.setInt(1, land.getSurveyNo());
		pst.setInt(2, (int) land.getArea());
		pst.setString(3, land.getCriteria());
		pst.setString(4, land.getDoc());	
		pst.setInt(5,  land.getPrice());
		pst.setString(6,  land.getCity());
		pst.setInt(7,  land.getPincode());
		x = pst.executeUpdate();
		System.out.println("Inside Update....."+land);
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