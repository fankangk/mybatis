package com.fankk;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.*;

/**
 * @Auther: fankk
 * @Date: 2018/10/11 08:42
 * @Desc:
 */
public class GainJarTest extends BaseTestApplication1 {


    public static ArrayList<File> getFiles(String path) {
        ArrayList<File> files = new ArrayList<File>();
        File file = new File(path);
        File[] tempList = file.listFiles();

        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile()) {
                files.add(tempList[i]);
            }

        }
        return files;
    }



    public static String  getXmlContent (File file) throws Exception{

        SAXReader reader = new SAXReader();
        Document document = reader.read(file);
        Element root = document.getRootElement();
        Element libraryElem = root.element("library");//首先要知道自己要操作的节点。
        String str= libraryElem.attributeValue("name");
        return str;

    }



    public static void writeXls(HSSFSheet sheet,int index,String[] content) throws Exception {

        Row row = sheet.createRow(index);
        for(int i=0;i<content.length;i++){
            Cell cell = row.createCell(i);
            cell.setCellValue(content[i]);
        }
    }
    public static void outFile(HSSFWorkbook workbook, String path) throws Exception {
        OutputStream os = null;
        os = new FileOutputStream(new File(path));
        workbook.write(os);
        os.close();

    }


    @Test
    public  void test()  throws Exception{
        //D:\source\ordercenter\.idea\libraries  D:\testTemp
        String path="D:\\testTemp\\libraries";
        ArrayList<File> fileList= getFiles(path);
        System.out.println("文件数量 ："+fileList.size());
        ArrayList<String> stringList = new  ArrayList<String>();
        for(File file :fileList){
            String re = getXmlContent(file).substring(6).replaceAll(" ","");
            stringList.add(re);
        }

        HSSFWorkbook workbook = new HSSFWorkbook();
        // 创建一个sheet工作表
        HSSFSheet sheet = workbook.createSheet("sheet1");
        //设置表头
        int row =0;
        String[] title={"序号","文件名","groupId","artifactId","version","Respository ID"};
        writeXls(sheet,row,title);
        //写内容
        Collections.sort(stringList);

        System.out.println("字符串数量 ："+stringList.size());
        for(String str :stringList){

            String[] content =str.split(":") ;
            String[] content1 = new  String[title.length];
            content1[0]=String.valueOf(row);
            content1[1]=content[1]+"-"+content[2]+".jar";
            content1[2]=content[0];
            content1[3]=content[1];
            content1[4]=content[2];
            row++;
            writeXls(sheet,row,content1);
        }
       // outFile(workbook, "D:\\testTemp\\target\\jar.xls");

    }
}
