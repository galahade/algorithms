package com.yyang.learning.ita.util;

import org.apache.commons.lang3.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GenerationUtil {
	
	
	public static Logger LOGGER = LoggerFactory.getLogger(GenerationUtil.class);
	
	public static long[] inputArray(int length) {
		long [] intArr = new long[length];
		long beginNumber = 1;
		long endNumber = 1L << length;
		if(endNumber < length)
			endNumber = length * 10;
		LOGGER.debug("endNumber is : " + endNumber);
		
		for(int i = 0; i < length; i++) {
			intArr[i] = RandomUtils.nextLong(beginNumber, endNumber);
			
		}
		return intArr;
		
	}
	
}
