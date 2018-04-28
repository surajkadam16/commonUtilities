package com.suraj.utils;

import java.util.HashMap;
import java.util.Map;

public class StringUtils {
	public static Map<Character, Double> getCharacterCount(String inputString) {
		Map<Character, Double> countMap = new HashMap<>();

		for (int i = 0; i < inputString.length(); i++) {
			Character ch = inputString.charAt(i);
			if (countMap.containsKey(ch))
				countMap.put(ch, countMap.get(ch) + 1);
			else
				countMap.put(ch, 1.0);
		}

		return countMap;

	}

}
