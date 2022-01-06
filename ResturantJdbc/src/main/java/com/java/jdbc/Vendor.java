package com.java.jdbc;
public class Vendor {
	
	private int vendorid;
	private String vendorname;
	private String Vendorcity;
	private String vendoremail;
	private String vendormobile;

	private String vendorstate;

	public int getVendorid() {
		return vendorid;
	}

	public void setVendorid(int vendorid) {
		this.vendorid = vendorid;
	}

	public String getVendorname() {
		return vendorname;
	}

	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}

	public String getVendorcity() {
		return Vendorcity;
	}

	public void setVendorcity(String vendorcity) {
		Vendorcity = vendorcity;
	}

	public String getVendoremail() {
		return vendoremail;
	}

	public void setVendoremail(String vendoremail) {
		this.vendoremail = vendoremail;
	}

	public String getVendormobile() {
		return vendormobile;
	}

	public void setVendormobile(String vendormobile) {
		this.vendormobile = vendormobile;
	}

	public String getVendorstate() {
		return vendorstate;
	}

	public void setVendorstate(String vendorstate) {
		this.vendorstate = vendorstate;
	}

	@Override
	public String toString() {
		return "Vendor [vendorid=" + vendorid + ", vendorname=" + vendorname + ", Vendorcity=" + Vendorcity
				+ ", vendoremail=" + vendoremail + ", vendormobile=" + vendormobile + ", vendorstate=" + vendorstate
				+ "]";
	}
	
	
}
