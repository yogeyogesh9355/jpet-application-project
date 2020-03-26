package com.Jpet.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Jpet_AddProducts_and_RemoveFromCart_page {
	WebDriver driver;
	public void launchapplication(String browser,String url) {
		// To launch Chrome browser
		
		try {
			//To launch firefox Browser
	if (browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Lenovo\\Desktop\\yogesh\\Jpet_Application\\src\\test\\resources\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
			// To launch chrome Browser
	else if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\yogesh\\Jpet_application\\src\\test\\resources\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
			// To launch InternetExplorer
	else if (browser.equalsIgnoreCase("Internet Explore")) {
			System.setProperty("webdriver.ie.driver","C:\\Users\\Lenovo\\Desktop\\yogesh\\Jpet_Application\\src\\test\\resources\\driver\\IEDriverServer.exe");
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
// to select category from categories
	public void selectcategory()
	{
		driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
	}
	// to select product form 
	public void selectproduct() {
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
	}
	// To proceed add to cart function
	public void addtocart() {		
			driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
	}
	// proceed to remove from cart function
	public void removefromCart() {
		driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a")).click();
}
	// to take screenshot for remove from cart
		public void takescreenshot2(String path) throws IOException, InterruptedException {
			TakesScreenshot image=  ((TakesScreenshot)driver);
			Thread.sleep(5000);
			File source=image.getScreenshotAs(OutputType.FILE);
			Thread.sleep(5000);
			FileUtils.copyFile(source, new File(path));
			driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
			System.out.println("Remove product from cart passed");
}// to close browser
		public void quit() {
			driver.close();
		}
}
