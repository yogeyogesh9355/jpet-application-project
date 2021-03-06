package com.Jpet.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.excelutilities.Jpet_exceldata;

public class Jpet_SignIn_and_CompareName_page {
	WebDriver driver;
	WebElement Register;
	
	public void launchapplication(String browser,String url) {
		// To launch Chrome browser
		
		try {
			//To launch firefox Browser
	if (browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver","src/test/resources/driver/geckodriver.exe");
		driver = new FirefoxDriver();
	}
			// To launch chrome Browser
	else if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
		driver=new ChromeDriver();
	}
			// To launch InternetExplorer
	else if (browser.equalsIgnoreCase("Internet Explore")) {
			System.setProperty("webdriver.ie.driver","src/test/resources/driver/IEDriverServer.exe");
		driver=new InternetExplorerDriver();  
	}
			//to maximize the window
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(url);
// Exception handling command
} catch (WebDriverException e) {
	System.out.println("Browser could not be launched");
}
	}
	//to click on sign in button
	public void clicksignin() {
	driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
	
	}
	// proceed to sign in function
	public void signin() throws IOException, InterruptedException {
		
			Jpet_exceldata ed = new Jpet_exceldata();	
		
			for(int i=1;i<=1;i++)
		{
			driver.findElement(By.name("username")).sendKeys(ed.excel_username(i));
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(ed.excel_password(i));
			Thread.sleep(5000);
		}
	}
	// click on sign in button
	public void clickonsignIn() {
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
		System.out.println("Sign in success");
	}
	//to compare user name with welcome board name
	public String compare_name() throws InterruptedException {
		 String s = driver.findElement(By.xpath("//*[@id=\"WelcomeContent\"]")).getText();
		 String ss=s.substring(8,14);
		 return ss;
		 
		}
	//to close browser
	public void quit() {
		driver.close();
	}
}

