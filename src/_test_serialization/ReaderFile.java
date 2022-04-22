package _test_serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderFile {

    public static void writerFileBinary(String path, Object obj){
        //tạo ra một đối tượng file có đường dẫn được truyền vào
        File file = new File(path);
        //tạo ra một đối tượng fileoutputstream
        FileOutputStream os = null;
        //tạo ra đối tượng object
        ObjectOutputStream oos = null;
        try {
            os = new FileOutputStream(file);
            oos = new ObjectOutputStream(os);
            oos.writeObject(obj);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static Object readFileBinary(String path) throws IOException {

        File file = new File(path);
        FileInputStream is = null;
        ObjectInputStream ois = null;
        Object obj = null;
        try {
            is = new FileInputStream(file);
            ois = new ObjectInputStream(is);
            obj = ois.readObject();
            return obj;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            is.close();
        }
        return null;
    }





    public static List<String[]> readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String[]> listStr = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] arrStr = line.split(",");
                listStr.add(arrStr);
            }
            return listStr;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
            fileReader.close();
        }

        return null;
    }
}
