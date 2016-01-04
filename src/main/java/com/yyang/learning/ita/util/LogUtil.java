package com.yyang.learning.ita.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtil {

	public static Logger LOGGER = LoggerFactory.getLogger(LogUtil.class);

	public static void logArray(long[] array) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			sb.append(String.format("[%d]:%d | ", i, array[i]));
		}

		LOGGER.info("array elements are :" + sb.toString());
	}
	
	public static void logRunTime(Timer timer) {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("This Timer begin at : %d. End at %d\n Total run : %d Millis\n Total run : %d S", timer.getBegin(), timer.getEnd(), timer.runMilliSeconds(), timer.runSeconds()));
		LOGGER.info(sb.toString());
	}
	
	
}