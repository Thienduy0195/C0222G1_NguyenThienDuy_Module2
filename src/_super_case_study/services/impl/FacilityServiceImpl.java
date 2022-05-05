package _super_case_study.services.impl;

import _super_case_study.models.facility.Facility;
import _super_case_study.models.facility.House;
import _super_case_study.models.facility.Room;
import _super_case_study.models.facility.Villa;
import _super_case_study.services.FacilityService;
import _super_case_study.utils.ReadAndWriteFacility;
import _super_case_study.utils.RegexFacilityData;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityServiceImpl extends ReadAndWriteFacility implements FacilityService {

    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static RegexFacilityData regexFacilityData = new RegexFacilityData();

    @Override
    public void display() {
        facilityIntegerMap =ReadAndWriteFacility.readFacilityFromFile();
        try {
            if (facilityIntegerMap.isEmpty()) {
                throw new IOException();
            }
        }catch (IOException e){
            System.err.println("The data of facility is empty!!");
        }
        for (Map.Entry<Facility, Integer> item : facilityIntegerMap.entrySet()) {
            System.out.println("SERVICES: " + item.getKey() + ", THE NUMBER OF TIMES RENTED: " + item.getValue());
        }
    }


    @Override
    public void displayMaintain() {
        facilityIntegerMap =ReadAndWriteFacility.readFacilityFromFile();
        try {
            if (facilityIntegerMap.isEmpty()) {
                throw new IOException();
            }
        }catch (IOException e){
            System.err.println("The data of facility is empty!!");
        }
        int count =0;
        for (Map.Entry<Facility, Integer> item : facilityIntegerMap.entrySet()) {
            if(item.getValue() ==5){
                count++;
                System.out.println("SERVICES: " + item.getKey() + ", THE NUMBER OF TIMES RENTED: " + item.getValue());
            }
        }
        if (count==0){
            System.out.println("None of facility to maintain!!");
        }
    }


    @Override
    public void addNewVilla() {
        System.out.println("Enter the id of the villa:");
        String id = checkIdFacility("villa");
        System.out.println("Enter the villa's name: ");
        String name = regexFacilityData.inputServiceName("villa");
        System.out.println("Enter the villa's usable area: ");
        double usingArea = regexFacilityData.inputUsingArea("villa");
        System.out.println("Enter the villa's rent cost: ");
        double rentCost = regexFacilityData.inputRentCost("villa");
        System.out.println("Enter the maximum of person that the villa can accommodate: ");
        int maximumMember = regexFacilityData.inputMaximumMember("villa");
        System.out.println("Enter the rental type of the villa: ");
        String typeOfUsing = regexFacilityData.inputTypeOfUsing("villa");
        System.out.println("Enter the room-standard in the villa: ");
        String standardOfRoom = regexFacilityData.inputStandardOfRoom("villa");
        System.out.println("Enter the pool area of the villa: ");
        double poolArea = regexFacilityData.inputPoolUsingArea("villa");
        System.out.println("Enter the number of the floor in the villa: ");
        int numOfFloor = regexFacilityData.inputNumOfFloor("villa");
        Villa villa = new Villa(id, name, usingArea,
                rentCost, maximumMember, typeOfUsing,
                standardOfRoom, poolArea, numOfFloor);
        facilityIntegerMap.put(villa, 0);
        ReadAndWriteFacility.writeFacilityToCsv(facilityIntegerMap, VILLA_PATH);
        ReadAndWriteFacility.writeFacilityToCsv(facilityIntegerMap, FACILITY_PATH);
        System.out.println();
        System.out.println("Successfully adding a new villa!!");
    }

    @Override
    public void addNewHouse() {
        System.out.println("Enter the id of the house:");
        String id = checkIdFacility("house");
        System.out.println("Enter the house's name: ");
        String name = regexFacilityData.inputServiceName("house");
        System.out.println("Enter the house's usable area: ");
        double usingArea = regexFacilityData.inputUsingArea("house");
        System.out.println("Enter the house's rent cost: ");
        double rentCost = regexFacilityData.inputRentCost("house");
        System.out.println("Enter the maximum of person that the house can accommodate: ");
        int maximumMember = regexFacilityData.inputMaximumMember("house");
        System.out.println("Enter the rental type of the house: ");
        String typeOfUsing = regexFacilityData.inputTypeOfUsing("house");
        System.out.println("Enter the room-standard of the house: ");
        String standardOfRoom = regexFacilityData.inputStandardOfRoom("house");
        System.out.println("Enter the number of the floor in the house: ");
        int numOfFloor = regexFacilityData.inputNumOfFloor("house");
        House house = new House(id, name, usingArea, rentCost, maximumMember, typeOfUsing, standardOfRoom, numOfFloor);
        facilityIntegerMap.put(house, 0);
        ReadAndWriteFacility.writeFacilityToCsv(facilityIntegerMap, HOUSE_PATH);
        ReadAndWriteFacility.writeFacilityToCsv(facilityIntegerMap, FACILITY_PATH);
        System.out.println("Successfully adding a new house!!");
    }

    @Override
    public void addNewRoom() {
        System.out.println("Enter the id of the room:");
        String id = checkIdFacility("room");
        System.out.println("Enter the room's name: ");
        String name = regexFacilityData.inputServiceName("room");
        System.out.println("Enter the room's usable area: ");
        double usingArea = regexFacilityData.inputUsingArea("room");
        System.out.println("Enter the room's rent cost: ");
        double rentCost = regexFacilityData.inputRentCost("room");
        System.out.println("Enter the maximum of person that the room can accommodate: ");
        int maximumMember = regexFacilityData.inputMaximumMember("room");
        System.out.println("Enter the rental type of the room: ");
        String typeOfUsing = regexFacilityData.inputTypeOfUsing("room");
        System.out.println("Enter the free services of the room: ");
        String freeService = regexFacilityData.inputFreeService("room");
        Room room = new Room(id, name, usingArea, rentCost, maximumMember, typeOfUsing, freeService);
        facilityIntegerMap.put(room, 0);
        ReadAndWriteFacility.writeFacilityToCsv(facilityIntegerMap, ROOM_PATH);
        ReadAndWriteFacility.writeFacilityToCsv(facilityIntegerMap, FACILITY_PATH);
        System.out.println("Successfully adding a new room!!");
    }

    public String checkIdFacility(String facilityName) {
        facilityIntegerMap =ReadAndWriteFacility.readFacilityFromFile();
        String id = regexFacilityData.inputFacilityID(facilityName);
        boolean check = true;
        while (check) {
            check = false;
            for (Map.Entry<Facility, Integer> item : facilityIntegerMap.entrySet()) {
                if (id.equals(item.getKey().getId())) {
                    System.err.println("The Id is exist, please try again!");
                    System.out.println("Re-enter the Id:");
                    id = regexFacilityData.inputFacilityID(facilityName);
                    check=true;
                    break;
                }
            }
        }
        return id;
    }
}
