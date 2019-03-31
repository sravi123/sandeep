package sample;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;

public class ReusableMethods {
	public WebDriver driver;
	public FileInputStream f;
	public Workbook wb;
	public Sheet s;
	
	
	
	//Method Name:launchApp
	//Description:To Launch Application
	//Author:Sravanthi
	//Date Created:30/MAR/2019
	//*********************************************************
	public void launchApp(String url,String sspath) throws Exception{
		System.setProperty("webdriver.geko.driver", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		driver=new FirefoxDriver();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File(sspath));
	}
//****************************************************************
	public void excel_Con(String path,String sname) throws Exception{
	f=new FileInputStream(path);
	wb=Workbook.getWorkbook(f);
	s=wb.getSheet(sname);
	}
	}

