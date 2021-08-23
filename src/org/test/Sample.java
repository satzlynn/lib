package org.test;

import org.openqa.selenium.WebElement;

public class Sample extends Base {
	public static void main(String[] args) {
		
		launchBrowser("https://en-gb.facebook.com/");
		WebElement elementLocator = elementLocator("email");
		entertxt(elementLocator,"shiva");
		
		System.out.println(Title());	
		System.out.println(Url());
	}

}
