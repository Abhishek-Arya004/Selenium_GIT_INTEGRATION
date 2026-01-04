package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ActionAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
//		
//		
//		
//
//		// long start = System.currentTimeMillis();
//
//		WebElement clickable = driver.findElement(By.id("clickable"));
//
		Actions actions = new Actions(driver);

		// actions.moveToElement(clickable).pause(Duration.ofMillis(2000)).clickAndHold().pause(Duration.ofMillis(2000))
		// .sendKeys("abc").perform();

		// actions.clickAndHold(clickable).keyDown(Keys.SHIFT).sendKeys("a").perform();

		// ((RemoteWebDriver) driver).resetInputState();

		// actions.sendKeys("a").perform();

		// actions.moveToElement(clickable).pause(Duration.ofSeconds(1)).clickAndHold()
		// .pause(Duration.ofSeconds(1)).sendKeys("abc").perform();

		// new
		// Actions(driver).moveToElement(clickable).pause(Duration.ofSeconds(1)).clickAndHold()
		// .pause(Duration.ofSeconds(1)).sendKeys("abc").perform();

		// actions.moveToElement(clickable).doubleClick(clickable).perform();

		// actions.moveToElement(clickable).contextClick(clickable).perform();

//		WebElement draggable = driver.findElement(By.id("draggable"));
//		WebElement droppable = driver.findElement(By.id("droppable"));

		// actions.dragAndDrop(draggable, droppable).perform();
//
//		Rectangle start = draggable.getRect();
//		Rectangle finish = driver.findElement(By.id("droppable")).getRect();
//		
//		actions.dragAndDropBy(draggable, 0, 88)
//				.perform();
//
//		
//		System.out.println(finish.getX() - start.getX());
//		
//
//		System.out.println(finish.getY() - start.getY());

		driver.get(
				"https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");

	//	WebElement iframe = driver.findElement(By.tagName("iframe"));
	//	actions.scrollToElement(iframe).perform();
		
		
		  WebElement footer = driver.findElement(By.tagName("footer"));
	        int deltaY = footer.getRect().y;
	        new Actions(driver)
	                .scrollByAmount(0, deltaY)
	                .perform();
	        
	        Rectangle start = driver.findElement(By.tagName("footer")).getRect();
	        
	        start.getX();
	        
	        start.getY();
	        
	        
	        System.out.println(start.getX() + " " + start.getY());
	        

	}

}
