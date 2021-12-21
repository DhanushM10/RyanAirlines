package org.utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RyanBaseClass {
	public static WebDriver driver;
	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void printTitle() {
		System.out.println(driver.getTitle());
	}
	public static void printCurrentUrl() {
		System.out.println(driver.getCurrentUrl());
	}
	public static void txtclick(WebElement e) {
		e.click();
	}
	public static void loginClick(WebElement el) {
		el.click();	
	}
	public static void fill(WebElement ele,String value) {
		ele.sendKeys(value);
	}
	public static void btnClick(WebElement e) {
		e.click();
	}
	public static String getData(int rowNumber, int cellNumber) throws IOException {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\RyanAirlines\\target\\Book1.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(rowNumber);
		Cell c = r.getCell(cellNumber);
		int cellType = c.getCellType();
		
		String value="";
		if (cellType==1) {
			 value = c.getStringCellValue();
		}else if (cellType==0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				SimpleDateFormat sim = new  SimpleDateFormat("dd,MMMM,yyyy");
				value = sim.format(d);	
			} else {
				double d = c.getNumericCellValue();
				long l = (long)d;
				value = String.valueOf(l);
			}	
		}
		
		return value;
	}

}
