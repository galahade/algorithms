package com.yyang.learning.ita.chapter1;

import org.junit.Test;

public class HeapSortTest extends SortTest {
	
	
	@Test
	public void testHeapSort() {
		Sort sort = new HeapSort();
		testSort(sort);
	}

	@Override
	public int getArraySize() {
		return ARRAY_SIZE;
	}

}
