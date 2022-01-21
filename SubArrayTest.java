package com.maven.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class SubArrayTest {

	@Test
	public void testSubArray() {
		SubArrays sub = new SubArrays();
		System.out.println(Arrays.toString(sub.SubArrays()));
		assertArrayEquals(new int[] {30,25,40,32,31},sub.SubArrays());
	

}
}