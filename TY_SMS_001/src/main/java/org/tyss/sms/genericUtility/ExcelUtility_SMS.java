package org.tyss.sms.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility_SMS {
	public Workbook workbook;
	Sheet sheet;
	
	private String data;
	/**
	 * This method is used to initialize the Excel file
	 * @param smsExcelPath
	 */
	public void initializeExcelFile(String smsExcelPath) {
		
		try {
			
			FileInputStream fisExcel=new FileInputStream(smsExcelPath);
			try {
				workbook=WorkbookFactory.create(fisExcel);
			} catch (EncryptedDocumentException | IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	/**
	 * This method is used get data from excel file
	 * @param SheetName
	 * @param RowNum
	 * @param CellNum
	 * @return
	 */
	
	public String getDataFromExcelFile(String SheetName,int RowNum,int CellNum) {
		 sheet = workbook.getSheet(SheetName);
	  return new DataFormatter().formatCellValue(sheet.getRow(RowNum).getCell(CellNum));
		
		}
	
	public int retrieveDataFromExcel(String SheetName,int RowNum)
	{
		int data=workbook.getSheet(SheetName).getRow(RowNum).getLastCellNum();
		return data;
	
	}
	/**
	 * This method is used to put data or modify data into the Excel file
	 * @param SheetName
	 * @param RowNum
	 * @param CellNum
	 * @param value
	 */
	public void setDataToExcelFile(String SheetName,int RowNum,int CellNum,String value) {
		workbook.getSheet(SheetName).getRow(RowNum).getCell(CellNum).setCellValue(value);
	}
	public int getLastRowNum(String SheetName) {
		return workbook.getSheet(SheetName).getLastRowNum();
		
	}
	
	public int getLastCellNum(String SheetName,int row) {
		return workbook.getSheet(SheetName).getRow(row).getLastCellNum();
		
	}
	/**
	 * This method is used to write data to excel file.Actual writing happens here
	 * @param smsExcelPath
	 */
	public void saveDataToExcelFile(String smsExcelPath) {
		try {
			FileOutputStream fosExcel=new FileOutputStream(smsExcelPath);
			try {
				workbook.write(fosExcel);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	/**
	 * This method is used to close the Excel file
	 */
	public void CloseExcelFile() {
		try {
			workbook.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
}
