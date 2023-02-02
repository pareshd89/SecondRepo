package com.jbk.pareshSelentest.Basics01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Properties;
public class A {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("application.properties");
		 Properties pp=new Properties();
		pp.load(fis);
		String val=pp.getProperty("username");
		System.out.println(val);
	}

}
