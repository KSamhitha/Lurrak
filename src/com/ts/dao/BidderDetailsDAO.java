package com.ts.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ts.dbutility.DBConnection;

import bvrit.BidderDetails;


public class BidderDetailsDAO {
	public BidderDetails getBiddderDetails(){
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rst = null;
		BidderDetails bidderdetails=null;
	final String SELECT_QUERY = "select * from bidderdetails where price = ? , status = ? ";
			try{
		con = DBConnection.getConnection();
		pst = con.prepareStatement(SELECT_QUERY);
		rst = pst.executeQuery();
		if(rst.next()){
			 bidderdetails=new BidderDetails();
			 bidderdetails.setPrice(rst.getInt(1));
			 bidderdetails.setStatus(rst.getString(2));
			 
		System.out.println(bidderdetails);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return bidderdetails;
	}


public int add(BidderDetails bidderdetails){
	final String INSERT_QUERY="insert into bidderdetails(price,status) values(?,?)";
	PreparedStatement pst = null;
	
	int status=0;
	
	try {
Connection con=DBConnection.getConnection();

		pst=con.prepareStatement(INSERT_QUERY);
		pst.setInt(1, bidderdetails.getPrice());
		pst.setString(2, bidderdetails.getStatus());
		status=pst.executeUpdate();
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return status;
}


public BidderDetails getBidderDetails(int price,String status){

PreparedStatement pst = null;
ResultSet rst = null;
BidderDetails bidderdetails=null;
final String SELECT_QUERY = "select * from bidderdetails where price = ? and status = ?";
try(Connection con = DBConnection.getConnection();){

pst = con.prepareStatement(SELECT_QUERY);
pst.setInt(1, price);
pst.setString(2, status);
rst = pst.executeQuery();
if(rst.next()){
	 bidderdetails=new BidderDetails();
	 bidderdetails.setPrice(rst.getInt(1));
	 bidderdetails.setStatus(rst.getString(2));
	 
System.out.println(bidderdetails);
}
} catch (SQLException e) {
e.printStackTrace();
}
return bidderdetails;
}


public List<BidderDetails> getAllBidderDetails(){
List<BidderDetails> list=new ArrayList<>();

PreparedStatement pst = null;
ResultSet rst = null;
final String SELECT_QUERY = "select * from bidderdetails ";
try{
Connection con = DBConnection.getConnection();
pst = con.prepareStatement(SELECT_QUERY);
rst = pst.executeQuery();
while(rst.next()){
	BidderDetails bidderdetails=new BidderDetails();
	bidderdetails.setPrice(rst.getInt(1));
	bidderdetails.setStatus(rst.getString(2));
	
	list.add(bidderdetails);
}
} catch (SQLException e) {
e.printStackTrace();
}
return list;
}

public void delete() {
	Connection con=null;
	PreparedStatement pst=null;
	final String SELECT_QUERY="delete from BidderDetails where price=? and status=?";
	try {
		con=DBConnection.getConnection();
		pst=con.prepareStatement(SELECT_QUERY);
		//pst.setInt(1,  id);
		pst.executeUpdate();
	} catch(Exception e) {
		System.out.println(e);
	}
	
	}


public int editBidderDetails(BidderDetails bidderdetails) {
Connection con = null;
PreparedStatement pst = null;
int x = 0;
try {
	con = DBConnection.getConnection();
	pst = con.prepareStatement("update bidderdetails set status=? where price = ?");
	pst.setInt(2, bidderdetails.getPrice());
	pst.setString(1,bidderdetails.getStatus());
		
	x = pst.executeUpdate();
	System.out.println("Inside Update....."+bidderdetails);
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