package com.w77996.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.w77996.ssm.bean.TestBook;
import com.w77996.ssm.service.TestBookService;

@Controller
public class TestBookController {

	
	public static void main(String[] args) {
		System.out.println(reverse("I love java"));
	}
	static String reverse(String str){
		String[] strs = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = strs.length-1; i >= 0; i--) {
			sb.append(strs[i]+" ");
		}
		return sb.toString();
	}
	@RequestMapping(value="/index.do")
	public String index(){
		return "index";
	}
	
	@Autowired
	TestBookService  testBookService;
	
	@RequestMapping(value="/testDubbo.do")
	public String testDubbo(Model model,
			                @RequestParam String id){
		TestBook testBook = testBookService.findById(id);
		model.addAttribute("book", testBook);
		return "testDubbo";
	}
}
