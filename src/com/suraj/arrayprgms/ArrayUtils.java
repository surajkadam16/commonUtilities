package com.suraj.arrayprgms;

public class ArrayUtils {
	public static int[] shiftArray(int array[],int k) {
		int len = array.length;
		int pos = 0;
		int shiftedArr[] = new int[array.length];
		if(len == 1)
			return array;
		else {
			
			for(int j=0;j<k;j++)
			{
				pos = 0;
				shiftedArr[pos] = array[len - 1];
				for(int i=0;i<len-1;i++) {
					pos++;
					shiftedArr[pos] = array[i];
					
					
				}
				for(int x=0;x<shiftedArr.length;x++)
					array[x] = shiftedArr[x];
			}
		}
		
		
		
		
		return shiftedArr;
		
	}

}
