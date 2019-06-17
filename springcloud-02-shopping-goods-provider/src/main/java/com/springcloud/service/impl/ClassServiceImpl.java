package com.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcloud.dao.Class1Mapper;
import com.springcloud.dao.Class2Mapper;
import com.springcloud.entity.Class1;
import com.springcloud.entity.Class2;
import com.springcloud.service.ClassService;

/**
 * 用于实现一级类别与二级类别模块的方法
 * 
 * @author hong
 *
 */
@Service
public class ClassServiceImpl implements ClassService {

	@Autowired
	private Class1Mapper class1Mappper;

	@Autowired
	private Class2Mapper class2Mappper;

	@Override
	public List<Class1> selectAllClass1() {
		return this.class1Mappper.selectAll();
	}

	@Override
	public List<Class2> selectClass2ByClass1Id(Integer class1Id) {
		return this.class2Mappper.selectByClass1Id(class1Id);
	}

}
