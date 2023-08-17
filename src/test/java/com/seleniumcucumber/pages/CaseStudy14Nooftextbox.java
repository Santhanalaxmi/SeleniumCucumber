package com.seleniumcucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaseStudy14Nooftextbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();
		Driver.get("http://destinationqa.com/contact us/");
		java.util.List<WebElement> text_field=Driver.findElements(By.xpath("//*[@id=\"wpcf7-f79-p14-o1\"]/form"));
		Thread.sleep(2000);
		int no_of_textbox=text_field.size();
		System.out.println("Number of text box:"+no_of_textbox);
		Driver.close();
	}

}
