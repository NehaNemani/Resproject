package com.java.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MenuDAO {
	Connection connection;
	PreparedStatement pst;


	public List<Menu> showMenu(int resturantid)  throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Menu where resturantid=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, resturantid);
		ResultSet rs = pst.executeQuery();
		List<Menu> menuList = new ArrayList<Menu>();
		Menu menu = null; 
		while(rs.next()) {
			menu = new Menu();
		    menu.setMenuid(rs.getInt("menuid"));
			menu.setResturantid(rs.getInt("resturantid"));
			menu.setItemname(rs.getString("itemname"));
			menu.setMenutype(rs.getString("menutype"));
			menu.setCalories(rs.getInt("calories"));
			menu.setPrice(rs.getInt("price"));
			menuList.add(menu);
		}
		return menuList;
	}
	
	public Menu showMenuById(int menuid) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Menu where menuid=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, menuid);
		ResultSet rs = pst.executeQuery();
		Menu menu = null;
		if (rs.next()) {
			    menu = new Menu();
			    menu.setMenuid(rs.getInt("menuid"));
				menu.setResturantid(rs.getInt("resturantid"));
				menu.setItemname(rs.getString("itemname"));
				menu.setMenutype(rs.getString("menutype"));
				menu.setCalories(rs.getInt("calories"));
				menu.setPrice(rs.getInt("price"));
				
				
		}
		return menu;
	
    }
	public Menu searchMenu(int menuId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from menu where menuid=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, menuId);
		ResultSet rs = pst.executeQuery();
		Menu menu = null;
		if(rs.next()) {
			menu = new Menu();
			menu.setMenuid(rs.getInt("menuid"));
			menu.setResturantid(rs.getInt("restaurantid"));
			menu.setItemname(rs.getString("itemname"));
			menu.setMenutype(rs.getString("menutype"));
			menu.setCalories(rs.getInt("calories"));
			menu.setPrice(rs.getInt("Price"));
		}
		return menu;
		
	}

	
}

 