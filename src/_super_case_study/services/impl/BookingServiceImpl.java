package _super_case_study.services.impl;

import _super_case_study.models.booking_and_contract.Booking;
import _super_case_study.models.facility.Facility;
import _super_case_study.models.person.Customer;
import _super_case_study.services.BookingService;
import _super_case_study.utils.*;
import _super_case_study.utils.read_and_write.ReadAndWriteBookingAndContract;
import _super_case_study.utils.read_and_write.ReadAndWriteFacility;
import _super_case_study.utils.read_and_write.ReadAndWritePerson;
import _super_case_study.utils.regex.RegexBookingAndContract;

import java.io.IOException;
import java.util.*;

public class BookingServiceImpl implements BookingService {

    public static final String VILLA_PATH = "src/_super_case_study/data/villa.csv";
    public static final String ROOM_PATH = "src/_super_case_study/data/room.csv";
    public static final String HOUSE_PATH = "src/_super_case_study/data/house.csv";
    public static final String FACILITY_PATH = "src/_super_case_study/data/facility.csv";
    static Scanner input = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = (LinkedList<Customer>) ReadAndWritePerson.readCustomerFromCsv();
    static LinkedHashMap<Facility, Integer> facilityIntegerMap = ReadAndWriteFacility.readFacilityFromFile();
    static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    static CustomerServiceImpl customerService = new CustomerServiceImpl();
    static RegexBookingAndContract regexBookingAndContract = new RegexBookingAndContract();

    @Override
    public void display() {
        bookingSet = ReadAndWriteBookingAndContract.readBookingFromCsv();
        try {
            if (bookingSet.isEmpty()) {
                throw new IOException();
            }
        } catch (IOException e) {
            System.err.println("The data is empty at display booking!!");
        }
        for (Booking booking : bookingSet
        ) {
            System.out.println(booking.toString());
        }
    }

    @Override
    public void addNew() {
        bookingSet = ReadAndWriteBookingAndContract.readBookingFromCsv();
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size() + 1;
        }
        customerService.display();
        System.out.println("Enter the customer ID:");
        Customer customer = chooseCustomer(input.nextLine());
        facilityService.display();
        System.out.println("Enter the ID of the facility:");
        Facility facility = chooseFacility(input.nextLine());
        System.out.println("Enter the day to check in:");
        String startDate = regexBookingAndContract.regexStartEndDate(input.nextLine());
        System.out.println("Enter the day to check out:");
        String endDate = regexBookingAndContract.checkStartEndDate(startDate);
        Booking booking = new Booking(id, customer.getId(), customer.getName(),
                                        customer.getTypeOfCustomer(), facility.getId(),
                                        facility.getServiceName(), facility.getTypeOfUsing(),
                                        startDate, endDate, false);
        bookingSet.add(booking);
        ReadAndWriteBookingAndContract.writeBookingToCsv(bookingSet);
        recordBookingFacility(facility.getId());
        System.out.println("Adding new booking successfully!!");
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {

    }

    @Override
    public int checkId() {
        return 0;
    }

    public static Customer chooseCustomer(String id) {
        while (true) {
            for (Customer customer : customerList) {
                if (id.equals(String.valueOf(customer.getId()))) {
                    return customer;
                }
            }
            System.err.println("Not found the customer ID, please try again:");
            id = input.nextLine();
        }
    }

    public static Facility chooseFacility(String id) {
        while (true) {
            for (Map.Entry<Facility, Integer> facility : facilityIntegerMap.entrySet()) {
                if (id.equals(facility.getKey().getId())) {
                    if (facility.getValue() == 5) {
                        System.out.println("This service is under maintenance, please choose another service!!");
                        id = input.nextLine();
                    } else return facility.getKey();
                }
            }
            System.out.println("Enter the ID of the facility:");
            System.err.println("Not found the facility ID, please try again:");
            id = input.nextLine();
        }
    }

    public static void recordBookingFacility(String id) {
        for (Map.Entry<Facility, Integer> facility : facilityIntegerMap.entrySet()) {
            if (id.equals(facility.getKey().getId())) {
                facility.setValue(facility.getValue() + 1);
                ReadAndWriteFacility.writeFacilityToCsv(facilityIntegerMap, FACILITY_PATH);
                if (id.contains("SVVL")) {
                    ReadAndWriteFacility.writeFacilityToCsv(facilityIntegerMap, VILLA_PATH);
                } else if (id.contains("SVHO")) {
                    ReadAndWriteFacility.writeFacilityToCsv(facilityIntegerMap, HOUSE_PATH);
                } else {
                    ReadAndWriteFacility.writeFacilityToCsv(facilityIntegerMap, ROOM_PATH);
                }
            }
        }
    }

    public Set<Booking> sendBooking() {
        bookingSet = ReadAndWriteBookingAndContract.readBookingFromCsv();
        return bookingSet;
    }
}




