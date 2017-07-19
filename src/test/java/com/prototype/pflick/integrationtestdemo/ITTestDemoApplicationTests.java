package com.prototype.pflick.integrationtestdemo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ITTestDemoApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("This is my integration tests go");
		assertTrue(true);
	}


}
