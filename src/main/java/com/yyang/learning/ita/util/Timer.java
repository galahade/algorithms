package com.yyang.learning.ita.util;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Timer {
	
	private Long begin;
	
	private Long end;
	
	public void begin() {
		this.begin = System.currentTimeMillis();
	}
	
	public void stop() {
		this.end = System.currentTimeMillis();
	}
	
	
	public Long runMilliSeconds() {
		return end - begin;
	}
	
	public long runSeconds() {
		return (end - begin)/1000;
	}

}
