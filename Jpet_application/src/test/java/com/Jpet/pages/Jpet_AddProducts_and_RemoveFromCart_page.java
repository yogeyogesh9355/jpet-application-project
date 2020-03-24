package com.Jpet.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jpet_AddProducts_and_RemoveFromCart_page {
	WebDriver driver;
	public void launchapplication() {
		// To launch Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\yogesh\\Jpet_application\\src\\test\\resources\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
	//To open application homepage
	driver.get("https://petstore.octoperf.com/actions/Catalog.action");	
	}
	public void selectcategory()
	{
		driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
	}
	public void selectproduct() {
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
	}
	public void addtocart() {
	
		// To proceed add to cart function
			
			driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
	}
	public void removefromCart() {
		driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a")).click();
}
		public void takescreenshot2(String path) throws IOException, InterruptedException {
			TakesScreenshot image=  ((TakesScreenshot)driver);
			Thread.sleep(5000);
			File source=image.getScreenshotAs(OutputType.FILE);
			Thread.sleep(5000);
			FileUtils.copyFile(source, new File(path));
			driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
			System.out.println("Remove product from cart passed");
}
		public void quit() {
			driver.close();
		}
}
