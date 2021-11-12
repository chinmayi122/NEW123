package com.vtiger.genericLib;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.Iterator;
	import java.util.Set;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.WebDriver;
	/**
	 * 
	 * @author chinmayi avinash
	 *
	 */
	public class excelUtility {
		/**
		 * its used to get data from excel
		 * @param sheet takes String as arguments
		 * @param row   takes int  as arguments
		 * @param cell  takes int as arguments
		 * @return String values
		 * @throws EncryptedDocumentException
		 * @throws IOException
		 */
		public String getExcelData(String sheet,int row, int cell) throws EncryptedDocumentException, IOException
		{
			FileInputStream file = new FileInputStream("./commonData/Book12.xlsx");
			String value=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
			return value;
		}
		/**
		 * its used to set data in excel file
		 * @param sheet takes String as arguments
		 * @param row   takes int as arguments
		 * @param cell  takes int as arguments
		 * @param value
		 * @throws EncryptedDocumentException
		 * @throws IOException
		 */
		public void setDataInExcel(String sheet,int row,int cell, String value) throws EncryptedDocumentException, IOException
		{
			FileInputStream file = new FileInputStream("./commonData/Book12.xlsx");
			Workbook wb = WorkbookFactory.create(file);
			wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(value);
			FileOutputStream f= new FileOutputStream("./commonData/Book12.xlsx");
			wb.write(f);
			wb.close();
		}
		
	}



