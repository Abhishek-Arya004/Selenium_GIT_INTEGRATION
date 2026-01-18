package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowManagment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        
		    	WebDriver driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		        // Navigate to Url
		        driver.get("https://www.selenium.dev/selenium/web/window_switching_tests/page_with_frame.html");
		        //fetch handle of this
		      //  String currHandle=driver.getWindowHandle();
		       
		        
		        //click on link to open a new window
		     //   driver.findElement(By.linkText("Open new window")).click();
		
		        
		      //Access each dimension individually
		        int width = driver.manage().window().getSize().getWidth();
		        int height = driver.manage().window().getSize().getHeight();

		        //Or store the dimensions and query them later
		        Dimension size = driver.manage().window().getSize();
		        int width1 = size.getWidth();
		        int height1 = size.getHeight();
		        
		        driver.manage().window().setSize(new Dimension(1024, 768));
		        
		        int x = driver.manage().window().getPosition().getX();
		        int y = driver.manage().window().getPosition().getY();

		        // Or store the dimensions and query them later
		        Point position = driver.manage().window().getPosition();
		        int x1 = position.getX();
		        int y1 = position.getY();
		          
		        driver.manage().window().setPosition(new Point(0, 0));
		        
		        driver.manage().window().maximize();
		        
		        
		        driver.manage().window().minimize();
		        
		        driver.manage().window().fullscreen();
		        
		        
		        
		        
		        
		

	}

}
