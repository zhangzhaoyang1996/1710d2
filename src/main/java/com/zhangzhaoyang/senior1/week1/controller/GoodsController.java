package com.zhangzhaoyang.senior1.week1.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangzhaoyang.senior1.week1.bean.Brand;
import com.zhangzhaoyang.senior1.week1.bean.Goods;
import com.zhangzhaoyang.senior1.week1.bean.GoodsKind;
import com.zhangzhaoyang.senior1.week1.service.GoodsService;
import com.zhangzhaoyang.senior1.week1.vo.GoodsVO;

@Controller
public class GoodsController {
	
	@Autowired
	private GoodsService service;
	
	@RequestMapping("list.do")
	public String list(Model m,GoodsVO vo) {
		
		if (vo.getPageNum()==null) {
			
			vo.setPageNum(1);
		}
		
		PageHelper.startPage(vo.getPageNum(),2);
		
		List<Goods> list = service.list(vo);
		for (Goods goods : list) {
			System.err.println(goods.toString());
		}
		
		PageInfo<Goods> page = new PageInfo<Goods>(list);
		
		m.addAttribute("page",page);
		
		m.addAttribute("list",list);
		
		m.addAttribute("vo",vo);
		
		return "list";
	}
	
	@ResponseBody
	@RequestMapping("del.do")
	public Object del(String gid) {
		boolean flag = service.del(gid);
		return flag;
	}
	
	
	@RequestMapping("toAdd.do")
	public String toAdd(Model m,Goods goods) {
		Brand brand = service.toAddBrand();
		GoodsKind kind = service.toAddKind();
		m.addAttribute("brand",brand);
		m.addAttribute("kind",kind);
		m.addAttribute("goods",goods);
		return "add.jsp";
	}
	
	@RequestMapping("add.do")
	public String add(Model m,@Validated @RequestAttribute("goods") Goods goods,BindingResult br,MultipartFile myFile,HttpServletRequest request) {
		if (br==null) {
			Brand brand = service.toAddBrand();
			GoodsKind kind = service.toAddKind();
			m.addAttribute("brand",brand);
			m.addAttribute("kind",kind);
			m.addAttribute("goods",goods);
			return "add.jsp";
		}
		String myName = myFile.getOriginalFilename();
		String subName = myName.substring(myName.lastIndexOf("."));
		String uuName = UUID.randomUUID().toString();
		
		return null;
		
	}
	

	
	
	
	

}
