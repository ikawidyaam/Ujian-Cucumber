package com.juaracoding.ujiancucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ujiancucumber.drivers.DriverSingleton;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "email")
	WebElement inputEmail;
	
	@FindBy(name = "password")
	WebElement inputPassword;
	
	@FindBy(css = "#fadein > div.container > div > div.modal-content.col.align-self-center > div.modal-body > div > form > div.btn-box.pt-3.pb-4 > button")
	WebElement btnSubmit;

	@FindBy(className = "author_meta")
	WebElement txtWelcome;
	
	public void submitLogin(String email, String password) {
		inputEmail.sendKeys(email);
		inputPassword.sendKeys(password);
		btnSubmit.click();
	}
	
	public String getTextWelcome() {
		return txtWelcome.getText();
	}
	
}
