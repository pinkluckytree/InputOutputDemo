package Utils;

import java.io.*;

/**
 *
 */
public class InputUtils {
    public static void inputFunc(String filePath) throws IOException {
        String encoding = "UTF-8";
        File file = new File(filePath);
        if(file.isFile() && file.exists()){
            InputStreamReader reader = new InputStreamReader(new FileInputStream(file),encoding);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String everyLineText = null;
            while ((everyLineText=bufferedReader.readLine()) != null){
                System.out.println("everyLineText = " + everyLineText);
            }
            reader.close();
        }
        else {
            System.out.println("找不到指定文件"+filePath);
        }
    }

    public static void main(String[] args) {
        String filePath = "src/TestFiles/temp01.txt";
        try {
            inputFunc(filePath);
        } catch (IOException e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }

    }
}
