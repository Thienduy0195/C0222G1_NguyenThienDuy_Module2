package test_all_exam.utils;

import test_all_exam.models.booking.Booking;
import test_all_exam.models.facility.House;
import test_all_exam.models.facility.NewFacility;
import test_all_exam.models.facility.Room;
import test_all_exam.models.facility.Villa;
import test_all_exam.models.person.Customer;


import java.io.*;
import java.util.*;

public class NewReadAndWrite {

    public static final String NEW_FACILITY_PATH = "src/test_all_exam/data/newFacility.csv";
    public static final String NEW_VILLA_PATH = "src/test_all_exam/data/newVilla.csv";
    public static final String NEW_HOUSE_PATH = "src/test_all_exam/data/newHouse.csv";
    public static final String NEW_ROOM_PATH = "src/test_all_exam/data/newRoom.csv";
    public static final String NEW_FACILITY_HEADER = "ID,NAME,RENT COST";
    public static final String NEW_CUSTOMER_PATH = "src/test_all_exam/data/newCustomer.csv";
    public static final String NEW_CUSTOMER_HEADER = "ID,NAME,DATE OF BIRTH,BOOKING STATUS";
    public static final String NEW_BOOKING_PATH = "src/test_all_exam/data/newBooking.csv";
    public static final String NEW_BOOKING_HEADER = "ID,CUSTOMER ID,FACILITY ID,CHECK IN DAY,CHECK OUT DAY";



    public static void writeFacilityToCsv(Map<NewFacility, Integer> map, String path) {
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
            for (Map.Entry<NewFacility, Integer> item : map.entrySet()) {
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

    public static LinkedHashMap<NewFacility, Integer> readFacilityFromFile() {
        LinkedHashMap<NewFacility, Integer> facilityMap = new LinkedHashMap<>();
        File file = new File(NEW_FACILITY_PATH);
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
                    villa = new Villa(arr[0],arr[1],
                            Double.parseDouble(arr[2]), Double.parseDouble(arr[3]));
                    facilityMap.put(villa, Integer.parseInt(arr[4]));
                } else if (arr[0].contains("SVHO")) {
                    house = new House(arr[0],arr[1],
                            Double.parseDouble(arr[2]));
                    facilityMap.put(house, Integer.parseInt(arr[3]));
                } else {
                    room = new Room(arr[0],arr[1],
                            Double.parseDouble(arr[2]));
                    facilityMap.put(room, Integer.parseInt(arr[3]));
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
        if (path.equals(NEW_VILLA_PATH)){
            header = NEW_FACILITY_HEADER + ",POOL AREA";
        }else if (path.equals(NEW_HOUSE_PATH) || path.equals(NEW_ROOM_PATH)){
            header = NEW_FACILITY_HEADER;
        }else {
            header = "FACILITY INFORMATION";
        }
        return header;
    }

    public static boolean checkToWrite(String path, String line) {
        boolean check = false;
        if ((path.equals(NEW_VILLA_PATH) && line.contains("SVVL"))
                || (path.equals(NEW_HOUSE_PATH) && line.contains("SVHO"))
                || (path.equals(NEW_ROOM_PATH) && line.contains("SVRO") || path.equals(NEW_FACILITY_PATH))) {
            check = true;
        }
        return check;
    }

    public static void writeCustomerToCsv(List<Customer> list) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(NEW_CUSTOMER_PATH));
            bw.write(NEW_CUSTOMER_HEADER);
            String line ="";
            for (Customer customer : list) {
                bw.newLine();
                line = customer.makeText();
                bw.write(line);
            }
        } catch (Exception e) {
            System.err.println("Error at writing customer information to file csv");
        } finally {
            try {
                if (bw != null) {
                    bw.flush();
                    bw.close();
                }
            } catch (Exception e) {
                System.err.println("Error at flushing or closing BufferedWriter");
            }
        }
    }

    public static List<Customer> readCustomerFromCsv() {
        List<Customer> customersList = new LinkedList<>();
        BufferedReader br = null;
        try {
            File file = new File(NEW_CUSTOMER_PATH);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            br = new BufferedReader(new FileReader(file));
            String line = "";
            Customer customer;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(",");
                if (array[0].equals("ID")) {
                    continue;
                }
                customer = new Customer(array[0], array[1], array[2], Boolean.parseBoolean(array[3]));
                customersList.add(customer);
            }
            return customersList;
        } catch (IOException e) {
            System.out.println("File not found, please creating new file.");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error at closing BufferedReader in readCustomerFromCsv method");
                }
            }
        }
        return null;
    }

    public static void writeBookingToCsv(Set<Booking> set) {
        try {
            FileWriter fileWriter = new FileWriter(new File(NEW_BOOKING_PATH));
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(NEW_BOOKING_HEADER);
            for (Booking booking : set) {
                bufferedWriter.newLine();
                bufferedWriter.write(booking.makeText());
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("Error at writeBookingToCsv");
        }
    }

    public static Set<Booking> readBookingFromCsv() {
        Set<Booking> bookingSet = new TreeSet<>();
        Booking booking;
        try {
            FileReader fileReader = new FileReader(new File(NEW_BOOKING_PATH));
            BufferedReader  bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] array = line.split(",");
                if (array[0].contains("BOOKING")){
                    continue;
                }
                booking = new Booking (Integer.parseInt(array[0]), array[1], array[2], array[3], array[4]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("Error at readBookingFromCsv");
        }
        return bookingSet;
    }
}
