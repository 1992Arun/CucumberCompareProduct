package org.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.remote.RemoteWebDriver;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class UtilityClass extends BaseClass {

	public static String getPropert(String key){

		Properties p = null;

		if(p==null) {

			p = new Properties();
		}


		try {

			FileReader f = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Confic.properties");



			p.load(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return p.getProperty(key);



	}

	public static String getBrowserName() {

		return ((RemoteWebDriver)driver).getCapabilities().getBrowserName();

	}

	public static String getBrowserVersion() {

		return ((RemoteWebDriver)driver).getCapabilities().getBrowserVersion();

	}


	public static void getJVMReport(String json){

		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReport\\JVMReport.html");

		Configuration conf = new Configuration(f, "Tutorial");

		conf.addClassifications("OS", System.getProperty("os.name"));
		
		conf.addClassifications("UserName", System.getProperty("user.name"));
		
		conf.addClassifications("Jave Version", System.getProperty("java.version"));
		
		conf.addClassifications("BrowserName", getBrowserName() );
		
		conf.addClassifications("BrowserVersoin", getBrowserVersion() );
		
		List<String> li = new LinkedList();
		
		li.add(json);
		
		ReportBuilder rb = new ReportBuilder(li, conf);
		
		rb.generateReports();

	}

}
