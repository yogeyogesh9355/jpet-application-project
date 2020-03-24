package com.Jpet.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excelutilities.Jpet_exceldata;

public class Jpet_PrintBill_and_MyOrdersTable_page {
	WebDriver driver;
	WebElement Register;
	public void launchapplication() {
		
	
		// To launch Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\yogesh\\Jpet_application\\src\\test\\resources\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
	//To open application homepage
	driver.get("https://petstore.octoperf.com/actions/Catalog.action");	
	}
	
	public void clicksignin() {
		Register = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
		Register.click();
	}
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
	public void clickonsignIn() {
		Register= driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input"));
		Register.click();
	}
	
	public void selectaproduct() {
		driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
	}
		public void Printbill() {
			
						String s = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table")).getText();
						System.out.println(s+" ");
						System.out.println("");
						driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
	}
		
		public void print_Myordertable()
		{
			driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[3]")).click();
			driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
			String s=driver.findElement(By.xpath("//*[@id=\"Content\"]/table/tbody")).getText();
			System.out.println("");
			System.out.println(s);
			
		}
		public void quit() {
			driver.close();
}
}
