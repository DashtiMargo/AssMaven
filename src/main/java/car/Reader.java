package car;

import java.io.*;

public class Reader {
    public static void main(String[] args) {

        FileInputStream  fis = null;
        InputStreamReader sif = null;
        int b = 0;
        FileWriter fileWriter = null;
        String str = "ебучий поток";
        File file = new File("D:/zxcazzzzz.txt");
        try {
            fileWriter = new FileWriter(file, true);

            fileWriter.write((str));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            try {
                fileWriter.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
        }




            try {
             fis = new FileInputStream("D:/zxca.txt");
             sif = new InputStreamReader(fis, "UTF-8");
            while ((b = sif.read()) != -1) {
                System.out.println((char) b);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
