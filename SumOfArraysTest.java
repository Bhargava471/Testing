package com.maven.junit;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SumOfArraysTest {
	
	SumOfArrays sum = new SumOfArrays();
	
	@Test
	public void testSumOfArrays() {
		
		assertArrayEquals(new int[] {77,121,128},sum.SumOfArrays());
	}

}
