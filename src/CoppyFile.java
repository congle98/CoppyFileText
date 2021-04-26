import java.io.*;
import java.util.ArrayList;

public class CoppyFile {
    public static void Coppy(String pathFrom,String pathTo){
        FileInputStream fileInputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        FileOutputStream fileOutputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileInputStream = new FileInputStream(pathFrom);
            inputStreamReader = new InputStreamReader(fileInputStream,"UTF-8");
            bufferedReader = new BufferedReader(inputStreamReader);
            fileOutputStream = new FileOutputStream(pathTo);
            outputStreamWriter = new OutputStreamWriter(fileOutputStream,"UTF8");
            bufferedWriter = new BufferedWriter(outputStreamWriter);
            String line = bufferedReader.readLine();
            while (line!=null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
            }
            System.out.println("CoppyFile thành công");

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedReader.close();
                bufferedWriter.close();
                inputStreamReader.close();
                outputStreamWriter.close();
                fileInputStream.close();
                fileOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
