/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.staff;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import view.QuanTriView;

/**
 *
 * @author zzgia
 */
public class Xuatexcel {
public void excel(JTable tblTable,String tit,String fileName){
    XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet spreadsheet = workbook.createSheet("Staff");
        XSSFRow row = null;
        XSSFCell cell = null;

        //Font chu style2 cho QLKS
        XSSFFont font2 = workbook.createFont();
        font2.setBold(true);
        font2.setFontHeightInPoints((short) 16);  
        font2.setFontName("Times New Roman");
        XSSFCellStyle style2 = workbook.createCellStyle();
        style2.setFont(font2);

        //Font chu style3 cho ten DSach
        XSSFFont font3 = workbook.createFont();
        font3.setBold(true);
        font3.setFontHeightInPoints((short) 13);  
        font3.setFontName("Times New Roman");
        XSSFCellStyle style3 = workbook.createCellStyle();
        style3.setFont(font3);

        //Font chu style
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeightInPoints((short) 12);  
        font.setFontName("Times New Roman");

        XSSFCellStyle style = workbook.createCellStyle();
        //Mau nen
        style.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        //border
        style.setBorderTop(BorderStyle.THIN);
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
        //Text align
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setFont(font);

        //Row headder for table
        row = spreadsheet.createRow((short) 3);
        row.setHeight((short) 500);
        for (int i = 0; i < tblTable.getColumnCount() ; i++)
        {
            //Get ten cac column
            String valueAt = (String) tblTable.getColumnName(i);

            cell = row.createCell(i, CellType.STRING);
            cell.setCellStyle(style);
            cell.setCellValue(valueAt);
        }
        spreadsheet.autoSizeColumn(0);


        //Font chu style4
        XSSFFont font4 = workbook.createFont();
        font4.setFontHeightInPoints((short) 12);  
        font4.setFontName("Times New Roman");

        XSSFCellStyle style4 = workbook.createCellStyle();
//            //Mau nen
//            style4.setFillForegroundColor(IndexedColors.AQUA.getIndex());
//            style4.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        //border
        style4.setBorderBottom(BorderStyle.THIN );
        style4.setBorderRight(BorderStyle.THIN);
        //Align text
        style4.setAlignment(HorizontalAlignment.CENTER);
        style4.setFont(font4);

// -------------------------------------------------------------------TABLE---------------------------------------------------------------------
        
        String valueAt1 = "";
        staff pUpdate = null;

        for (int i = 0; i < tblTable.getRowCount(); i++) {
            row = spreadsheet.createRow((short) 4+i);
            row.setHeight((short) 500);
            for (int j = 0; j < tblTable.getColumnCount() ; j++){

                valueAt1 = (String) tblTable.getValueAt(i, j);
                cell = row.createCell(j, CellType.STRING);
                cell.setCellStyle(style4);
                cell.setCellValue(valueAt1);

            }

        }

        //Set with auto cho cac column 1-> cuoi
        for (int i = 1; i < tblTable.getColumnCount() ; i++)
        {
            spreadsheet.autoSizeColumn(i);

        }

        //Ten Dsach
        row = spreadsheet.createRow((short) 0);
        row.setHeight((short) 700);
        cell = row.createCell(0, CellType.STRING);
        cell.setCellStyle(style2);
        cell.setCellValue("QUẢN LÝ KHO");

        row = spreadsheet.createRow((short) 1);
        row.setHeight((short) 500);
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("DANH SÁCH "+tit);
        cell.setCellStyle(style3);

        FileOutputStream out;
        try {
            out = new FileOutputStream(new File("D:/java/"+fileName+".xlsx"));
            workbook.write(out);
            out.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuanTriView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(QuanTriView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public void excelPT(JTable tblTable,String tit,String fileName){
    XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet spreadsheet = workbook.createSheet("Staff");
        XSSFRow row = null;
        XSSFCell cell = null;

        //Font chu style2 cho QLKS
        XSSFFont font2 = workbook.createFont();
        font2.setBold(true);
        font2.setFontHeightInPoints((short) 16);  
        font2.setFontName("Times New Roman");
        XSSFCellStyle style2 = workbook.createCellStyle();
        style2.setFont(font2);

        //Font chu style3 cho ten DSach
        XSSFFont font3 = workbook.createFont();
        font3.setBold(true);
        font3.setFontHeightInPoints((short) 13);  
        font3.setFontName("Times New Roman");
        XSSFCellStyle style3 = workbook.createCellStyle();
        style3.setFont(font3);

        //Font chu style
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeightInPoints((short) 12);  
        font.setFontName("Times New Roman");

        XSSFCellStyle style = workbook.createCellStyle();
        //Mau nen
        style.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        //border
        style.setBorderTop(BorderStyle.THIN);
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
        //Text align
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setFont(font);

        //Row headder for table
        row = spreadsheet.createRow((short) 3);
        row.setHeight((short) 500);
        for (int i = 0; i < tblTable.getColumnCount() ; i++)
        {
            //Get ten cac column
            String valueAt = (String) tblTable.getColumnName(i);

            cell = row.createCell(i, CellType.STRING);
            cell.setCellStyle(style);
            cell.setCellValue(valueAt);
        }
        spreadsheet.autoSizeColumn(0);


        //Font chu style4
        XSSFFont font4 = workbook.createFont();
        font4.setFontHeightInPoints((short) 12);  
        font4.setFontName("Times New Roman");

        XSSFCellStyle style4 = workbook.createCellStyle();
//            //Mau nen
//            style4.setFillForegroundColor(IndexedColors.AQUA.getIndex());
//            style4.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        //border
        style4.setBorderBottom(BorderStyle.THIN );
        style4.setBorderRight(BorderStyle.THIN);
        //Align text
        style4.setAlignment(HorizontalAlignment.CENTER);
        style4.setFont(font4);

// -------------------------------------------------------------------TABLE---------------------------------------------------------------------
        
        String sanPham = "";
        String tenKH;
        String maPT;
        int SoLuong;
        Date valueTimeAt1;
        staff pUpdate = null;
        Double thanhTien;
        for (int i = 0; i < tblTable.getRowCount(); i++) {
            row = spreadsheet.createRow((short) 4+i);
            row.setHeight((short) 500);
//                4, sản phẩm,5 số lượng, 6 ngày bán, 7, thành tiền
                    maPT = (String) tblTable.getValueAt(i, 0);
                    cell = row.createCell(0, CellType.STRING);
                    cell.setCellStyle(style4);
                    cell.setCellValue(maPT);  
           

                    tenKH = (String) tblTable.getValueAt(i, 1);
                    cell = row.createCell(1, CellType.STRING);
                    cell.setCellStyle(style4);
                    cell.setCellValue(tenKH);  
                    System.out.println(tenKH);
                    

                    sanPham = (String) tblTable.getValueAt(i, 2);
                    cell = row.createCell(2, CellType.STRING);
                    cell.setCellStyle(style4);
                    cell.setCellValue(sanPham);       
                    
                    SoLuong = (Integer) tblTable.getValueAt(i, 3);
                    cell = row.createCell(3, CellType.NUMERIC);
                    cell.setCellStyle(style4);
                    cell.setCellValue(SoLuong);
                    
                    valueTimeAt1 = (Date) tblTable.getValueAt(i, 4);
                    cell = row.createCell(4, CellType.STRING);
                    cell.setCellStyle(style4);
                    cell.setCellValue(valueTimeAt1);
                    
                    thanhTien = (Double) tblTable.getValueAt(i, 5);
                    cell = row.createCell(5, CellType.STRING);
                    cell.setCellStyle(style4);
                    cell.setCellValue(thanhTien);
                    
                    
                    
        }

        //Set with auto cho cac column 1-> cuoi
        for (int i = 1; i < tblTable.getColumnCount() ; i++)
        {
            spreadsheet.autoSizeColumn(i);

        }

        //Ten Dsach
        row = spreadsheet.createRow((short) 0);
        row.setHeight((short) 700);
        cell = row.createCell(0, CellType.STRING);
        cell.setCellStyle(style2);
        cell.setCellValue("QUẢN LÝ KHÁCH SẠN");

        row = spreadsheet.createRow((short) 1);
        row.setHeight((short) 500);
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("DANH SÁCH "+tit);
        cell.setCellStyle(style3);

        FileOutputStream out;
        try {
            out = new FileOutputStream(new File("D:/java/"+fileName+".xlsx"),false);
            workbook.write(out);
            out.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuanTriView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(QuanTriView.class.getName()).log(Level.SEVERE, null, ex);
        }
}
public void ExcelHD(JTable tblTable,String tit,String fileName){
    XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet spreadsheet = workbook.createSheet("Staff");
        XSSFRow row = null;
        XSSFCell cell = null;

        //Font chu style2 cho QLKS
        XSSFFont font2 = workbook.createFont();
        font2.setBold(true);
        font2.setFontHeightInPoints((short) 16);  
        font2.setFontName("Times New Roman");
        XSSFCellStyle style2 = workbook.createCellStyle();
        style2.setFont(font2);

        //Font chu style3 cho ten DSach
        XSSFFont font3 = workbook.createFont();
        font3.setBold(true);
        font3.setFontHeightInPoints((short) 13);  
        font3.setFontName("Times New Roman");
        XSSFCellStyle style3 = workbook.createCellStyle();
        style3.setFont(font3);

        //Font chu style
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeightInPoints((short) 12);  
        font.setFontName("Times New Roman");

        XSSFCellStyle style = workbook.createCellStyle();
        //Mau nen
        style.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        //border
        style.setBorderTop(BorderStyle.THIN);
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
        //Text align
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setFont(font);

        //Row headder for table
        row = spreadsheet.createRow((short) 3);
        row.setHeight((short) 500);
        for (int i = 0; i < tblTable.getColumnCount() ; i++)
        {
            //Get ten cac column
            String valueAt = (String) tblTable.getColumnName(i);

            cell = row.createCell(i, CellType.STRING);
            cell.setCellStyle(style);
            cell.setCellValue(valueAt);
        }
        spreadsheet.autoSizeColumn(0);


        //Font chu style4
        XSSFFont font4 = workbook.createFont();
        font4.setFontHeightInPoints((short) 12);  
        font4.setFontName("Times New Roman");

        XSSFCellStyle style4 = workbook.createCellStyle();
//            //Mau nen
//            style4.setFillForegroundColor(IndexedColors.AQUA.getIndex());
//            style4.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        //border
        style4.setBorderBottom(BorderStyle.THIN );
        style4.setBorderRight(BorderStyle.THIN);
        //Align text
        style4.setAlignment(HorizontalAlignment.CENTER);
        style4.setFont(font4);

// -------------------------------------------------------------------TABLE---------------------------------------------------------------------
        
        String sanPham = "";
        String tenKH;
        String maHD;
        String maDP;
        String trangThai;
        Date valueTimeAt1;
        staff pUpdate = null;
        Double thanhTien;
        for (int i = 0; i < tblTable.getRowCount(); i++) {
            row = spreadsheet.createRow((short) 4+i);
            row.setHeight((short) 500);
//                4, sản phẩm,5 số lượng, 6 ngày bán, 7, thành tiền
                    maHD = (String) tblTable.getValueAt(i, 0);
                    cell = row.createCell(0, CellType.STRING);
                    cell.setCellStyle(style4);
                    cell.setCellValue(maHD);  
           

                    tenKH = (String) tblTable.getValueAt(i, 1);
                    cell = row.createCell(1, CellType.STRING);
                    cell.setCellStyle(style4);
                    cell.setCellValue(tenKH);  
                    System.out.println(tenKH);
                    

                    maDP = (String) tblTable.getValueAt(i, 2);
                    cell = row.createCell(2, CellType.STRING);
                    cell.setCellStyle(style4);
                    cell.setCellValue(maDP);       
              
                    
                    valueTimeAt1 = (Date) tblTable.getValueAt(i, 3);
                    cell = row.createCell(3, CellType.STRING);
                    cell.setCellStyle(style4);
                    cell.setCellValue(valueTimeAt1);
                    
                    thanhTien = (Double) tblTable.getValueAt(i, 4);
                    cell = row.createCell(4, CellType.STRING);
                    cell.setCellStyle(style4);
                    cell.setCellValue(thanhTien);
                    
                     trangThai = (String) tblTable.getValueAt(i, 5);
                    cell = row.createCell(5, CellType.STRING);
                    cell.setCellStyle(style4);
                    cell.setCellValue(trangThai); 
                    
                    
                    
        }

        //Set with auto cho cac column 1-> cuoi
        for (int i = 1; i < tblTable.getColumnCount() ; i++)
        {
            spreadsheet.autoSizeColumn(i);

        }

        //Ten Dsach
        row = spreadsheet.createRow((short) 0);
        row.setHeight((short) 700);
        cell = row.createCell(0, CellType.STRING);
        cell.setCellStyle(style2);
        cell.setCellValue("QUẢN LÝ KHÁCH SẠN");

        row = spreadsheet.createRow((short) 1);
        row.setHeight((short) 500);
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("DANH SÁCH "+tit);
        cell.setCellStyle(style3);

        FileOutputStream out;
        try {
            out = new FileOutputStream(new File("D:/java/"+fileName+".xlsx"),false);
            workbook.write(out);
            out.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuanTriView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(QuanTriView.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
