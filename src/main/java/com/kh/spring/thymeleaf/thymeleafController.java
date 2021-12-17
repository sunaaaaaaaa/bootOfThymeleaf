package com.kh.spring.thymeleaf;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kh.spring.member.Member;

@Controller
public class thymeleafController {
	
	@GetMapping("study")
	public String studyThymeleaf(Model model,HttpSession session) {
		
		//DTO
		Member member = new Member();
		member.setUserId("pclass");
		member.setPassword("1234");
		member.setEmail("www@asd.com");
		member.setGrade("일반");
		
		//Map
		Map<String,Object> commandMap = new LinkedHashMap<>();
		commandMap.put("java",100);
		commandMap.put("css",99);
		commandMap.put("html",88);
		commandMap.put("spring",77);
		commandMap.put("oracle",66);
		commandMap.put("avg",86);
		
		model.addAttribute("score",commandMap);
		model.addAttribute("color","blue");
		session.setAttribute("userInfo",member);
		
		return "thymeleaf/thymeleaf";
	}
}
