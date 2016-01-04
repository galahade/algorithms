package com.yyang.learning.ita.chapter1;

import com.yyang.learning.ita.util.GenerationUtil;
import com.yyang.learning.ita.util.LogUtil;
import com.yyang.learning.ita.util.Timer;

public abstract class SortTest {
	
	public static final int ARRAY_SIZE = 5000000;
	
	protected void testSort(Sort sort) {
		long[] inputArr = GenerationUtil.inputArray(getArraySize());
		Timer timer = sort(sort, inputArr);
		LogUtil.logRunTime(timer);
	}
	
	protected void testSortWithLog(Sort sort) {
		long[] inputArr = GenerationUtil.inputArray(getArraySize());
		LogUtil.logArray(inputArr);
		Timer timer = sort(sort, inputArr);
		LogUtil.logArray(inputArr);
		LogUtil.logRunTime(timer);
	}
	
	
	protected Timer sort(Sort sort, long[] inputArr) {
		Timer timer = new Timer();
		timer.begin();
		sort.sort(inputArr);
		timer.stop();
		return timer;
	}
	
	abstract public int getArraySize() ;

}
