package com.sitech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.sitech.bo.GuestInfoBO;

public class GuestDAOimpl implements IguestDAO {
	private static final String query="INSERT INTO guestinfo VALUES(?,?,?) ";

	DataSource ds;
	
	
	public GuestDAOimpl(DataSource ds) {
		System.out.println("GuestDAOimpl.GuestDAOimpl()--1 param con");
		this.ds = ds;
	}


	public int insert(GuestInfoBO bo) throws Exception{
		
		int count =0;
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			if(ps!=null) {
				ps.setString(1, bo.getGname());
				ps.setString(2,bo.getGaddress());
				ps.setDouble(3,bo.getBillAmount());
				
				count=ps.executeUpdate();
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return count;
		
	}
	

}
