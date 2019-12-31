package com.zhangzhaoyang.senior1.week1.bean;

public class Brand {
	
	private Integer bid;
	
	private String bname;

	@Override
	public String toString() {
		return "Brand [bid=" + bid + ", bname=" + bname + "]";
	}

	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Brand(Integer bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

}
