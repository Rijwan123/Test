package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import common.CommonDataSetup;
@Test(groups = "User-resistration")
public class GruopDemoTest {

	@org.testng.annotations.BeforeClass
	public void BeforeClass() {
	    System.out.println("Run this method before class");
	}
	
	@AfterClass
	public void AfterClass() {
	    System.out.println("Run this method After class");
	}
	@BeforeGroups(value="regression")
	public void Beforegroup() {
	    System.out.println("Run this method before regression");
	}
	@AfterGroups(value="regression")
	public void Aftergroup() {
	    System.out.println("Run this method After regression");
	}
	
	@Test(priority = 1,groups = "regression")
	public void aTest1() {
		
		System.out.println("test1");
		
	}

	@Test(priority = 2,groups = "regression")
 public void bTest2() {
		
		System.out.println("test2");
		Assert.assertTrue(false);
		
	}

	@Test(groups = {"regression","bvt"})
 public void bTest3() {
		
		System.out.println("test3");
		
	}
 
	@Test(groups = "bvt")
 public void bTest4() {
		
		System.out.println("test4");
		
	}








}
