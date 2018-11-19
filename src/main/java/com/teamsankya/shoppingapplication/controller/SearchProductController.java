package com.teamsankya.shoppingapplication.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.teamsankya.shoppingapplication.dao.SearchProductDaoImpl;
import com.teamsankya.shoppingapplication.dto.ProductDto;


@Controller
public class SearchProductController {
	
/*	@Autowired(required=true)
	@Qualifier("service")
	private SearchProductServiceImpl serviceImpl;*/
	
	@Autowired
	private SearchProductDaoImpl daoImpl;
	
	public SearchProductController() {
	}
	
	
	final Logger LOGGER = Logger.getLogger(SearchProductController.class);
	
	@RequestMapping(method=RequestMethod.GET,path="getproduct")
	public ModelAndView searchProduct(@RequestParam("product")String pName) {
		LOGGER.info("product name: " +pName);
            List<ProductDto>    dto=  daoImpl.searchProduct(pName);
            if(dto!=null) {
            String pname=null;
            for (ProductDto productDto : dto) {
			pname=productDto.getpName();
			System.out.println(pname);
			}
		   return new ModelAndView("productlist", "msg",dto);
	}else {
		return new ModelAndView("failure","msg","no result found");
	}
	}
}
