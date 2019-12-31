package com.zhangzhaoyang.senior1.week1.service;

import java.util.List;

import com.zhangzhaoyang.senior1.week1.bean.Brand;
import com.zhangzhaoyang.senior1.week1.bean.Goods;
import com.zhangzhaoyang.senior1.week1.bean.GoodsKind;
import com.zhangzhaoyang.senior1.week1.vo.GoodsVO;

public interface GoodsService {

	List<Goods> list(GoodsVO vo);

	boolean del(String gid);

	Brand toAddBrand();

	GoodsKind toAddKind();


}
