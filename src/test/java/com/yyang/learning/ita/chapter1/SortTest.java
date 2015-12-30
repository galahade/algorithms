package com.yyang.learning.ita.chapter1;

import org.junit.Test;

import com.yyang.learning.ita.util.GenerationUtil;
import com.yyang.learning.ita.util.LogUtil;
import com.yyang.learning.ita.util.Timer;

public class SortTest {
	
	public static final int ARRAY_SIZE = 10000;
	
	@Test
	public void testInsertionSort() {
		Sort sort = new InsertionSort();
		long[] inputArray = GenerationUtil.inputArray(ARRAY_SIZE);
		Timer timer = new Timer();
		timer.begin();
		long[] sortedArray = sort.sort(inputArray);
		timer.stop();
		LogUtil.logRunTime(timer);
		LogUtil.logArray(sortedArray);
	}

}
