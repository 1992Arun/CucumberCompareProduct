package org.step;

import org.utility.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {

	@Before
	public void setUp() {
		
		
		browserLaunch("Chrome");
		
		
		
	}
	
	@After
	public void tearDown() {
		
		quit();
	}
	
	
}
