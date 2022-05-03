package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgodaHomePage extends BaseClass {

	private void AgoadaHomePage() {
		PageFactory.initElements(driver, this);

	}

@FindBy(xpath="(//span[text()='Sign in'])[2]")
private WebElement toclickSignIn;

@FindBy(id="email")
private WebElement txtUser;

@FindBy(id="password")
private WebElement txtpass;

@FindBy(xpath="//div[@class='sc-fzqNqU hFpwJY']")
private WebElement clickLogIn;

public WebElement getToclickSignIn() {
	return toclickSignIn;
}

public WebElement getTxtUser() {
	return txtUser;
}

public WebElement getTxtpass() {
	return txtpass;
}

public WebElement getClickLogIn() {
	return clickLogIn;
}




}
