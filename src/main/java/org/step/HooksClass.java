package org.step;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utility.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {

	@Before
	public void setUp() {
		
		
		browserLaunch("Chrome");
		
		
		
	}
	
	@After
	public void tearDown(Scenario sc ) {
		
		
		
		if(sc.isFailed()) {
			
			 byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			 
			 sc.embed(screenshotAs, "images/png");
			 
			 System.out.println("Added new Test");
		}
		
		
		//quit();
	}
	
	
}
