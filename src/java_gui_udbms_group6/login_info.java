package java_gui_udbms_group6;

import java.util.HashMap;

public class login_info {

	HashMap<String,String> idandpass = new HashMap<String,String>();
	
	login_info(){
		idandpass.put("cmosqueda", "1234");
		idandpass.put("yjimin", "kwangya");
		idandpass.put("meow", "ilovecats");
		idandpass.put("htorres","1234");
		idandpass.put("debajay", "1234");
		idandpass.put("haguaviva", "1234");
	}
	
	protected HashMap getIdandPass() {
		return idandpass;
	}
}