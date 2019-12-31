package com.zhangzhaoyang.senior1.week1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangzhaoyang.senior1.week1.bean.Brand;
import com.zhangzhaoyang.senior1.week1.bean.Goods;
import com.zhangzhaoyang.senior1.week1.bean.GoodsKind;
import com.zhangzhaoyang.senior1.week1.dao.GoodsDao;
import com.zhangzhaoyang.senior1.week1.service.GoodsService;
import com.zhangzhaoyang.senior1.week1.vo.GoodsVO;
@Service
public class GoodsServiceImpl implements GoodsService{
	
	@Autowired
	private GoodsDao dao;

	@Override
	public List<Goods> list(GoodsVO vo) {
		// TODO Auto-generated method stub
		return dao.list(vo);
	}

	@Override
	public boolean del(String gid) {
		int count = dao.del(gid);
		if (count>0) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public Brand toAddBrand() {
		// TODO Auto-generated method stub
		return dao.toAddBrand();
	}

	@Override
	public GoodsKind toAddKind() {
		// TODO Auto-generated method stub
		return dao.toAddKind();
	}



}
