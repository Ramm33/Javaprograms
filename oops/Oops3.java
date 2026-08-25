package com.oops;

 class Product {

	private int pid;
	private String pname;
	private double price;

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getPid() {
		return pid;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPname() {
		return pname;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		if (price > 0) {
			return price;
		} else {
			System.out.println("Invalid Price");
			return 0;
		}
	}
}