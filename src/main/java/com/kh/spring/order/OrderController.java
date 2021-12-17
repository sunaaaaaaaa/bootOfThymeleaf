package com.kh.spring.order;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("order")
@RequiredArgsConstructor
public class OrderController {
	
	private static OrderService orderService; 
	
	@GetMapping("order-form")
	public void orderForm(){
	}
	
	@PostMapping("order")
	public String orderFood(@RequestParam(value="food",required=false)Optional<List<String>> foods, Model model){
		
		//null일때의 에러도 같이
		Map<String,Object> foodList =orderService.order(foods.orElse(List.of()));
		
		model.addAllAttributes(foodList);
		  
		return "order/receipt";
	}
	
	
}
