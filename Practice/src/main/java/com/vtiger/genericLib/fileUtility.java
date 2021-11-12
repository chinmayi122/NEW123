package com.vtiger.genericLib;



	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	/**
	 * 
	 * @author chinmayi avinash
	 *
	 */
	public class fileUtility {
		
		/**
		 * get data from from properties file 
		 * @param key
		 * @return return value in String 
		 * @throws IOException
		 */
		public String getDataFromPropertyFile(String key) throws IOException {
			
		FileInputStream fis = new FileInputStream("./commonData/data2.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		String value=pObj.getProperty(key);
			
		return value;	
		}

	}


