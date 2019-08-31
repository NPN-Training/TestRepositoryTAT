//package com.npntraining.handson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumOverview {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\NPN\\TAT_2019_08_03\\Softwares\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "E:\\NPN\\TAT_2019_08_03\\Softwares\\Drivers\\geckodriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();//Maximizes the browser window
		chrome.get("https://gmail.com"); //get(String) will launch the website (String)
		System.out.println("Gmail have been launched with Google Chrome");
		
		WebDriver firefox = new FirefoxDriver();
		firefox.manage().window().maximize();
		firefox.get("https://facebook.com");
		
		System.out.println("Facebook have been launched with Firefox");
	}

}
