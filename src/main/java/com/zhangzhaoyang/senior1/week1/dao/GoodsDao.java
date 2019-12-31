package com.zhangzhaoyang.senior1.week1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhangzhaoyang.senior1.week1.bean.Brand;
import com.zhangzhaoyang.senior1.week1.bean.Goods;
import com.zhangzhaoyang.senior1.week1.bean.GoodsKind;
import com.zhangzhaoyang.senior1.week1.vo.GoodsVO;

public interface GoodsDao {

	List<Goods> list(GoodsVO vo);

	int del(String gid);

	GoodsKind toAddKind();

	Brand toAddBrand();


}
