//package com.vankeytech.pmp.pms.util;
//
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.OutputStream;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import javax.annotation.Resource;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.vankeytech.pmp.pms.entity.PmsInformAnnouncement;
//import com.vankeytech.pmp.pms.service.PmsInformAnnouncementService;
//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFCellStyle;
//import org.apache.poi.hssf.usermodel.HSSFFont;
//import org.apache.poi.hssf.usermodel.HSSFRichTextString;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.hssf.util.HSSFColor;
//
//public class ExcelExportUtil extends HttpServlet{
//    @Resource
//    private PmsInformAnnouncementService pmsInformAnnouncementService;
//
//    //访问网址：http://localhost:8080/excelExport/servlet/ExcelExportServlet
//    @Override
//    public void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("octets/stream");
////      response.addHeader("Content-Disposition", "attachment;filename=test.xls");
//        String excelName = "学生信息表";
//        //转码防止乱码
//        response.addHeader("Content-Disposition", "attachment;filename="+new String( excelName.getBytes("gb2312"), "ISO8859-1" )+".xls");
//        String[] headers = new String[]{"编号","姓名","年龄","性别"};
//        try {
//            OutputStream out = response.getOutputStream();
//            exportExcel(excelName,headers, getList(), out,"yyyy-MM-dd");
//            out.close();
//            System.out.println("excel导出成功！");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    @Override
//    public void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        doGet(request, response);
//    }
//    /**
//     *
//     * @Description:
//     * @Auther: lujinyong
//     * @Date: 2013-8-22 下午2:53:58
//     */
//    public List<PmsInformAnnouncement> getList(){
//        List<PmsInformAnnouncement> pmsList= pmsInformAnnouncementService.selectAll();
//        return pmsList;
//    }
//    /**
//     *
//     * @Description: 生成excel并导出到客户端（本地）
//     * @Auther: lujinyong
//     * @Date: 2013-8-22 下午3:05:49
//     */
//    protected void exportExcel(String title,String[] headers,List mapList,OutputStream out,String pattern){
//        //声明一个工作簿
//        HSSFWorkbook workbook = new HSSFWorkbook();
//        //生成一个表格
//        HSSFSheet sheet = workbook.createSheet(title);
//        //设置表格默认列宽度为15个字符
//        sheet.setDefaultColumnWidth(20);
//        //生成一个样式，用来设置标题样式
//        HSSFCellStyle style = workbook.createCellStyle();
//        //设置这些样式
//        style.setFillForegroundColor(HSSFColor.SKY_BLUE.index);
//        style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
//        style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
//        style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
//        style.setBorderRight(HSSFCellStyle.BORDER_THIN);
//        style.setBorderTop(HSSFCellStyle.BORDER_THIN);
//        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
//        //生成一个字体
//        HSSFFont font = workbook.createFont();
//        font.setColor(HSSFColor.VIOLET.index);
//        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
//        //把字体应用到当前的样式
//        style.setFont(font);
//        // 生成并设置另一个样式,用于设置内容样式
//        HSSFCellStyle style2 = workbook.createCellStyle();
//        style2.setFillForegroundColor(HSSFColor.LIGHT_YELLOW.index);
//        style2.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
//        style2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
//        style2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
//        style2.setBorderRight(HSSFCellStyle.BORDER_THIN);
//        style2.setBorderTop(HSSFCellStyle.BORDER_THIN);
//        style2.setAlignment(HSSFCellStyle.ALIGN_CENTER);
//        style2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
//        // 生成另一个字体
//        HSSFFont font2 = workbook.createFont();
//        font2.setBold(HSSFFont.BOLDWEIGHT_NORMAL);
//        // 把字体应用到当前的样式
//        style2.setFont(font2);
//        //产生表格标题行
//        HSSFRow row = sheet.createRow(0);
//        for(int i = 0; i<headers.length;i++){
//            HSSFCell cell = row.createCell(i);
//            cell.setCellStyle(style);
//            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
//            cell.setCellValue(text);
//        }
//        for (int i=0;i<mapList.size();i++) {
//            Map<String,Object> map = (Map<String, Object>) mapList.get(i);
//            row = sheet.createRow(i+1);
//            int j = 0;
//            Object value = null;
//            value=map.get("number");
//            if(value instanceof Integer){
//                row.createCell(j++).setCellValue(String.valueOf(value));
//            }
//            row.createCell(j++).setCellValue(map.get("name").toString());
//            value=map.get("age");
//            if(value instanceof Integer){
//                row.createCell(j++).setCellValue(String.valueOf(value));
//            }
//            row.createCell(j++).setCellValue("0".equals(map.get("sex").toString())?"女":"男");
//        }
//        try {
//            workbook.write(out);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//
//
//
//    }
//}
