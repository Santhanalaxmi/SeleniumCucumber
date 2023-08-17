package com.seleniumcucumber.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.seleniumcucumber.pages.AmazonOR;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;


public class StepDefinition {
	
	@Given("^Browser is opened$")
	public void browser_is_opened()  {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver" , "D:\\UDEMY_SELENIUMJAVA\\SeleniumCucumber\\src\\test\\resources\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    amazonOR = new AmazonOR(driver);
	}

	@Then("^Launches the website$")
	public void launches_the_website()  {
		driver.get("https://www.amazon.in/");
	}

	
	
	
public WebDriver driver;
AmazonOR amazonOR;

		// TODO Auto-generated method stub
		@Given("^User launches the application$")
		public void user_launches_the_application()  {
		    // Write code here that turns the phrase above into concrete actions
		    String currentUrl = driver.getCurrentUrl();
		    System.out.println(currentUrl);
		    
		    
		}

		
		@Then("^Fetch the Title$")
		public void fetch_the_Title() {
		    // Write code here that turns the phrase above into concrete actions
			String urlText = driver.getCurrentUrl();
			Assert.assertEquals("https://www.amazon.in/", urlText);
		}

		@Given("^User is on Amazon Page$")
		public void user_is_on_Amazon_Page()  {
		    // Write code here that turns the phrase above into concrete actions
			
		}

		@Then("^User selects Book as Category$")
		public void user_selects_Book_as_Category()  {
		    // Write code here that turns the phrase above into concrete actions
			amazonOR.selectCategory("Books");
			
			
		}

		@Then("^Type Jayakumaran in Search box$")
		public void type_Jayakumaran_in_Search_box()  {
		    // Write code here that turns the phrase above into concrete actions
			amazonOR.printBookNames("Jayakanthan");
		}

		@Then("^Get all the links in the footer page$")
		public void get_all_the_links_in_the_footer_page()  {
		    // Write code here that turns the phrase above into concrete actions
			amazonOR.getFooterLinks();
		}


	}

