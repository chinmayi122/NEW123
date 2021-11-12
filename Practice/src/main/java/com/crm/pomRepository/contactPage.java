package com.crm.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactPage {
	
	WebDriver driver;

	public contactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@title='Create Contact...']")
	WebElement createContactButton;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCreateContactButton() {
		return createContactButton;
	}
	
	
	
	
}



