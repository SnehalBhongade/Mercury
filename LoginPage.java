package com.POM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.POM.config.config;

public class LoginPage {
	
	@FindBy(how=How.XPATH, using="//input[@name='userName']")
	WebElement objusername;
	
	@FindBy(how=How.XPATH, using="//input[@name='password']")
	WebElement objpassword;
	
	@FindBy(how=How.XPATH, using="//input[@name='login']")
	WebElement objlogin;

	public void loadLoginPage()
	{
		PageFactory.initElements(config.driver, this);
	}
	public void enterUsername(String username)
	{
		objusername.sendKeys(username);
	}
	public void enterPassword(String password)
	{
		objpassword.sendKeys(password);
	}
	public void clicklogin()
	{
		objlogin.click();
	}
}
