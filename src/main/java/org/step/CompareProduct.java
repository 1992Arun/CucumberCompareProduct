package org.step;

import org.utility.BaseClass;
import org.utility.LoginPage;
import org.utility.SearchPage;

import io.cucumber.java.en.When;

public class CompareProduct extends BaseClass {
	
	
public static LoginPage l ;

public static SearchPage s ;

@When("Hover the mouse on any Menu say Desktops and select Show All Desktops option")
public void hover_the_mouse_on_any_Menu_say_Desktops_and_select_Show_All_Desktops_option() {
    
	 l = new LoginPage();
	
	 s =  new SearchPage();
	
	mouseOver(l.getDesktop());
	
	click(l.getShowAllDesktop());
	
}

@When("In the displayed Desktops category page, select List View option")
public void in_the_displayed_Desktops_category_page_select_List_View_option() {
    
	click(s.getListView());
}



}
