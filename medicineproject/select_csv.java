package csv.select;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class select_csv {
    public static void main(String[] args) {
        File csvFile = null;
        BufferedWriter csvFileOutputStream = null;
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("E:\\jupyter\\医疗\\20200.csv")));
            //BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new ))
            //CsvWriter csvWriter = new CsvWriter("F:/demo.csv", ',', Charset.forName("UTF-8"));
            // 写表头和内容，因为csv文件中区分没有那么明确，所以都使用同一函数，写成功就行
            //csvWriter.writeRecord(headers);
            //csvWriter.writeRecord(content);
            // 关闭csvWriter
            //csvWriter.close();
            String outPutPath="E:\\jupyter\\医疗";
            File file = new File(outPutPath);
            if (!file.exists()) {
                if (file.mkdirs()) {
                    System.out.println("创建成功");
                } else {
                    System.out.println("创建失败");
                }
            }
            //定义文件名格式并创建
            csvFile = File.createTempFile("2020sel", ".csv", new File(outPutPath));
            csvFileOutputStream = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(csvFile), StandardCharsets.UTF_8), 1024);
            /*for (List<String> exportDatum : exportData) {
                writeRow(exportDatum, csvFileOutputStream);
                csvFileOutputStream.newLine();
            }*/

            /*String line=br.readLine();
            String[] item=line.split(",");

            System.out.println(br.readLine());*/
            String line="";
            while((line=br.readLine())!=null)
            {

                String[] item = line.split(",");
                if(item.length<=7)
                {
                    continue;
                }
                else {
                    csvFileOutputStream.write(item[1] + "," + item[3] + "," + item[4] + "," + item[9] + "," + item[11] + "," + item[12] + "," + item[13] + "," + item[14] + "," + item[15] + "," + item[16] + "," + item[17] + "," + item[21] + "," + item[22] + "," + item[25] + "," + item[45] + "," + item[50] + "," + item[51] + "," + item[52]);
                    csvFileOutputStream.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (csvFileOutputStream != null) {
                    csvFileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
