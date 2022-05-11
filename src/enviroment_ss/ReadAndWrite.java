package enviroment_ss;

import _super_case_study.models.facility.Facility;
import _super_case_study.models.facility.House;
import _super_case_study.models.facility.Room;
import _super_case_study.models.facility.Villa;
import added_excercises.excercise2.Subject;

import javax.swing.*;
import java.io.*;
import java.lang.reflect.Type;
import java.util.*;

public class ReadAndWrite {

    public static final String VILLA_PATH = "src/_super_case_study/data/villa.csv";
    public static final String ROOM_PATH = "src/_super_case_study/data/room.csv";
    public static final String HOUSE_PATH = "src/_super_case_study/data/house.csv";
    public static final String FACILITY_PATH = "src/_super_case_study/data/facility.csv";
    private static final String FACILITY_FILE_HEADER = "ID,SERVICE NAME,USABLE AREA,RENTAL COST,MAX ACCOMMODATE, RENTAL TYPE";

    public static void writeFacilityToCsv(Map<Facility, Integer> map, String path) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                System.err.println("Not found the path of file to write data");
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            bufferedWriter.write(fileHeader(path));
            for (Map.Entry<Facility, Integer> item : map.entrySet()) {
                line = item.getKey().makeText() + "," + item.getValue();
                if (checkToWrite(path, line)) {
                    bufferedWriter.newLine();
                    bufferedWriter.write(line);
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error at write to file csv");
        }
    }

    public static LinkedHashMap<Facility, Integer> readFacilityFromFile() {
        LinkedHashMap<Facility, Integer> facilityMap = new LinkedHashMap<>();
        File file = new File(FACILITY_PATH);
        if (!file.exists()){
            try{
                throw new  FileNotFoundException("Not found the file csv to write data");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            String[] arr;
            Villa villa;
            House house;
            Room room;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                if (arr[0].equals("ID") || arr[0].equals("FACILITY INFORMATION")) {
                    continue;
                }
                if (arr[0].contains("SVVL")) {
                    villa = new Villa(arr[0],
                            arr[1],
                            Double.parseDouble(arr[2]),
                            Double.parseDouble(arr[3]),
                            Integer.parseInt(arr[4]),
                            arr[5], arr[6],
                            Double.parseDouble(arr[7]),
                            Integer.parseInt(arr[8]));
                    facilityMap.put(villa, Integer.parseInt(arr[9]));
                } else if (arr[0].contains("SVHO")) {
                    house = new House(arr[0],
                            arr[1],
                            Double.parseDouble(arr[2]),
                            Double.parseDouble(arr[3]),
                            Integer.parseInt(arr[4]),
                            arr[5],
                            arr[6],
                            Integer.parseInt(arr[7]));
                    facilityMap.put(house, Integer.parseInt(arr[8]));
                } else {
                    room = new Room(arr[0],
                            arr[1],
                            Double.parseDouble(arr[2]),
                            Double.parseDouble(arr[3]),
                            Integer.parseInt(arr[4]),
                            arr[5],
                            arr[6]);
                    facilityMap.put(room, Integer.parseInt(arr[7]));
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Error at read data from csv file!!");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
        }
        return facilityMap;
    }

        public static String fileHeader(String path) {
        String header = "";
        switch (path){
            case VILLA_PATH:
                header = FACILITY_FILE_HEADER + ",STANDARD OF ROOM,POOL AREA,NUMBER OF FLOOR,BOOKINGS";
                break;
            case HOUSE_PATH:
                header = FACILITY_FILE_HEADER + ",STANDARD OF ROOM,NUMBER OF FLOOR,BOOKINGS";
                break;
            case  ROOM_PATH:
                header = FACILITY_FILE_HEADER + ",FREE SERVICE,BOOKINGS";
                break;
            default:
                header = "FACILITY INFORMATION";
        }
        return header;
    }

    public static boolean checkToWrite(String path, String line) {
        boolean check = false;
        if ((path.equals(VILLA_PATH) && line.contains("SVVL"))
                || (path.equals(HOUSE_PATH) && line.contains("SVHO"))
                || (path.equals(ROOM_PATH) && line.contains("SVRO") || path.equals(FACILITY_PATH))) {
            check = true;
        }
        return check;
    }

    public static boolean checkToWriteCsv(String path, String line) {
        String [] arr = line.split(",");
        boolean check = false;
        if ((path.equals(VILLA_PATH) && arr.length ==7)
                || (path.equals(HOUSE_PATH) && arr.length ==8)
                || (path.equals(ROOM_PATH) && arr.length ==9) || path.equals(FACILITY_PATH)) {
            check = true;
        }
        return check;
    }


    public static final String SUBJECT_PATH = "src/added_excercises/excercise2/subject.csv";
    public static final String SUBJECT_HEADER = "CODE,NAME,VERSION,LEVEL,STUDY TIME";

    public static void writeSubject(List<Subject> list, String path) {
        File file = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            if (!file.exists()){
                throw new FileNotFoundException("File not found!!");
            }
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line="";
//            bufferedWriter.write(fileHeader(path));
            for (Subject subject: list) {
                line = subject.makeText();
//                if (checkToWrite(path, line)){
                    bufferedWriter.newLine();
                    bufferedWriter.write(line);
//                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            try{
                if (bufferedWriter != null){
                    bufferedWriter.close();
                    fileWriter.close();
                }
            }catch (IOException e){
                System.err.println("Error at write subject to Csv!!");
            }
        }
    }

    public static List<Subject> readSubject(){
        List<Subject> subjectList = new LinkedList<>();
        File file = new File(SUBJECT_PATH);
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String [] array;
            Subject subject;
            while ((line = bufferedReader.readLine()) != null){
                array = line.split(",");
                if (array[0].contains("CODE")){
                    continue;
                }
                subject = new Subject(array[0],array[1], array[2], array[3], Integer.parseInt(array[4]));
                subjectList.add(subject);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.err.println("Error at read subject to Csv!!");
        }
        return subjectList;
    }
}
