package com.w77996.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.w77996.ssm.bean.TestBook;
import com.w77996.ssm.dao.TestBookDao;

@Service("testBookService")
public class TestBookServiceImpl implements TestBookService{

	@Autowired
	TestBookDao testBookDao;
	
	public TestBook findById(String id) {
		return testBookDao.findById(id);
	}

}
