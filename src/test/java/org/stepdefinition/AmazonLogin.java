package org.stepdefinition;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLogin {

	public static WebDriver Driver;

	@BeforeClass
	private void Method1() {
		Driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		Driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_4b3e4wrxds_e&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=294102729729&hvpos=&hvnetw=g&hvrand=2005791130408263198&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-316976912080&hydadcr=5841_1914865&gclid=EAIaIQobChMIoK23w83P9wIVHEBIAB09qQ8yEAAYASAAEgI8evD_BwE");
		
	}

	@Given("Using Amazon Url user have to open Amazon Login Page")
	public void using_Amazon_Url_user_have_to_open_Amazon_Login_Page() {

		System.out.println("TestMethod 3");

	
		
	}

	@When("Using Valid Email Valid Password")
	public void using_Valid_Email_Valid_Password() {
		System.out.println("Test Method 2");
	}

	@When("Click ON Login button")
	public void click_ON_Login_button() {
		System.out.println("Test Method 3");
	}

	@Then("Homepage Should be Displayed")
	public void homepage_Should_be_Displayed() {
		System.out.println("Test Method 4");
	}

}
