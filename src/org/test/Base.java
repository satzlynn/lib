package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	static WebDriver driver;
		public static void launchBrowser(String url) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Downloads\\BaseClass\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			
		}
		public static WebElement elementLocator(String locator) {
			WebElement findElement = driver.findElement(By.id(locator));
			return findElement;
		}
		public static void entertxt (WebElement findElement,String text) {
			findElement.sendKeys(text);
			findElement.getText();
			
		}
		public static String Title() {
			String title = driver.getTitle();
			return title;
		}
		public static  String Url() {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
		}
		
		public void loadurl() {
			System.out.println("loadurl");
		}
			
			
		}
		
		
			



