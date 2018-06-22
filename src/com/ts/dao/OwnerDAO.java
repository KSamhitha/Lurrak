package com.ts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ts.dbutility.DBConnection;

import bvrit.Owner;

public class OwnerDAO {
public Owner getOwner(int id){
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rst = null;
	Owner owner=null;
final String SELECT_QUERY = "select * from owner where id = ? , name = ? , email = ? , password = ? , phone = ? , houseNo = ? , colony = ? , city = ? and pincode = ?";
try{
	con = DBConnection.getConnection();
	pst = con.prepareStatement(SELECT_QUERY);
	pst.setInt(1, id);
	rst = pst.executeQuery();
	if(rst.next()){
		 owner=new Owner();
		 owner.setId(rst.getInt(1));
		 owner.setName(rst.getString(2));
		 owner.setEmail(rst.getString(3));
		 owner.setPassword(rst.getString(4));
		 owner.setPhone(rst.getInt(5));
		 owner.setHouseNo(rst.getInt(6));
		 owner.setColony(rst.getString(7));
		 owner.setCity(rst.getString(8));
		 owner.setPincode(rst.getInt(9));
	System.out.println(owner);
	}
} catch (SQLException e) {
	e.printStackTrace();
}
return owner;
}

	public int add(Owner owner){
		final String INSERT_QUERY="insert into owner(id, name, email, password, phone, houseNo, colony, city, pincode) values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst = null;
		
		int status=0;
		
		try {
Connection con=DBConnection.getConnection();

			pst=con.prepareStatement(INSERT_QUERY);
			pst.setInt(1, owner.getId());
			pst.setString(2, owner.getName());
			pst.setString(3, owner.getEmail());
			pst.setString(4, owner.getPassword());
			pst.setInt(5,  owner.getPhone());
			pst.setInt(6,  owner.getHouseNo());
			pst.setString(7,  owner.getColony());
			pst.setString(8,  owner.getCity());
			pst.setInt(9,  owner.getPincode());
			
			
			status=pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	


public List<Owner> getAllOwners(){
	List<Owner> list=new ArrayList<>();
	
	PreparedStatement pst = null;
	ResultSet rst = null;
final String SELECT_QUERY = "select * from owner ";
try{
	Connection con = DBConnection.getConnection();
	pst = con.prepareStatement(SELECT_QUERY);
	rst = pst.executeQuery();
	while(rst.next()){
		Owner owner=new Owner();
		owner.setId(rst.getInt(1));
		owner.setName(rst.getString(2));
		owner.setEmail(rst.getString(3));
		owner.setPassword(rst.getString(4));
		owner.setPhone(rst.getInt(5));
		owner.setHouseNo(rst.getInt(6));
		owner.setColony(rst.getString(7));
		owner.setCity(rst.getString(8));
		owner.setPincode(rst.getInt(9));
		
		list.add(owner);
	}
} catch (SQLException e) {
	e.printStackTrace();
}
return list;
}

public void delete(int id) {
	Connection con=null;
	PreparedStatement pst=null;
	final String SELECT_QUERY="delete from Owner where id=?";
	try {
		con=DBConnection.getConnection();
		pst=con.prepareStatement(SELECT_QUERY);
		pst.setInt(1,  id);
		pst.executeUpdate();
	} catch(Exception e) {
		System.out.println(e);
	}
	
	}

public int editOwner(Owner owner) {
Connection con = null;
PreparedStatement pst = null;
int x = 0;
	try {
		con = DBConnection.getConnection();
		pst = con.prepareStatement("update owner set name= ?, email= ?, password=? , phone=?, houseNo=?, colony=?, city=?, pincode=? where id = ?");
		pst.setInt(9, owner.getId());
		pst.setString(1, owner.getName());
		pst.setString(2, owner.getEmail());
		pst.setString(3, owner.getPassword());
		pst.setInt(4, owner.getPhone());	
		pst.setInt(5,  owner.getHouseNo());
		pst.setString(6, owner.getColony());
		pst.setString(7,  owner.getCity());
		pst.setInt(8,  owner.getPincode());
		x = pst.executeUpdate();
		System.out.println("Inside Update....."+owner);
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