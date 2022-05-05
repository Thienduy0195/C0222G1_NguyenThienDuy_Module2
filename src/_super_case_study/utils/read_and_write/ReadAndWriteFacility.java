package _super_case_study.utils.read_and_write;

import _super_case_study.models.facility.Facility;
import _super_case_study.models.facility.House;
import _super_case_study.models.facility.Room;
import _super_case_study.models.facility.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadAndWriteFacility {
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
                e.printStackTrace();
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(path);
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
            System.out.println("File not found error at Write facility");
        }
    }

    public static LinkedHashMap<Facility, Integer> readFacilityFromFile() {
        LinkedHashMap<Facility, Integer> facilityMap = new LinkedHashMap<>();
        try {
            File file = new File(FACILITY_PATH);
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
            System.err.println("File not found at readFacilityFromFile");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
        }
        return facilityMap;
    }


    public static String fileHeader(String path) {
        String header = "";
        if (path.equals(VILLA_PATH)) {
            header = FACILITY_FILE_HEADER + ",STANDARD OF ROOM,POOL AREA,NUMBER OF FLOOR,BOOKINGS";
        } else if (path.equals(HOUSE_PATH)) {
            header = FACILITY_FILE_HEADER + ",STANDARD OF ROOM,NUMBER OF FLOOR,BOOKINGS";
        } else if (path.equals(ROOM_PATH)) {
            header = FACILITY_FILE_HEADER + ",FREE SERVICE,BOOKINGS";
        } else {
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
}
