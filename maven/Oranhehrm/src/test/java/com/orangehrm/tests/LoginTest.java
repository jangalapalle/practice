
package com.orangehrm.tests;

import org.testng.annotations.Test;

import com.framework.base.BaseTest;
import com.framework.dataacess.PropertyUtil;
import com.orangehrm.pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void verifyLoginWithValidCredentials() {

		LoginPage loginPage = new LoginPage(getDriver());

		loginPage.login(PropertyUtil.readValue("username"), PropertyUtil.readValue("password"));
		loginPage.verifySuccessMessage();

	}

	@Test
	public void verifyFooterMessage() {

		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.verifyCopyRightText();

	}

	@Test
	public void verifyLoginWithBlankUserName() {
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.login("", "Admin");
		loginPage.verifyLoginErrorMessage("Username cannot be empty");

	}

	@Test
	public void verifyLoginWithInvalidCredentials() {
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.login("HGDFhgdf", "dssdds");
		loginPage.verifyLoginErrorMessage("Invalid credentials");

	}

}
