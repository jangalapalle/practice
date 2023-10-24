package com.framework.dataacess;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	static Sheet sheet;

	static Map<String, HashMap<String, String>> rowData = new HashMap<String, HashMap<String, String>>();

	public static void initializeExcel() {
		Workbook wbook;

		String path = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\OrangeHRM_TestData.xlsx";
		try {
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);

			if (path.endsWith(".xlsx")) {
				wbook = new XSSFWorkbook(fis);
			} else {
				wbook = new HSSFWorkbook(fis);
			}
			sheet = wbook.getSheet("TestData");
		} catch (Exception e) {

		}
	}

	public static void readAllDataFromExcel() {		
		
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			HashMap<String, String> cellData = new HashMap<String, String>();
			String testCaseName = sheet.getRow(i).getCell(0).getStringCellValue();
			int lastCellNum = sheet.getRow(i).getLastCellNum();
			for (int j = 1; j < lastCellNum; j++) {
				String colName = sheet.getRow(0).getCell(j).getStringCellValue();
				String colValue = sheet.getRow(i).getCell(j).getStringCellValue();
				cellData.put(colName, colValue);
			}

			rowData.put(testCaseName, cellData);
			System.out.println(rowData);
		}

	}

	public static String readData(String testName, String colName) {

		String value = rowData.get(testName).get(colName);

		return value;
	}

	public static void main(String args[]) {
		initializeExcel();
		readAllDataFromExcel();
		System.out.println(readData("loginWithBlankPassword", "lname"));

	}

}
