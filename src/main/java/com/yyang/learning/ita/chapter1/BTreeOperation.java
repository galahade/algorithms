package com.yyang.learning.ita.chapter1;

public interface BTreeOperation {

	default int parent(long[] array, int i) {
		return ((i - 1) < 0 ? 0 : (i - 1))/2;
	}
	
	default int left(long[] array, int i) {
		int left = 2 * i + 1;
		return left;
	}
	
	default int right(long[] array, int i) {
		int right = 2 * i + 2;
		return right;
	}
	
	default int heapSize(long[] array) {
		return array.length - 1;
	}
	
	default void exchange(long[] array, int a, int b) {
		long x = array[a];
		array[a] = array[b];
		array[b] = x;
	}
}
