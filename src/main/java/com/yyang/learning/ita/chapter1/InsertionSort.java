package com.yyang.learning.ita.chapter1;

public class InsertionSort implements Sort {

	@Override
	public long[] sort(long[] array) {
				
		for(int i = 1; i < array.length; i++) {
			long key = array[i]; 
			int j = i - 1;
			while(j > -1 && array[j] > key) {
				array[j+1] = array[j];
				array[j] = key;
				j--;
			}
		}
		
		return array;
		
	}
	
	

}
