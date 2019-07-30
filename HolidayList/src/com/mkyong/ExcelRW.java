package com.mkyong;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRW {
	
	private static Workbook wb;
	private static Sheet sh;
	private static FileInputStream fis;
	private static FileOutputStream fos;
	private static Row row;
	private static Cell cell;

	public static void main(String[] args) throws Exception {
		
		fis=new FileInputStream("C:/Users/rahul.raj/Downloads/HolidayList/testdata.xlsx");
		wb = WorkbookFactory.create(fis);
		sh = wb.getSheet("Sheet1");
		int noOfRows = sh.getLastRowNum();
		System.out.println(noOfRows);
		

		row =sh.createRow(5);
		cell = row.createCell(4);
		cell.setCellValue("QAV");
		System.out.println(cell.getStringCellValue());
		fos =new FileOutputStream("C:/Users/rahul.raj/Downloads/HolidayList/testdata.xlsx");
		wb.write(fos);
		fos.flush();
		System.out.println("Done");
	}

}
