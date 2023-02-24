package com.api.helper;

import com.api.entity.FileDB;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Helper {


    //check that file is of excel type or not
    public static boolean checkExcelFormat(MultipartFile file) {

        String contentType = file.getContentType();

        if (contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
            return true;
        } else {
            return false;
        }

    }
    //convert excel to list of products

    public static List<FileDB> convertExcelToListOfProduct(InputStream is) {
        List<FileDB> list = new ArrayList<>();

        try {
            @SuppressWarnings("resource")
			XSSFWorkbook workbook = new XSSFWorkbook(is);
            XSSFSheet sheet = workbook.getSheet("Inventory_Latest.csv");
                      
            int rowNumber = 0;
            Iterator<Row> iterator = sheet.iterator();

            while (iterator.hasNext()) {
                Row row = iterator.next();
                
                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }

                Iterator<Cell> cells = row.iterator();

                int cid = 0;

                FileDB p = new FileDB();

                while (cells.hasNext()) {
                    Cell cell = cells.next();

                    switch (cid) {
                        case 0:
                            p.setOltNeId(cell.getStringCellValue());
                            break;
                        case 1:
                            p.setOlt(cell.getStringCellValue());
                            break;
                        case 2:
                            p.setType(cell.getStringCellValue());
                            break;
                        case 3:
                            p.setPon(cell.getStringCellValue());
                            break;
                        case 4:
                            p.setserialnumber(cell.getStringCellValue());
                            break;
                        case 5:
                            p.setZone(cell.getStringCellValue());
                            break;
                        case 6:
                            p.setSite(cell.getStringCellValue());
                            break;
                            
                        default:
                            break;
                    }
                    cid++;
                }
                list.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
