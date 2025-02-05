package org.utility;

import java.util.Map;

public class A {
	
	
	public void enter_any_existing_Products_name_into_the_Search_text_box_field(io.cucumber.datatable.DataTable dataTable) {
	    
		Map<String, String> data = dataTable.asMap(String.class, String.class);
		
		

		System.out.println(data.get("Product") );
		
		
		
		
	}
	
	public static void main(String[] args) {
		
	}

}
