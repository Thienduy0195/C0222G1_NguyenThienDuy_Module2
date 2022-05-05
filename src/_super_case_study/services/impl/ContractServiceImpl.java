package _super_case_study.services.impl;

import _super_case_study.models.booking_and_contract.Booking;
import _super_case_study.models.booking_and_contract.Contract;
import _super_case_study.services.ContractService;
import _super_case_study.utils.read_and_write.ReadAndWriteBookingAndContract;
import _super_case_study.utils.regex.RegexPersonData;

import java.io.IOException;
import java.util.*;

public class ContractServiceImpl implements ContractService {
    Scanner input = new Scanner(System.in);
    static Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
    static List<Contract> contractList = new ArrayList<>();
    static RegexPersonData regexPersonData = new RegexPersonData();

    @Override
    public void display() {
        contractList = ReadAndWriteBookingAndContract.readContractFromCsv();
        try {
            if (contractList.isEmpty()) {
                throw new IOException();
            }
        } catch (IOException e) {
            System.err.println("The data of contract is empty!");
        }
        for (Contract contract : contractList
        ) {
            System.out.println(contract.toString());
        }
        if (contractList.size()<bookingSet.size()){
            System.err.println("\nSome booking seem not to be created into contract, please check if it's needed!");
        }
    }

    @Override
    public void addNew() {
        contractList = ReadAndWriteBookingAndContract.readContractFromCsv();
        Queue<Booking> bookingQueue = new LinkedList<>();
        for (Booking booking :
                bookingSet) {
            if (!booking.isCreateContract()){
                bookingQueue.add(booking);
            }
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            String customerName = booking.getCustomerName();
            int customerId = booking.getCustomerId();
            int bookingID = booking.getBookingId();
            System.out.println("Creating contract for booking with information: " + booking.toString());
            System.out.println("Please enter the contract ID:");
            String contractID = checkContractId();
            System.out.println("Please enter the prepayment amount:");
            double deposit = Double.parseDouble(regexPersonData.inputSalary());
            System.out.println("Please enter the total amount to pay:");
            double totalPayment = checkMoney(deposit);
            Contract contract = new Contract(contractID, bookingID, deposit, totalPayment, customerName, customerId);
            contractList.add(contract);
            recordContractSignedBooking(bookingID);
            ReadAndWriteBookingAndContract.writeContractToCsv(contractList);
            ReadAndWriteBookingAndContract.writeBookingToCsv(bookingSet);
            System.out.println("Creating new contract completed!!");
        }
        System.out.println("All booking were created into contract!");
    }

    @Override
    public void edit() {
        display();
        System.out.println("Enter the id of the contract which you want to edit:");
        String id = input.nextLine();
        boolean check = true;
        while (check) {
            for (Contract item : contractList) {
                if (id.equals(item.getContractId())) {
                    check = false;
                    System.out.println("Editing the contract with information: " + item.toString());
                    System.out.println("Enter the id of the new contract");
                    item.setContractId(checkContractId());
                    System.out.println("Please enter the prepayment amount:");
                    double deposit = Double.parseDouble(regexPersonData.inputSalary());
                    item.setDeposit(deposit);
                    System.out.println("Please enter the total amount to pay:");
                    item.setTotalPayment(checkMoney(deposit));
                    ReadAndWriteBookingAndContract.writeContractToCsv(contractList);
                    System.out.println("Editing new contract completed!!");
                }
            }
            if (check){
                System.out.println("Not found the contract which you are searching, please try again:");
                id = input.nextLine();
            }
        }

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

    public String checkContractId(){
        contractList = ReadAndWriteBookingAndContract.readContractFromCsv();
        String id = input.nextLine();
        boolean check = true;
        while (check){
            check =false;
            for (Contract item: contractList) {
                if(id.equals(item.getContractId())){
                    System.err.println("The Id is exist, please try again!");
                    System.out.println("Re-enter the Id:");
                    id = input.nextLine();
                    check = true;
                    break;
                }
            }
        }
        return id;
    }

    public double checkMoney(double deposit) {
        double totalPayment = Double.parseDouble(regexPersonData.inputSalary());
        boolean check = true;
        while (check) {
            if (totalPayment > deposit) {
                check = false;
            } else {
                System.err.println("The total amount must be more than the prepayment amount");
                totalPayment = Double.parseDouble(regexPersonData.inputSalary());
            }
        }
        return totalPayment;
    }

    public static void recordContractSignedBooking(int id) {
        for (Booking item : bookingSet) {
            if (id == item.getBookingId()) {
                item.setCreateContract(true);
            }
        }
    }
}
