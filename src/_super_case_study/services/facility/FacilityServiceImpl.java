package _super_case_study.services.facility;

import _super_case_study.models.facility.Facility;
import _super_case_study.models.facility.House;
import _super_case_study.models.facility.Room;
import _super_case_study.models.facility.Villa;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {

    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static Scanner input = new Scanner(System.in);

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> item: facilityIntegerMap.entrySet()) {
            System.out.println("SERVICES: " + item.getKey() + " , The number of times rented: " + item.getValue());
        }

    }


    @Override
    public void displayMaintain() {

    }


    @Override
    public void addNewVilla() {
        System.out.println("Enter the id of the villa:");
        String id = input.nextLine();
        System.out.println("Enter the villa's name: ");
        String name = input.nextLine();
        System.out.println("Enter the villa's using area: ");
        double usingArea = Double.parseDouble(input.nextLine());
        System.out.println("Enter the villa's rent cost: ");
        double rentCost = Double.parseDouble(input.nextLine());
        System.out.println("Enter the maximum of person in the villa: ");
        double maximumMember = Double.parseDouble(input.nextLine());
        System.out.println("Enter the villa type: ");
        String typeOfUsing = input.nextLine();
        System.out.println("Enter the standard of room in the villa: ");
        String standardOfRoom = input.nextLine();
        System.out.println("Enter the pool area of the villa: ");
        double poolArea = Double.parseDouble(input.nextLine());
        System.out.println("Enter the number of the floor in the villa: ");
        int numOfFloor = Integer.parseInt(input.nextLine());
        Villa villa = new Villa(id, name, usingArea, rentCost, maximumMember, typeOfUsing, standardOfRoom, poolArea, numOfFloor);
        facilityIntegerMap.put(villa, 0);
    }

    @Override
    public void addNewHouse() {
        System.out.println("Enter the id of the house:");
        String id = input.nextLine();
        System.out.println("Enter the house's name: ");
        String name = input.nextLine();
        System.out.println("Enter the house's using area: ");
        double usingArea = Double.parseDouble(input.nextLine());
        System.out.println("Enter the house's rent cost: ");
        double rentCost = Double.parseDouble(input.nextLine());
        System.out.println("Enter the maximum of person in the house: ");
        double maximumMember = Double.parseDouble(input.nextLine());
        System.out.println("Enter the house type: ");
        String typeOfUsing = input.nextLine();
        System.out.println("Enter the standard of room in the house: ");
        String standardOfRoom = input.nextLine();
        System.out.println("Enter the number of the floor in the house: ");
        int numOfFloor = Integer.parseInt(input.nextLine());
        House house = new House(id, name, usingArea, rentCost, maximumMember, typeOfUsing, standardOfRoom, numOfFloor);
        facilityIntegerMap.put(house, 1);
    }

    @Override
    public void addNewRoom() {
        System.out.println("Enter the id of the room:");
        String id = input.nextLine();
        System.out.println("Enter the room's name: ");
        String name = input.nextLine();
        System.out.println("Enter the room's using area: ");
        double usingArea = Double.parseDouble(input.nextLine());
        System.out.println("Enter the room's rent cost: ");
        double rentCost = Double.parseDouble(input.nextLine());
        System.out.println("Enter the maximum of person in the room: ");
        double maximumMember = Double.parseDouble(input.nextLine());
        System.out.println("Enter the room type: ");
        String typeOfUsing = input.nextLine();
        System.out.println("Enter the free services in the room: ");
        String freeService = input.nextLine();
        Room room = new Room(id, name, usingArea, rentCost, maximumMember, typeOfUsing, freeService);
        facilityIntegerMap.put(room, 2);
    }

}
