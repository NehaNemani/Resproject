package com.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResturantDao {
	Connection connection;
	PreparedStatement pst;

	public List<Resturant> showResturant()throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Resturant";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Resturant> resturantList = new ArrayList<Resturant>();
		Resturant resturant = null; 
		while(rs.next()) {
		    resturant = new Resturant();
			resturant.setResturantId(rs.getInt("resturantid"));
			resturant.setResturantName(rs.getString("resturantname"));
			resturant.setCity(rs.getString("city"));
			resturant.setBranch(rs.getString("branch"));
			resturant.setEmail(rs.getString("email"));
			resturant.setContact(rs.getInt("contact"));
			resturantList.add(resturant);
		}
		return resturantList;
	}
	
	public Resturant searchResturant(int resturantid)throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Resturant where resturantid=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, resturantid);
		ResultSet rs = pst.executeQuery();
		Resturant resturant = null;
		if (rs.next()) {
			    resturant = new Resturant();
				resturant.setResturantId(rs.getInt("resturantid"));
				resturant.setResturantName(rs.getString("resturantname"));
				resturant.setCity(rs.getString("city"));
				resturant.setBranch(rs.getString("branch"));
				resturant.setEmail(rs.getString("email"));
				resturant.setContact(rs.getInt("contact"));
				
		}
		return resturant;
	
    }
}
 