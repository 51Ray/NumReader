import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Parser {

    public static ArrayList<String> getList(String f) throws IOException {

        ArrayList<String> numList = new ArrayList<String>();
        HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream(f));

        Sheet sheet = myExcelBook.getSheetAt(0);
        Iterator<Row> it = sheet.iterator();
        while (it.hasNext()) {
            Row row = it.next();
            Iterator<Cell> cells = row.iterator();
            while (cells.hasNext()) {
                Cell cell = cells.next();
                int cellType = cell.getCellType();
                switch (cellType) {
                    case Cell.CELL_TYPE_STRING:
                        numList.add(cell.getStringCellValue());
                        break;
                }
            }
        }

        return numList;
    }

}