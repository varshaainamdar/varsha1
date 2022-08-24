package com.demo2project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Centurian_property {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//Step 1: use File Input stream to load property file
		FileInputStream fis=new FileInputStream(".\\Data\\Commondata.properties");
		
		//Step 2:create object of properties and load the file
		Properties prop=new Properties();
		prop.load(fis);
		 // step03: provide the key to read the value
		String URL=prop.getProperty("URL");
		System.out.println(URL);
		
		String Username=prop.getProperty("Username");
		System.out.println(Username);
		
		String Passward=prop.getProperty("Passward");
		System.out.println(Passward);
	}

}
