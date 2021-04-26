import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReaderFile {
    public static ArrayList<String>readerFile(String path){
        ArrayList<String> data = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = bufferedReader.readLine();
            while (line!=null){
                data.add(line);
                line=bufferedReader.readLine();
            }
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
//    public static String readerFile(String path){
//        String all ="";
//        try {
//            FileInputStream fileInputStream = new FileInputStream(path);
//            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"UTF-8");
//            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//            String line = bufferedReader.readLine();
//            while (line!=null){
//                all +=line+"\n";
//                line =bufferedReader.readLine();
//            }
//            bufferedReader.close();
//            inputStreamReader.close();
//            fileInputStream.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return all;
//    }
}
