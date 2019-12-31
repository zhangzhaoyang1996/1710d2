package com.zhangzhaoyang.senior1.week1.bean;

public class Goods {
	
	private Integer gid;
	
	private String gname;
	
	private Integer size;
	
	private Double price;
	
	private Integer num;
	
	private String meett;
	
	private String phone;
	
	private Brand bid;
	
	private GoodsKind kid;
	
	private String gengName;

	public Goods(Integer gid, String gname, Integer size, Double price, Integer num, String meett, String phone,
			Brand bid, GoodsKind kid, String gengName) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.size = size;
		this.price = price;
		this.num = num;
		this.meett = meett;
		this.phone = phone;
		this.bid = bid;
		this.kid = kid;
		this.gengName = gengName;
	}

	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", size=" + size + ", price=" + price + ", num=" + num
				+ ", meett=" + meett + ", phone=" + phone + ", bid=" + bid + ", kid=" + kid + ", gengName=" + gengName
				+ "]";
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getGengName() {
		return gengName;
	}

	public void setGengName(String gengName) {
		this.gengName = gengName;
	}

	public Integer getGid() {
		return gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getMeett() {
		return meett;
	}

	public void setMeett(String meett) {
		this.meett = meett;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Brand getBid() {
		return bid;
	}

	public void setBid(Brand bid) {
		this.bid = bid;
	}

	public GoodsKind getKid() {
		return kid;
	}

	public void setKid(GoodsKind kid) {
		this.kid = kid;
	}

}
