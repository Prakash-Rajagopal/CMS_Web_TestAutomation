package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicDataHandling {

	public static String[][] returnData(String filename,String sheetname) throws IOException {
		
		XSSFWorkbook wb=new XSSFWorkbook("./data/"+filename+".xlsx");
		XSSFSheet ws=wb.getSheet(sheetname);
		
		int rowcount = ws.getLastRowNum();
		short cellcount = ws.getRow(0).getLastCellNum();
		
		String[][] data=new String[rowcount][cellcount];
		
		for (int i = 1; i <= rowcount; i++) {
			for (int j = 0; j < cellcount; j++) {
				String cellvalue = ws.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=cellvalue;
			}
			
		}
		System.out.println(data[0][0]);
		System.out.println(data[0][1]);
		/*
		 * System.out.println(data[1][0]); System.out.println(data[1][1]);
		 */
		return data;
	}
}
