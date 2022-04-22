package _ss17_io_binary_file_and_serialization.excercise;

import java.io.*;
import java.util.List;

public class ReadAndWriteProduct {

    public static void writeFileBinary(String writePath, Object obj) {
        File file = new File(writePath);
        FileOutputStream os = null;
        ObjectOutputStream oos = null;
        try {
            os = new FileOutputStream(file);
            oos = new ObjectOutputStream(os);
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Object readFileBinary(String readPath) {
        File file = new File(readPath);
        FileInputStream is = null;
        ObjectInputStream ois = null;
        Object obj = null;
        try {
            is = new FileInputStream(file);
            ois = new ObjectInputStream(is);
            obj = ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return obj;
    }

    public static void writeFile(String filePath, List<Products> list) {
        try {
            FileWriter fileWriter = new FileWriter(filePath, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Products item : list) {
                bufferedWriter.write(item.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
