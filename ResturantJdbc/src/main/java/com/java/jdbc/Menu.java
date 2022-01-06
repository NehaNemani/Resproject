package com.java.jdbc;

public class Menu {
	private int menuid;
	private int resturantid;
	
	private String  itemname;
	private String menutype;
	private int calories;
	private int price;
	public int getMenuid() {
		return menuid;
	}
	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}
	public int getResturantid() {
		return resturantid;
	}
	public void setResturantid(int resturantid) {
		this.resturantid = resturantid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getMenutype() {
		return menutype;
	}
	public void setMenutype(String menutype) {
		this.menutype = menutype;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Menu [menuid=" + menuid + ", resturantid=" + resturantid + ", itemname=" + itemname + ", menutype="
				+ menutype + ", calories=" + calories + ", price=" + price + "]";
	}
	
	

}
