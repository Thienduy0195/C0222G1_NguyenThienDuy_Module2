package test_all_exam.sevices.impl;

import _super_case_study.models.facility.Facility;
import enviroment_ss.ReadAndWrite;
import test_all_exam.models.facility.NewFacility;
import test_all_exam.models.facility.House;
import test_all_exam.models.facility.Room;
import test_all_exam.models.facility.Villa;
import test_all_exam.models.person.Customer;
import test_all_exam.sevices.IFacilityServices;
import test_all_exam.utils.NewReadAndWrite;
import test_all_exam.utils.NewRegex;

import java.util.*;

public class FacilityServicesImpl extends NewReadAndWrite implements IFacilityServices {
    Scanner input = new Scanner(System.in);

    Map<NewFacility, Integer> facilityIntegerMap = new TreeMap<>();

    @Override
    public void addNewVilla() {
        facilityIntegerMap = NewReadAndWrite.readFacilityFromFile();
        Villa villa = new Villa();
        System.out.println("Enter the id of the villa: ");
        villa.setId(NewRegex.regexInput(input.nextLine(), NewRegex.REGEX_ID_VILLA,
                "Wrong format. Example: SVVL-0001, SVVL-3579..."));
        System.out.println("Enter the name of the villa: ");
        villa.setName(NewRegex.regexInput(input.nextLine(), NewRegex.REGEX_FACILITY_NAME,
                "Wrong format. Example: Villa1, Villa005..."));
        System.out.println("Enter the cost of the villa: ");
        villa.setCost(Double.parseDouble(NewRegex.regexInput(input.nextLine(), NewRegex.REGEX_POSITIVE_NUMBER,
                "Wrong format.It must be a positive number!!")));
        System.out.println("Enter the pool area of the villa: ");
        villa.setPoolArea(Double.parseDouble(NewRegex.regexInput(input.nextLine(), NewRegex.REGEX_POSITIVE_NUMBER, "Wrong format.It must be a positive number!!")));
        facilityIntegerMap.put(villa, 0);
        NewReadAndWrite.writeFacilityToCsv(facilityIntegerMap, NewReadAndWrite.NEW_VILLA_PATH);
        NewReadAndWrite.writeFacilityToCsv(facilityIntegerMap, NewReadAndWrite.NEW_FACILITY_PATH);
        System.out.println("adding new villa successfully!!");
    }

    @Override
    public void addNewHouse() {
        facilityIntegerMap = NewReadAndWrite.readFacilityFromFile();
        House house = new House();
        System.out.println("Enter the id of the house: ");
        house.setId(NewRegex.regexInput(input.nextLine(), NewRegex.REGEX_ID_HOUSE,
                "Wrong format. Example: SVHO-0001, SVHO-3579..."));
        System.out.println("Enter the name of the house: ");
        house.setName(NewRegex.regexInput(input.nextLine(), NewRegex.REGEX_FACILITY_NAME,
                "Wrong format. Example: House1, House39..."));
        System.out.println("Enter the cost of the house: ");
        house.setCost(Double.parseDouble(NewRegex.regexInput(input.nextLine(), NewRegex.REGEX_POSITIVE_NUMBER,
                "Wrong format.It must be a positive number!!")));
        facilityIntegerMap.put(house, 0);
        NewReadAndWrite.writeFacilityToCsv(facilityIntegerMap, NewReadAndWrite.NEW_HOUSE_PATH);
        NewReadAndWrite.writeFacilityToCsv(facilityIntegerMap, NewReadAndWrite.NEW_FACILITY_PATH);
        System.out.println("adding new house successfully!!");
    }

    @Override
    public void addNewRoom() {
        facilityIntegerMap = NewReadAndWrite.readFacilityFromFile();
        Room room = new Room();
        System.out.println("Enter the id of the room: ");
        room.setId(NewRegex.regexInput(input.nextLine(), NewRegex.REGEX_ID_ROOM,
                "Wrong format. Example: SVRO-0001, SVRO-3579..."));
        System.out.println("Enter the name of the room: ");
        room.setName(NewRegex.regexInput(input.nextLine(), NewRegex.REGEX_FACILITY_NAME,
                "Wrong format. Example: Room1, Room005..."));
        System.out.println("Enter the cost of the room: ");
        room.setCost(Double.parseDouble(NewRegex.regexInput(input.nextLine(), NewRegex.REGEX_POSITIVE_NUMBER,
                "Wrong format.It must be a positive number!!")));
        facilityIntegerMap.put(room, 0);
        NewReadAndWrite.writeFacilityToCsv(facilityIntegerMap, NewReadAndWrite.NEW_ROOM_PATH);
        NewReadAndWrite.writeFacilityToCsv(facilityIntegerMap, NewReadAndWrite.NEW_FACILITY_PATH);
        System.out.println("adding new room successfully!!");
    }

