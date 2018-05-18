package com.suraj.utils;

import java.util.Map;

import com.suraj.arrayprgms.ArrayUtils;

public class Application {

	public static void main(String[] args) {
		/*Map<Character,Double> countMap = StringUtils.getCharacterCount("suraajjj");
		
		countMap.entrySet().stream().forEach(x-> {
			System.out.println("Character/Count : " + x.getKey() + "/" + x.getValue());
		});*/
		
		int arr[] = ArrayUtils.shiftArray(new int[] {5,4,7,8,1},2);
		
		for(int i:arr)
		{
			System.out.println(i);
		}
		
	}

}
