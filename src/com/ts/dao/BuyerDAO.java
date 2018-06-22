package com.ts.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ts.dbutility.DBConnection;

import bvrit.Buyer;
public class BuyerDAO {
	public Buyer getBuyer(int id){
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rst = null;
		Buyer buyer=null;
	final String SELECT_QUERY = "select * from buyer where id = ? , name = ? , email = ? , password = ? , phone = ?, houseno = ? ,colony = ? , city = ? and pincode = ?";
			try{
		con = DBConnection.getConnection();
		pst = con.prepareStatement(SELECT_QUERY);
		pst.setInt(1, id);
			
 rst = pst.executeQuery();
		if(rst.next()){
			 buyer=new Buyer();
			 buyer.setId(rst.getInt(1));
			 buyer.setName(rst.getString(2));
			 buyer.setEmail(rst.getString(3));
			 buyer.setPassword(rst.getString(4));
			 buyer.setPhone(rst.getInt(5));
			 buyer.setHouseNo(rst.getInt(6));
			 buyer.setColony(rst.getString(7));
			 buyer.setCity(rst.getString(8));
			 buyer.setPincode(rst.getInt(9));
		System.out.println(buyer);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return buyer;
	}
	public int add(Buyer buyer){
		final String INSERT_QUERY="insert into buyer(id,name,email,password,phone,houseNo,colony,city,pincode) values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst = null;
		
		int status=0;
		
		try {
Connection con=DBConnection.getConnection();

			pst=con.prepareStatement(INSERT_QUERY);
			pst.setInt(1, buyer.getId());
			pst.setString(2, buyer.getName());
			pst.setString(3, buyer.getEmail());
			pst.setString(4, buyer.getPassword());
			pst.setInt(5, buyer.getPhone());
			pst.setInt(6, buyer.getHouseNo());
			pst.setString(7, buyer.getColony());
			pst.setString(8, buyer.getCity());
			pst.setInt(9, buyer.getPincode());
			status=pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	
public Buyer getBuyer(int id,String name,String email,String password,int phone,int houseno,String colony,String city,int pincode){
	
	PreparedStatement pst = null;
	ResultSet rst = null;
	Buyer buyer=null;
final String SELECT_QUERY = "select * from buyer where id = ? , name = ?,email = ?, password = ?,phone = ?,houseno = ?,colony = ?,city = ?,pincode = ?)";
try(Connection con = DBConnection.getConnection();){
	
	pst = con.prepareStatement(SELECT_QUERY);
	pst.setInt(1, id);
	pst.setString(2, name);
	pst.setString(3, email);
	pst.setString(4, password);
	pst.setInt(5, phone);
	pst.setInt(6, houseno);
	pst.setString(7, colony);
	pst.setString(8, city);
	pst.setInt(9, pincode);
	rst = pst.executeQuery();
	if(rst.next()){
		 buyer=new Buyer();
		 buyer.setId(rst.getInt(1));
		 buyer.setName(rst.getString(2));
		 buyer.setEmail(rst.getString(3));
		 buyer.setPassword(rst.getString(4));
		 buyer.setPhone(rst.getInt(5));
		 buyer.setHouseNo(rst.getInt(6));
		 buyer.setColony(rst.getString(7));
		 buyer.setCity(rst.getString(8));
		 buyer.setPincode(rst.getInt(9));
		
	System.out.println(buyer);
	}
} catch (SQLException e) {
	e.printStackTrace();
}
return buyer;
}


public List<Buyer> getAllBuyer(){
	List<Buyer> list=new ArrayList<>();
	
	PreparedStatement pst = null;
	ResultSet rst = null;
final String SELECT_QUERY = "select * from buyer ";
try{
	Connection con = DBConnection.getConnection();
	pst = con.prepareStatement(SELECT_QUERY);
	rst = pst.executeQuery();
	while(rst.next()){
		Buyer buyer=new Buyer();
		buyer.setId(rst.getInt(1));
		buyer.setName(rst.getString(2));
		buyer.setEmail(rst.getString(3));
		buyer.setPassword(rst.getString(4));
		buyer.setPhone(rst.getInt(5));
		buyer.setHouseNo(rst.getInt(6));
		buyer.setColony(rst.getString(7));
		buyer.setCity(rst.getString(8));
		buyer.setPincode(rst.getInt(9));
		
		list.add(buyer);
	}
} catch (SQLException e) {
	e.printStackTrace();
}
return list;
}

public void delete(int id) {
	Connection con=null;
	PreparedStatement pst=null;
	final String SELECT_QUERY="delete from Buyer where id=?";
	try {
		con=DBConnection.getConnection();
		pst=con.prepareStatement(SELECT_QUERY);
		pst.setInt(1,  id);
		pst.executeUpdate();
	} catch(Exception e) {
		System.out.println(e);
	}
	
	}

public int editBuyer(Buyer buyer) {
Connection con = null;
PreparedStatement pst = null;
int x = 0;
	try {
		con = DBConnection.getConnection();
		pst = con.prepareStatement("update buyer set name= ?, email = ?,password=?,phone=?,houseNo = ?,colony = ?,city = ?,pincode = ? where id = ?");
		
		pst.setInt(9, buyer.getId());
		pst.setString(1, buyer.getName());
		pst.setString(2, buyer.getEmail());
		pst.setString(3, buyer.getPassword());
		pst.setInt(4, buyer.getPhone());
		pst.setInt(5, buyer.getHouseNo());
		pst.setString(6, buyer.getColony());
		pst.setString(7, buyer.getCity());
		pst.setInt(8, buyer.getPincode());
				
		x = pst.executeUpdate();
		System.out.println("Inside Update....."+buyer);
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




