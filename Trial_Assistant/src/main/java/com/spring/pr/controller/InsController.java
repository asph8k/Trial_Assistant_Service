package com.spring.pr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.pr.ins.service.IInsService;

@Controller
@RequestMapping("/ins")
public class InsController {
	
	@Autowired
	private IInsService service;
	
	//기관 정보 목록 조회 페이지 이동 요청 처리
	@GetMapping("/insList")
	public void InsList(Model model) {
		System.out.println("기관 정보 목록 페이지 요청 들어옴!");
		model.addAttribute("inslist", service.getInsList());
	}
	
	//기관 정보 등록 페이지 이동 요청 처리
	@GetMapping("/insAdd")
	public void InsAdd() {
		System.out.println("기관 정보 등록 페이지 요청 들어옴!");
	}
	
	//기관 정보 상세보기 페이지 이동 요청 처리
	@GetMapping("/insDetail")
	public void InsDetail() {
		System.out.println("기관 정보 상세보기 페이지 요청 들어옴!");
	}

	@GetMapping("/insUpdate")
	public void InsUpdate() {
		System.out.println("기관 정보 수정 페이지 요청 들어옴!");
	}
}
