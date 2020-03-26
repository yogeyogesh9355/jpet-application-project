package com.Jpet.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.excelutilities.Jpet_exceldata;

public class Jpet_PrintBill_and_MyOrdersTable_page {
	WebDriver driver;
	WebElement Register;	
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

	}// exception handling function
			catch (WebDriverException e) {
		System.out.println("Browser could not be launched");
	}
		}
	// to click sign button
	public void clicksignin() {
		driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
	}// sign in function
	public void signin() throws IOException, InterruptedException {
		
			Jpet_exceldata ed = new Jpet_exceldata();	
		
			for(int i=1;i<=1;i++)
		{
			driver.findElement(By.name("username")).sendKeys(ed.excel_username(i));
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(ed.excel_password(i));
			Thread.sleep(5000);
		}
	}// to click on sign in
	public void clickonsignIn() {
	driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
	}
	// to select a product from product list
	public void selectaproduct() {
		driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
	}
	// to print the ordered bill
		public void Printbill() {
			
						String s = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table")).getText();
						System.out.println(s+" ");
						System.out.println("");
						driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
	}
		//to print my order table
		public void print_Myordertable()
		{
			driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[3]")).click();
			driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
			String s=driver.findElement(By.xpath("//*[@id=\"Content\"]/table/tbody")).getText();
			System.out.println("");
			System.out.println(s);
			// to close browser
		}
		public void quit() {
			driver.close();
}
}
