package com.teamsankya.shoppingapplication.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;


import com.teamsankya.shoppingapplication.dto.ProductDto;



public class SearchProductDaoImpl implements SearchProductDao {

	@Autowired
	private SessionFactory sessionFactory;

	public SearchProductDaoImpl() {
	}

	
	public List<ProductDto> searchProduct(String pName) {
	String qry = "from ProductDto  where pName='"+pName+"'";
		Session session = sessionFactory.openSession();
		System.out.println(session);
		Query query = session.createQuery(qry);
		List<ProductDto> dto = query.list();
		return dto;
	}
}

