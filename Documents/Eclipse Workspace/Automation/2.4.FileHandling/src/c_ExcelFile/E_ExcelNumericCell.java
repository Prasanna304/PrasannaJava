package c_ExcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class E_ExcelNumericCell {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("/Users/Personal/Documents/Eclipse Workspace/Automation/2.4.FileHandling/File/Excel/E_ExcelNumericCell.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Home");
		int row = sheet.getLastRowNum() + 1;// add 1 because value is 0 1 2 so output is 3
		int cell = sheet.getRow(0).getLastCellNum();
		System.out.println(row);
		System.out.println(cell);

		/*
		 * Throws exception at 5 because 5th cell is a num 
		 * for(int i=0;i<row;i++) {
		 * for(int j=0;j<cell;j++) { 
		 * String data = sheet.getRow(i).getCell(j).getStringCellValue(); 
		 * System.out.print(data+" ");
		 * } System.out.println(""); }
		 */
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cell; j++) {
				if(sheet.getRow(i).getCell(j).getCellType()==Cell.CELL_TYPE_STRING) {
					String data = sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(data+" ");
				}
				else if(sheet.getRow(i).getCell(j).getCellType()==Cell.CELL_TYPE_NUMERIC) {
					 int data =(int) sheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(data+" ");
				}
			}
			System.out.println("");
		}
	}
}
