package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenSample {

	public static void main(String[] args) throws IOException{
		//To Locate the file where we have to create
		
				File file=new File("C:\\newDaySample\\selenium\\manual\\Book2.xlsx");
				
				Workbook book=new XSSFWorkbook();
				
				//To create excel sheet  from the workbook
				
				Sheet createSheet = book.createSheet("login");
				
				createSheet.createRow(0).createCell(0).setCellValue("vasanth");
				
				createSheet.createRow(0).createCell(1).setCellValue("rajarajan");
				
				
				
				System.out.println("Sheet will be created: " + createSheet );
				
				FileOutputStream out=new FileOutputStream(file);//throws FileNOtFoundException
				
				//To write values to the created workbook
				
				book.write(out);//throws IO Exception
				
				
				
				
			}
	}
