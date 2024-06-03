


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BookMain {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new 	File("data.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        Sheet sheet = workbook.getSheetAt(0);

        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < row.getLastCellNum(); j++) {
                Cell cell = row.getCell(j);
                System.out.print(cell.getStringCellValue() + "\t");
            }
            System.out.println();
        }

        fis.close();
    }
}
}
