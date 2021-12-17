package com.kh.spring.food;

import lombok.Data;

@Data
public class Food {

	private String name;
	private int price;
	
	
	public static Food createFood(String e) {
		Food food = new Food();
		food.setName(e);
		
		switch (e) {
		case "치킨":food.setPrice(20000);break;
		case "피자":food.setPrice(40000);break;
		case "회":food.setPrice(18000);break;
		case "햄버거":food.setPrice(5000);break;

		}
		
		return food;
	}
	
	
}
