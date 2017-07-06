package com.Kleenex.Utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class TestDataConfig {
	
	String propFileName = "Data/config.properties";
	public  String getValueFromConfig(String value) throws IOException {
		String result="";
		File file = new File("Data/config.properties");
		String path=file.getAbsolutePath();
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
				prop.load(fileInput);
				result = prop.getProperty(value);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
		}
		return result;
	}

}
