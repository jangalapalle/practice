package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.framework.base.BasePage;
import com.framework.reports.ExtentReport;

public class LoginPage extends BasePage {

	@FindBy(id = "txtUsername")
	WebElement userNameTextBox;

	@FindBy(id = "txtPassword")
	WebElement passwordTextBox;

	@FindBy(id = "btnLogin")
	WebElement loginButton;

	@FindBy(id = "welcome")
	WebElement welcomeLink;

	@FindBy(id = "spanCopyright")
	WebElement spanCopyrightText;

	@FindBy(id = "spanMessage")
	WebElement loginErrorMsg;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void login(String userName, String password) {

		userNameTextBox.sendKeys(userName);
		ExtentReport.logMessage(Status.PASS, "Enter Username: " + userName, false);
		passwordTextBox.sendKeys(password);
		ExtentReport.logMessage(Status.PASS, "Enter Password: " + password, false);
		loginButton.click();
		ExtentReport.logMessage(Status.PASS, "Click on Login", true);
	}

	public void verifySuccessMessage() {

		String actualMsg = welcomeLink.getText();
		String expectedMsg = "Welcome Admin1";

		validateField(expectedMsg, actualMsg, "Verify Welcome Message");

	}

	public void verifyCopyRightText() {

		String actualMsg = spanCopyrightText.getText();
		String expectedMsg = "OrangeHRM ver 3.0.1 © OrangeHRM Inc. 2005 - 2023 All rights reserved.";

		validateField(expectedMsg, actualMsg, "Verify Copy Right Footer Message");

	}

	public void verifyLoginErrorMessage(String expectedMsg) {

		String actualMsg = loginErrorMsg.getText();

		validateField(expectedMsg, actualMsg, "Verify Login Error Message");
	}

}
