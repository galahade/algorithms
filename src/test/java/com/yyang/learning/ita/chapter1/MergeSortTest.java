package com.yyang.learning.ita.chapter1;

import org.junit.Test;

public class MergeSortTest extends SortTest {
	
	@Test
	public void test() {
		Sort sort = new MergeSort();
		testSort(sort);
	}

	@Override
	public int getArraySize() {
		return ARRAY_SIZE;
	}

}
