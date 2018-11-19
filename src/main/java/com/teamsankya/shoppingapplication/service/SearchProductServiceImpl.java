package com.teamsankya.shoppingapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.teamsankya.shoppingapplication.dao.SearchProductDaoImpl;
import com.teamsankya.shoppingapplication.dto.ProductDto;



public class SearchProductServiceImpl implements SearchProductService {

	@Autowired(required=true)
	@Qualifier("dao")
	private SearchProductDaoImpl daoImpl;
	
	@Override
	public List<ProductDto> searchProduct(String pName) {
	
		List<ProductDto> dto=daoImpl.searchProduct(pName);

		return dto;
	}
	

}
