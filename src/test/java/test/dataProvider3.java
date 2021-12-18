package test;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class dataProvider3 {

	
	@DataProvider(name ="create")
	public Object[][] dataSet1(Method m) {
		
		Object[][] testdata =null;
		
		if (m.getName().equals("Test"))
		  {
	    	testdata= new Object[][]
	        {
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce",},
			{"performance_glitch_user","secret_sauce"}
			
		    };
	      }else if(m.getName().equals("Test1")) 
	      {
	    	testdata = new Object[][]
	    			{
				{"standard_user","secret_sauce","third1"},
				{"locked_out_user","secret_sauce","third2"},
				{"problem_user","secret_sauce","third3"},
				{"performance_glitch_user","secret_sauce","third4"}
				
			      };
	      }else if (m.getName().equals("Test2")) 
	      {
	    	  testdata =new Object[][]
	    			  {
		    		    {"standard_user","secret_sauce","third1","forth1"},
						{"locked_out_user","secret_sauce","third2","forth2"},
						{"problem_user","secret_sauce","third3","forth3"},
						{"performance_glitch_user","secret_sauce","third4","forth4"}
	    		  
	    		  
	    			  };
	    			  
	    			  
	    	  
	      }
		return testdata;
	
}}
