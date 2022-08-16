package com.spring.pr.trial.notice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.pr.insapp.mapper.IInsappMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class InsappMapperTest {

	@Autowired IInsappMapper mapper;
	
	@Test
	public void getListTest() {
		System.out.println(mapper.getInsappList());
	}
	
	@Test
	public void getTotal() {
		System.out.println(mapper.getInsappTotal());
	}
	
	@Test 
	public void getContentTest() {
		System.out.println(mapper.getInsappContent("0번째 아이디"));
	}
	
	@Test
	public void updateTest() {
		
	}
	
	@Test
	public void deleteTest() {
		
	}
}
