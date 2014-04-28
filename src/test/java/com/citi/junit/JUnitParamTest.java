package com.citi.junit;

import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import edu.emory.mathcs.backport.java.util.Arrays;

@RunWith(Parameterized.class)
public class JUnitParamTest {
	private static Calculator cal=new Calculator();
	private int param;
	private int result;
	
	@Parameters
	public static Collection<?> data() {
		
		return Arrays.asList(new Object[][] {
				{2,4},
				{4,16},
				{0,0},
				{-3,9}
		});
	}

	//构造函数，对变量进行初始化
	public JUnitParamTest(int param, int result) {
		this.param = param;
		this.result = result;
	}
	
	@Test
	public void testSquare() {
		int multiply = cal.multiply(param, param);
		assertEquals(result,multiply);
	}
	
}
