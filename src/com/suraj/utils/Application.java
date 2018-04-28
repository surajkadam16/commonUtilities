package com.suraj.utils;

import java.util.Map;

public class Application {

	public static void main(String[] args) {
		Map<Character,Double> countMap = StringUtils.getCharacterCount("suraaj");
		
		countMap.entrySet().stream().forEach(x-> {
			System.out.println("Character/Count : " + x.getKey() + "/" + x.getValue());
		});
	}

}
