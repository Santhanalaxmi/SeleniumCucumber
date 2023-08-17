package com.seleniumcucumber.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonOR {

	WebDriver driver;

	public AmazonOR(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy (xpath = "//select[@id='searchDropdownBox']")
WebElement searchDropdown;

@FindBy (xpath = "//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]//h2//child::a")
List<WebElement> allBooks;

@FindBy (xpath = "//input[@id='twotabsearchtextbox']")
WebElement searchTextBox;

@FindBy (xpath = "//div[@class='navFooterVerticalRow navAccessibility']//following-sibling::a")
List<WebElement> footerLinks;
public void selectCategory(String categoryValue) {
	
	Select dropdownOptions = new Select(searchDropdown);
	dropdownOptions.selectByVisibleText(categoryValue);
}
	@FindBy (xpath = "//input[@id='nav-search-submit-button']")
	WebElement submitButton;
	
public void printBookNames(String text) {
	
	searchTextBox.sendKeys(text);
	
	submitButton.click();
	
	for(WebElement allTheBookNames : allBooks) {
		String book = allTheBookNames.getText();
		System.out.println(book);
	}
	
}
	
public void getFooterLinks() {
	
	int noOfLinks = footerLinks.size();
	System.out.println("No Of Links in the footer sections "+noOfLinks);
}
}
