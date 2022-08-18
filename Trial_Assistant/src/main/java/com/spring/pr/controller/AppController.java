package com.spring.pr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.pr.app.service.IAppService;

@Controller
@RequestMapping("/app")
public class AppController {

	@Autowired
	private IAppService service;
	
	//등재 신청자 목록 페이지 요청 처리
	@GetMapping("/appList")
	public void AppList() {
		System.out.println("등재 신청자 목록 페이지 요청 들어옴!");
	}
	
	//등재 신청자 통번역인 상세보기 요청 처리
	@GetMapping("/appDetailTotalTras")
	public void AppDetailTotalTras() {
		System.out.println("등재 신청자 통번역인 상세보기 요청 들어옴!");
	}
	
	//등재 신청자 일반조력자 상세보기 요청 처리
	@GetMapping("/appDetailNormal")
	public void AppDetailNormal() {
		System.out.println("등재 신청자 일반조력자 상세보기 요청 들어옴!");
	}
	
	//등재 신청자 기관추천조력자 상세보기 요청 처리
	@GetMapping("/appDetailInsRecom")
	public void AppDetailInsRecom() {
		System.out.println("등재 신청자 기관추천조력자 상세보기 요청 들어옴!");
	}
	
	//등재 신청사 통번역인 수정 페이지 요청 처리
	@GetMapping("/appUpdateTotalTras")
	public void AppUpdateTotalTras() {
		System.out.println("등재 신청자 통번역인 수정 요청 들어옴!");
	}
	
	//등재 신청자 일반조력자 수정 페이지 요청 처리
	@GetMapping("/appUpdateNormal")
	public void AppUpdateNormal() {
		System.out.println("등재 신청자 일반조력자 수정 요청 들어옴!");
	}
	
	//등재 신청자 기관추천조력자 수정 페이지 요청 처리
	@GetMapping("/appUpdateInsRecom")
	public void AppUpdateRecom() {
		System.out.println("등재 신청자 기관추천조력자 수정 요청 들어옴!");
	}
}
