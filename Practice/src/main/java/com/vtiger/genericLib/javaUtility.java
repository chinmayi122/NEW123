package com.vtiger.genericLib;

	import java.awt.Robot;
	import java.util.Random;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.WebDriver.Timeouts;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	/**
	 * 
	 * @author chinmayi avinash
	 *
	 */
	public class javaUtility {
		
		
		/**
		 * 
		 * @param size
		 * @return range
		 */
		public String getRandomData(int size) {
			Random r = new Random();
			int range=r.nextInt(size);
			return "_"+range;
			
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		




