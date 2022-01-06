package com.java.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Customer1DAO {
	Connection connection;
	PreparedStatement pst;

	public List<Customer1> showCustomer1()throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Customer";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Customer1> customer1List = new ArrayList<Customer1>();
		Customer1 customer1 = null; 
		while(rs.next()) {
			customer1 = new Customer1();
			customer1.setCustomerid(rs.getInt("customerid"));
			customer1.setCustomername(rs.getString("customername"));
			customer1.setCustomerstate(rs.getString("customerstate"));
			customer1.setCustomercity(rs.getString("customercity"));
			customer1.setCustomeremail(rs.getString("customeremail"));
			customer1.setCustomermobile(rs.getString("customermobile"));
			customer1List.add(customer1);
		}
		return customer1List;
	}
	public Customer1 searchcustomer1(int customerid)throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Customer1 where customerid=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, customerid);
		ResultSet rs = pst.executeQuery();
		Customer1 customer1 = null;
		if (rs.next()) {
			customer1 = new Customer1();
			customer1.setCustomerid(rs.getInt("customerid"));
			customer1.setCustomername(rs.getString("customername"));
			customer1.setCustomerstate(rs.getString("customerstate"));
			customer1.setCustomercity(rs.getString("customercity"));
			customer1.setCustomeremail(rs.getString("customeremail"));
			customer1.setCustomermobile(rs.getString("customermobile"));
				
		}
		return customer1;
	
    }

}
