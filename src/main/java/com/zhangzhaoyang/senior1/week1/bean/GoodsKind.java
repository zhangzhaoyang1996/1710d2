package com.zhangzhaoyang.senior1.week1.bean;

public class GoodsKind {
	
	private Integer kid;
	
	private String ktype;

	public GoodsKind() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GoodsKind [kid=" + kid + ", ktype=" + ktype + "]";
	}

	public GoodsKind(Integer kid, String ktype) {
		super();
		this.kid = kid;
		this.ktype = ktype;
	}

	public Integer getKid() {
		return kid;
	}

	public void setKid(Integer kid) {
		this.kid = kid;
	}

	public String getKtype() {
		return ktype;
	}

	public void setKtype(String ktype) {
		this.ktype = ktype;
	}

}