    @Override
    public void displayFacility() {
        facilityIntegerMap = NewReadAndWrite.readFacilityFromFile();
        if (facilityIntegerMap.isEmpty()){
            try{
                throw new NullPointerException();
            }catch (NullPointerException e){
                System.err.println("The data in facility file is empty!!");
            }
        }
        try{
            for (Map.Entry<NewFacility, Integer> item : facilityIntegerMap.entrySet()) {
                System.out.println("FACILITY: " + item.getKey().toString() + "NUMBER OF RENT: " + item.getValue());
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Error at display facility list!!");
        }

    }

    @Override
    public void editFacility() {
    facilityIntegerMap = NewReadAndWrite.readFacilityFromFile();
        boolean check = true;
        String id;
        String itemId;
        while (check) {
            System.out.println("Enter the id of the facility to edit:");
            id = input.nextLine();
            for (Map.Entry<NewFacility, Integer> item : facilityIntegerMap.entrySet()) {
                itemId = item.getKey().getId();
                if (id.equals(itemId)) {
                    if (item.getKey() instanceof Villa){
                        System.out.println("Enter the new villa Id:");
                        item.getKey().setId(NewRegex.regexInput(input.nextLine(), NewRegex.REGEX_ID_VILLA,
                                "Wrong format. Example: SVVL-0001, SVVL-3579..."));
                        System.out.println("Enter the new villa name:");
                        item.getKey().setName(NewRegex.regexInput(input.nextLine(), NewRegex.REGEX_FACILITY_NAME,
                                "Wrong format. Example: Villa1, Villa005..."));
                        System.out.println("Enter the new rental cost:");
                        item.getKey().setCost(Double.parseDouble(NewRegex.regexInput(input.nextLine(), NewRegex.REGEX_POSITIVE_NUMBER,
                                "Wrong format.It must be a positive number!!")));
                        System.out.println("Enter the new pool area:");
                        ((Villa) item.getKey()).setPoolArea(Double.parseDouble(NewRegex.regexInput(input.nextLine(), NewRegex.REGEX_POSITIVE_NUMBER,
                                "Wrong format.It must be a positive number!!")));
                        System.out.println("Success editing villa!!");
                        NewReadAndWrite.writeFacilityToCsv(facilityIntegerMap, NEW_VILLA_PATH);
                    }else if (item.getKey() instanceof House){
                        System.out.println("Enter the new house Id:");
                        item.getKey().setId(NewRegex.regexInput(input.nextLine(), NewRegex.REGEX_ID_HOUSE,
                                "Wrong format. Example: SVHO-0001, SVHO-3579..."));
                        System.out.println("Enter the new house name:");
                        item.getKey().setName(NewRegex.regexInput(input.nextLine(), NewRegex.REGEX_FACILITY_NAME,
                                "Wrong format. Example: House1, House002..."));
                        System.out.println("Enter the new rental cost:");
                        item.getKey().setCost(Double.parseDouble(NewRegex.regexInput(input.nextLine(), NewRegex.REGEX_POSITIVE_NUMBER,
                                "Wrong format.It must be a positive number!!")));
                        System.out.println("Success editing new house!!");
                        NewReadAndWrite.writeFacilityToCsv(facilityIntegerMap, NEW_HOUSE_PATH);
                    }else {
                        System.out.println("Enter the new room Id:");
                        item.getKey().setId(NewRegex.regexInput(input.nextLine(), NewRegex.REGEX_ID_ROOM,
                                "Wrong format. Example: SVRO-0001, SVRO-3579..."));
                        System.out.println("Enter the new room name:");
                        item.getKey().setName(NewRegex.regexInput(input.nextLine(), NewRegex.REGEX_FACILITY_NAME,
                                "Wrong format. Example: Room1, Room12..."));
                        System.out.println("Enter the new rental cost:");
                        item.getKey().setCost(Double.parseDouble(NewRegex.regexInput(input.nextLine(), NewRegex.REGEX_POSITIVE_NUMBER,
                                "Wrong format.It must be a positive number!!")));
                        System.out.println("Success editing new room!!");
                        NewReadAndWrite.writeFacilityToCsv(facilityIntegerMap, NEW_ROOM_PATH);
                    }
                    check = false;
                }
                NewReadAndWrite.writeFacilityToCsv(facilityIntegerMap, NEW_FACILITY_PATH);
            }
            if (check){
                System.err.println("Not found the facility's id to edit!!");
            }
        }
    }
}
