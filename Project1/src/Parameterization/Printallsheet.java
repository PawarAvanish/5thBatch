package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;





public class Printallsheet {
	


	public static void main(String[] args) throws IOException {
		
	 FileInputStream  file= new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Book2.xlsx");
	Sheet sheet2 = WorkbookFactory.create(file).getSheet("Sheet2");
	
	for(int i=0;i<=sheet2.getLastRowNum();i++) {
	
	for(int j=0;j<=sheet2.getRow(i).getLastCellNum()-1;j++) {
		
		 Cell cellinfo = sheet2.getRow(i).getCell(j);
		
		 CellType CT = cellinfo.getCellType();
		
		if(CT==CellType.STRING) {
			System.out.print(cellinfo.getStringCellValue()+" ");
		}
		else if(CT==CellType.NUMERIC) {
			System.out.print(cellinfo.getNumericCellValue()+" ");
		}
		
		else if(CT==CellType.BOOLEAN) {
			System.out.print(cellinfo.getBooleanCellValue()+" ");
			
		}
		
	}
	System.out.println();
		}
	}

	}   


