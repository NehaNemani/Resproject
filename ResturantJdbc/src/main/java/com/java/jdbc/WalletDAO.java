package com.java.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WalletDAO {
	Connection connection;
	PreparedStatement pst;

	public List<Wallet> showWallet()throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Wallet";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Wallet> walletList = new ArrayList<Wallet>();
		Wallet wallet = null; 
		while(rs.next()) {
			wallet = new Wallet();
			wallet.setWalletid(rs.getInt("walletId"));
			wallet.setCustomerid(rs.getInt("customerid"));
			wallet.setWallettype(rs.getString("wallettype"));
			wallet.setAmount(rs.getInt("amount"));
			
			walletList.add(wallet);
		}
		return walletList;
	}
	public String deductBalance(int walletId, int billAmount) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "update wallet set amount=amount-? where walletId=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, billAmount);
		pst.setInt(2, walletId);
		pst.executeUpdate();
		return "Amount Deducted...";
	}
	public Wallet searchByWalletId(int walletId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from wallet where walletid=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, walletId);
		ResultSet rs = pst.executeQuery();
		Wallet wallet = null;
		if(rs.next()) {
			wallet = new Wallet();
			wallet.setWalletid(rs.getInt("walletid"));
			wallet.setCustomerid(rs.getInt("customerid"));
			wallet.setWallettype(rs.getString("wallettype"));
			wallet.setAmount(rs.getInt("amount"));
		}
		return wallet;
	
    }
	public Wallet searchWallet(int walletid) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Wallet> searchByCustomer1Id(int customerid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
