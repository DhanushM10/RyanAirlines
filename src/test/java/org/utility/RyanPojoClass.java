package org.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RyanPojoClass extends RyanBaseClass {
	
	public RyanPojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Yes, I agree']")
	private WebElement click;
	
	@FindBy(xpath="//span[text()='Log in']")
	private WebElement loginClick;
	
	@FindBy(xpath="(//input[@type='email'])[2]")
	private WebElement txtuser;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtpass;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement btnClick;

	public WebElement getClick() {
		return click;
	}

	public WebElement getLoginClick() {
		return loginClick;
	}

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

}
