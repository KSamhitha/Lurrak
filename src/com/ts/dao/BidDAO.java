package com.ts.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.ts.dbutility.DBConnection;

import bvrit.Bid;

public class BidDAO {
	public Bid getBid(int no){
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rst = null;
		Bid bid=null;
	final String SELECT_QUERY = "select * from Bid where no = ? , marketPrice = ? ";
			try{
		con = DBConnection.getConnection();
		pst = con.prepareStatement(SELECT_QUERY);
		pst.setInt(1, no);

 rst = pst.executeQuery();
		if(rst.next()){
			 bid=new Bid();
			 bid.setNo(rst.getInt(1));
			 bid.setMarketPrice(rst.getInt(3));
			 
			 
		System.out.println(bid);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return bid;
	}

public int add(Bid bid){
	final String INSERT_QUERY="insert into bid(no,marketPrice) values(?,?)";
	PreparedStatement pst = null;
	
	int status=0;
	
	try {
Connection con=DBConnection.getConnection();

		pst=con.prepareStatement(INSERT_QUERY);
		pst.setInt(1, bid.getNo());
		pst.setInt(2, bid.getMarketPrice());
			
		status=pst.executeUpdate();
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return status;
}


public Bid getBid(int no ,int marketPrice){

PreparedStatement pst = null;
ResultSet rst = null;
Bid bid=null;
final String SELECT_QUERY = "select * from bid where no = ? and marketPrice = ?";
try(Connection con = DBConnection.getConnection();){

pst = con.prepareStatement(SELECT_QUERY);
pst.setInt(1, no);
pst.setInt(2, marketPrice);
rst = pst.executeQuery();
if(rst.next()){
	 bid=new Bid();
	 bid.setNo(rst.getInt(1));
	 bid.setMarketPrice(rst.getInt(2));
	 
System.out.println(bid);
}
} catch (SQLException e) {
e.printStackTrace();
}
return bid;
}


public List<Bid> getAllBid(){
List<Bid> list=new ArrayList<>();

PreparedStatement pst = null;
ResultSet rst = null;
final String SELECT_QUERY = "select * from bid ";
try{
Connection con = DBConnection.getConnection();
pst = con.prepareStatement(SELECT_QUERY);
rst = pst.executeQuery();
while(rst.next()){
	Bid bid=new Bid();
	bid.setNo(rst.getInt(1));
	bid.setMarketPrice(rst.getInt(2));
			list.add(bid);
}
} catch (SQLException e) {
e.printStackTrace();
}
return list;
}

public void delete(int no) {
	Connection con=null;
	PreparedStatement pst=null;
	final String SELECT_QUERY="delete from Bid where no=?";
	try {
		con=DBConnection.getConnection();
		pst=con.prepareStatement(SELECT_QUERY);
		pst.setInt(1,  no);
		pst.executeUpdate();
	} catch(Exception e) {
		System.out.println(e);
	}
	
	}

public int editBid(Bid bid) {
Connection con = null;
PreparedStatement pst = null;
int x = 0;
try {
	con = DBConnection.getConnection();
	pst = con.prepareStatement("update bid set no= ?, marketPrice= ?");
    pst.setInt(1, bid.getNo());
	pst.setInt(2, bid.getMarketPrice());
		
	x = pst.executeUpdate();
	System.out.println("Inside Update....."+bid);
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







