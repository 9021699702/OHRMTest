package com.seleniumModule.FOUR;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Handling {

	public static void main(String[] args) throws IOException {

		String filePath = "./src/test/java/com/seleniumModule/FOUR/guru99 user.xlsx";
		 XSSFWorkbook workbook = new XSSFWorkbook(filePath);
			XSSFSheet sheet = workbook.getSheet("sheet1");
			
			int rowCount = sheet.getPhysicalNumberOfRows();
			int colCount = sheet.getRow(0).getLastCellNum();
			System.out.println("Row Count is" +rowCount);
			System.out.println("Column Count is" +colCount);
			Object[][] data = new Object[rowCount][colCount];
			for(int row = 0;row < rowCount; row++) {
				for (int col = 0;col < colCount; col++) {
				System.out.println(sheet.getRow(row).getCell(col).getStringCellValue());
				}
			}
		
		
		
	}

static String filePath;
static XSSFWorkbook workbook;
static XSSFSheet sheet;

public Excel_Handling() throws IOException {
	
	filePath = "./src/test/java/com/seleniumModule/FOUR/guru99 user.xlsx";
	workbook = new XSSFWorkbook(filePath);
	sheet = workbook.getSheet("sheet1");
}
	public int getRowCount() {
		return sheet.getPhysicalNumberOfRows();
	}
	
	public int getColCount() {
		return sheet.getRow(0).getLastCellNum();
	}
	
	public String getValue(int row, int col) {
		return sheet.getRow(row).getCell(col).getStringCellValue();
	}
	public Object[][] getData() {
		// TODO Auto-generated method stub
		return null;
	}
		
}






