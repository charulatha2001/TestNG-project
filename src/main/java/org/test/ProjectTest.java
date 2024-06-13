package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectTest extends BaseClass {
	
	@Test(priority = 5)
	private void tc1() {
		launchUrl("https://www.amazon.in/");
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("mop");
	}
	
	@BeforeClass
	private void start() {
		launchBrowser();
		windowMaximize();
	}
	
	@AfterClass
	private void end() {
		closeEntireBrowser();
	}
	
	@Test(priority = -1)
	private void tc2() {
		launchUrl("https://www.redbus.in/");
	}
	
	@Test(priority = -10)
	private void tc3() {
		launchUrl("https://inmakeslh.in/");
	}
	@Test(priority = 10)
	private void tc4() {
		launchUrl("https://www.flipkart.com/");
	}
	
	@Test
	private void tc5() {
		launchUrl("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("charue863@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("5384691");
	}
	
	@Test(priority = -12)
	private void tc6() {
		launchUrl("https://myaccount.google.com/");
	}
	
	@Test(priority = 54)
	private void tc7() {
		launchUrl("https://www.youtube.com/");
	}
	
	
}
