package _super_ss_testall.test_file;

import _05_access_modifier_static.excercise.added_exercise_mr_chien.Student;
import _super_case_study.models.facility.Facility;
import _super_case_study.models.facility.House;
import _super_case_study.models.facility.Villa;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestFileClass {
    public static final String PATH = "src/_super_ss_testall/test_file/data.csv";
    public static void main(String[] args) throws IOException {



//        String id,
//        String serviceName,
//        double usingArea,
//        double rentCost,
//        int maximumMember,
//        String typeOfUsing,
//        String standardOfRoom,
//        double poolArea,
//        int numOfFloor
        List<Object> newList = new ArrayList<>();

        Villa villa = new Villa("ABC",
                "Villa1",
                5000,
                500, 4,
                "Month", "Standard",
                300, 5);
        newList.add(villa);

        //write file
        writeFileObject(PATH, newList);

    }

    public static void writeFileObject(String path, Object obj){
        File file = createFile(path);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static Object readObject(String path){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Object obj = null;
        try {
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);
            obj = ois.readObject();
            return obj;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static File createFile(String path){
        File file = new File(path);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

}

