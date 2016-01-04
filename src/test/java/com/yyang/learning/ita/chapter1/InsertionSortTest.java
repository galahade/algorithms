package com.yyang.learning.ita.chapter1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.yyang.learning.ita.util.GenerationUtil;
import com.yyang.learning.ita.util.LogUtil;
import com.yyang.learning.ita.util.Timer;

public class InsertionSortTest  extends SortTest {
	
	@Test
	public void testInsertionSortV1() {
		Sort sort = new InsertionSortV1();
		testSort(sort);
	}
	
	@Test
	public void testInsertionSort() {
		Sort sort = new InsertionSort();
		testSort(sort);
	}
	
	@Test
	public void compareInsertionSort() {
		long[] input1 = GenerationUtil.inputArray(ARRAY_SIZE);
		long[] input2 = Arrays.copyOf(input1, input1.length);
		Assert.assertNotEquals(input1, input2);
		
		Sort sortV1 = new InsertionSortV1();
		Sort sortV2 = new InsertionSort();
		
		Timer timer1 = sort(sortV1, input1);
		Timer timer2 = sort(sortV2, input2);
		
		Assert.assertArrayEquals(input1, input2);
		
		LogUtil.logRunTime(timer1);
		LogUtil.logRunTime(timer2);
		
	}

	@Override
	public int getArraySize() {
		return ARRAY_SIZE;
	}

}
