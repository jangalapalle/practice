package com.framework.dataacess;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtil {
	
	static Properties prop;

	public static void initialize() {

		String path = System.getProperty("user.dir") + "\\src\\test\\resources\\configs\\OrangeHRM.properties";

		try {
			File file = new File(path);

			FileInputStream fis = new FileInputStream(file);

			prop = new Properties();

			prop.load(fis);

		} catch (Exception e) {

		}

	}

	public static String readValue(String key) {

		String value = prop.getProperty(key);

		return value;
	}

}
