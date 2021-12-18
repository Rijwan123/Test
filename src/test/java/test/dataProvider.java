package test;

import org.testng.annotations.DataProvider;

public class dataProvider {
	
	@org.testng.annotations.Test(dataProvider = "create",dataProviderClass = dataProvider3.class)
	
	public void Test(String usrname, String password) {
		
	 System.out.println(usrname+"=========="+password);
		
	}
	@org.testng.annotations.Test(dataProvider = "create",dataProviderClass = dataProvider3.class)
	public void Test1(String usrname, String password,String text) {
		
		 System.out.println(usrname+"=========="+password+"======="+text);
			
		}
	
	@org.testng.annotations.Test(dataProvider = "create",dataProviderClass = dataProvider3.class)
	public void Test2(String usrname, String password,String text,String text1) {
		
		 System.out.println(usrname+"=========="+password+"======="+text+"====="+text1);
			
		}
//	@DataProvider(name ="create")
//	public Object[][] dataSet1() {
//		return new Object[][] 
//	    {
//			{"standard_user","secret_sauce","text1"},
//			{"locked_out_user","secret_sauce","text2"},
//			{"problem_user","secret_sauce","text3"},
//			{"performance_glitch_user","secret_sauce","text4"}
//			
//		};
//		
//	}
//	
//	@DataProvider
//	public Object[][] dataSet() {
//		
//		Object [][] dataset =new Object[4][2];
//		
//		//first row
//		dataset [0][0]="user1";
//		dataset [0][1]="pass1";
//		//second row
//		dataset [1][0]="user2";
//		dataset [1][1]="pass2";
//		// third row
//		dataset [2][0]="user3";
//		dataset [2][1]="pass3";
//		// fourth row
//		dataset [3][0]="user4";
//		dataset [3][1]="pass4";
//		
//		return dataset;
//	}
	

}