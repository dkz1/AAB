package com.study;

public class TestSushu {
	
	public void test1() {
		Assert.assertEquals(120, Factorial.fac1(5));
		Assert.assertEquals(120, Factorial.fac1(0));
		Assert.assertEquals(120, Factorial.fac1(-1));
	}
	
}
