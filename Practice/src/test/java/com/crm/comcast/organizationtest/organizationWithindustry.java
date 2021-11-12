package com.crm.comcast.organizationtest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import com.vtiger.genericLib.excelUtility;
import com.vtiger.genericLib.fileUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class organizationWithindustry {

	public static void main(String[] args) throws IOException {
		
		
		   excelUtility ex = new excelUtility();
		     fileUtility poBj = new fileUtility();
		     
		     String url = poBj.getDataFromPropertyFile("url");
		     String browser = poBj.getDataFromPropertyFile("browser");
		     String username= poBj.getDataFromPropertyFile("username");
		     String password = poBj.getDataFromPropertyFile("password");
		     
		     String val = ex.getExcelData("Sheet1", 3, 2);
		     WebDriver driver=null;
		     
		     
		      if(browser.equals("chrome"))	    	  
		      {
		    	  WebDriverManager.chromedriver().setup();
		    	   driver = new ChromeDriver();
		      }else if(browser.equals("firefox")) {
		    	  WebDriverManager.firefoxdriver().setup();
		    	  driver=new FirefoxDriver();
		      }else if(browser.equals("i e")) {
		    	  WebDriverManager.iedriver().setup();
		    	  driver=new InternetExplorerDriver();
		    }
		    driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(url);
			driver.findElement(By.name("user_name")).sendKeys(username);
			driver.findElement(By.name("user_password")).sendKeys(password);
			driver.findElement(By.id("submitButton")).click();
			
		    driver.findElement(By.linkText("Organizations")).click();
		    driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		    driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(val);
		    
		    WebElement ind = driver.findElement(By.xpath("//select[@name='industry']"));
		       Select S= new Select(ind);
		       S.selectByVisibleText("Utilities");
		       
		       WebElement type = driver.findElement(By.name("accounttype"));
		       Select S1=new Select(type);
		       S1.selectByVisibleText("Customer");
		       
		       driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
	            String txt = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();	
	            if(txt.contains(val))
	            {
	            	System.out.println("organization created");
	            }else {
	            	System.out.println("organizatiion not created");
		       
	            }
		    
	          }
}



