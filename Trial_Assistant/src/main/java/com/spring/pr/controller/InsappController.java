package com.spring.pr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.pr.insapp.service.IInsappService;

@Controller
@RequestMapping("/insapp")
public class InsappController {

	@Autowired
	private IInsappService service;
	
	// 기관 신청자 목록 페이지 요청 처리
	@GetMapping("/insappList")
	public void InsappList() {
		System.out.println("기관 신청자 목록 페이지 요청이 들어옴!");
	}
	
	// 기관 신청자 상세보기 요청 처리
	@GetMapping("/insappDetail")
	public void InsappDetail() {
		System.out.println("기관 신청자 상세보기 요청이 들어옴!");
	}
	
	// 기관 신청자 수정 페이지 요청 처리
	@GetMapping("/insappUpdate")
	public void InsappUpdate() {
		System.out.println("기관 신청자 수정 요청이 들어옴!");
	}
	
}
