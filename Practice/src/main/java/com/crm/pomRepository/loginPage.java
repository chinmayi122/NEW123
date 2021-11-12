package com.crm.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericLib.fileUtility;
import com.vtiger.genericLib.*;

/**
 * 
 * @author Chinmayi Avinish
 *
 */

public class loginPage {

	WebDriver driver;
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "user_name")
	private WebElement usernameTextBox;

	@FindBy(name = "user_password")
	private WebElement passwordTextBox;

	@FindBy(id = "submitButton")
	private WebElement loginButton;



	public WebElement getUsernameTextBox() {
		return usernameTextBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	/**
	 * this method is used to login application without enter username and password
	 * @throws Throwable
	 */

	public void loginToAPP() throws Throwable {
		
		fileUtility flib= new fileUtility();
		WebDriverUtility wlib= new WebDriverUtility();
		String url = flib.getDataFromPropertyFile("url");
		String username=flib.getDataFromPropertyFile("username");
		String password=flib.getDataFromPropertyFile("password");
		
		driver.get(url);
		wlib.maximizeBrowser(driver);
		usernameTextBox.sendKeys(username);
		passwordTextBox.sendKeys(password);
		loginButton.click();
	}
	
	/**
	 * this mehod is used to login application by pass username and password as arguments
	 * @param Username
	 * @param Password
	 * @throws Throwable
	 */
public void loginToAPP(String Username, String Password) throws Throwable {
		
		fileUtility flib= new fileUtility();
		WebDriverUtility wlib= new WebDriverUtility();
		String url = flib.getDataFromPropertyFile("url");
		String username=flib.getDataFromPropertyFile(Username);
		String password=flib.getDataFromPropertyFile(Password);
		
		driver.get(url);
		wlib.maximizeBrowser(driver);
		usernameTextBox.sendKeys(username);
		passwordTextBox.sendKeys(password);
		loginButton.click();
	}


}

	

