package _super_case_study.utils.read_and_write;

import _super_case_study.models.booking_and_contract.Booking;
import _super_case_study.models.booking_and_contract.Contract;
import _super_case_study.utils.BookingComparator;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ReadAndWriteBookingAndContract {
    public static void main(String[] args) {
    }
    public static final String BOOKING_PATH = "src/_super_case_study/data/booking.csv";
    public static final String CONTRACT_PATH = "src/_super_case_study/data/contract.csv";
    public static final String BOOKING_HEADER = "BOOKING ID,CUSTOMER ID,CUSTOMER NAME,CUSTOMER TYPE,FACILITY ID, FACILITY NAME,SERVICE TYPE,START DAY,END DAY, CONTRACT CREATED";
    public static final String CONTRACT_HEADER = "CONTRACT ID,BOOKING ID,DEPOSIT,TOTAL PAYMENT,CUSTOMER NAME, CUSTOMER ID";

    public static void writeBookingToCsv(Set<Booking> set) {
        try {
            FileWriter fileWriter = new FileWriter(new File(BOOKING_PATH));
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(BOOKING_HEADER);
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
        Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
        Booking booking;
        try {
            FileReader fileReader = new FileReader(new File(BOOKING_PATH));
            BufferedReader  bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                if (arr[0].contains("BOOKING")){
                    continue;
                }
                booking = new Booking(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], Boolean.parseBoolean(arr[9]));
                bookingSet.add(booking);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("Error at readBookingFromCsv");
        }
        return bookingSet;
    }

    public static void writeContractToCsv(List<Contract> list) {
        try {
            FileWriter fileWriter = new FileWriter(new File(CONTRACT_PATH));
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(CONTRACT_HEADER);
            for (Contract contract : list) {
                bufferedWriter.newLine();
                bufferedWriter.write(contract.makeText());
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("Error at writeContractToCsv");
        }
    }

    public static List<Contract> readContractFromCsv() {
        List<Contract> contractList = new LinkedList<>();
        Contract contract;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(CONTRACT_PATH)));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                if (arr[0].contains("CONTRACT")){
                    continue;
                }
                contract = new Contract(arr[0], Integer.parseInt(arr[1]), Double.parseDouble(arr[2]),
                        Double.parseDouble(arr[3]), arr[4], Integer.parseInt(arr[5]));
                contractList.add(contract);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("Error at readContractFromCsv");
        }
        return contractList;
    }
}
