import java.io.*;
import java.util.ArrayList;

public class WriterFile {
    public static void WriterFile(ArrayList<String> data, String path){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream,"UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            for (int i = 0; i < data.size(); i++) {
                bufferedWriter.write(data.get(i));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();
            System.out.println("đã ghi file thành công");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("đã ghi file thất bại");
        }
    }
}
