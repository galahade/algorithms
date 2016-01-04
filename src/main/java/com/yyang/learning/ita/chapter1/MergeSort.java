package com.yyang.learning.ita.chapter1;

public class MergeSort implements Sort {

	@Override
	public long[] sort(long[] intArr) {
		mergeSort(intArr, 0, intArr.length - 1);
		return intArr;
	}
	
	private void mergeSort(long[] array, int begin, int end) {
		if(begin < end) {
			int middle = (begin + end)/2;
			mergeSort(array, begin, middle);
			mergeSort(array, middle + 1, end);
			merge(array, begin, middle, end);
		}
	}
	
	
	private void merge(long[] array, int small, int middle, int big) {
		int array1Length = middle - small + 1;
		int array2Length = big - middle;
		long[] array1 = new long[array1Length+1];
		long[] array2 = new long[array2Length+1];
		for(int i = 0 ; i < array1Length; i ++) {
			array1[i] = array[small + i];
		}
		for(int i = 0 ; i < array2Length; i ++) {
			array2[i] = array[middle + 1 + i];
		}
		array1[array1Length] = Long.MAX_VALUE;
		array2[array2Length] = Long.MAX_VALUE;
		
		int count1 = 0;
		int count2 = 0;
		
		for(int i = small; i <= big; i ++) {
			if(array1[count1] <= array2[count2]) {
				array[i] = array1[count1];
				count1++;
			}else {
				array[i] = array2[count2];
				count2++;
			}
		}
		
		
	}

}
