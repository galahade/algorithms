package com.yyang.learning.ita.chapter1;

public class HeapSort implements Sort, BTreeOperation{
	
	private int heapSize = 0;

	@Override
	public long[] sort(long[] intArr) {
		buildMaxHeap(intArr);
		for(int i = intArr.length - 1; i >= 1 ; i--) {
			exchange(intArr, 0, i);
			heapSize--;
			maxHeapify(intArr, 0);
		}
		
		return intArr;
	}
	
	private void maxHeapify(long[] array, int i) {
		int left = left(array, i);
		int right = right(array, i);
		int largest = i;
		if(left <= getHeapSize() && array[left] > array[i]) {
			largest = left; 
		}
		if(right <= getHeapSize() && array[right] > array[largest]) {
			largest = right;
		}
		if(largest != i) {
			exchange(array, i, largest);
			maxHeapify(array, largest);
		}
	}
	
	private void buildMaxHeap(long[] array) {
		setHeapSize(array.length - 1);
		for(int i = array.length/2 - 1; i >= 0; i--) {
			maxHeapify(array, i);
		}
	}
	
	public int getHeapSize() {
		return heapSize;
	}
	
	public void setHeapSize(int heapSize) {
		this.heapSize = heapSize;
	}

}
