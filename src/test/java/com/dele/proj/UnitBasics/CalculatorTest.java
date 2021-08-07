package com.dele.proj.UnitBasics;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	
	@BeforeClass
	public static void setupClass() {}
	
	@Test(expected = Exception.class)
	public void testDivide() {
		Calculator calcInstance = new Calculator();
		calcInstance.divide(0, 5);
		assertEquals(1, calcInstance.divide(5, 0));
	}
	
	@Ignore("Always throws an Exception.")
	@Test(expected = Exception.class)
	public void testBase() {
		int length = 3;
		for (int i = 0; i < length; i++) {
			System.err.println(i);
		}
	}
	
	@Test(timeout = 2000)
	public void timing4() throws InterruptedException {
		Thread.sleep(1500);
		System.err.println("Hello Testing 4");
	}
	
	@Test
	public void timing() {
		System.out.println("Hello Testing");
	}
	
	@Test(timeout = 1000 )
	public void timing3() throws InterruptedException {
		Thread.sleep(1500);
		System.err.println("Hello Testing 3");
	}
	
	@Test(timeout=10000)
	public void timing2() throws InterruptedException {
		Thread.sleep(15000);
		System.err.println("Hello Testing 2");
	}

}
