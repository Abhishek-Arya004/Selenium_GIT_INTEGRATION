package com.selenium;

import org.openqa.selenium.Pdf;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PrintOptions;

import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Base64;
import java.io.FileOutputStream;

public class Printpage {

	
	public static void main(String[] args) throws Exception {
	 ChromeOptions options = new ChromeOptions();
	 
     options.addArguments("--headless=new"); // REQUIRED for printing

     WebDriver driver = new ChromeDriver(options);

     driver.get("https://www.selenium.dev");

     // Correctly declare printer
     PrintsPage printer = (PrintsPage) driver;

     PrintOptions printOptions = new PrintOptions();
     printOptions.setPageRanges("1-2");

     Pdf pdf = printer.print(printOptions);

     // Decode Base64 PDF content
     byte[] pdfBytes = Base64.getDecoder().decode(pdf.getContent());

     // Save PDF file
     try (FileOutputStream fos = new FileOutputStream("selenium.pdf")) {
         fos.write(pdfBytes);
     }

     driver.quit();

	}

}
