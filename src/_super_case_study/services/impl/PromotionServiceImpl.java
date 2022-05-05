package _super_case_study.services.impl;

import _super_case_study.models.booking_and_contract.Booking;
import _super_case_study.models.booking_and_contract.Contract;
import _super_case_study.services.PromotionService;
import _super_case_study.utils.BookingComparator;
import _super_case_study.utils.read_and_write.ReadAndWriteBookingAndContract;
import _super_case_study.utils.regex.RegexPersonData;

import java.util.*;

public class PromotionServiceImpl implements PromotionService {
    public static void main(String[] args) {

    }

    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    RegexPersonData regexPersonData = new RegexPersonData();
    public static List<Contract> contractList;

    @Override
    public void displayCustomerByYear() {
        bookingSet = ReadAndWriteBookingAndContract.readBookingFromCsv();
        String year;
        int count = 0;
        System.out.println("Enter the year that customer using services:");
        year = regexPersonData.inputSalary();
        for (Booking booking : bookingSet) {
            if (booking.getStartDate().substring(6).equals(year)) {
                System.out.println("Customer id: " + booking.getCustomerId() + " customer name: " + booking.getCustomerName());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not found customer who using service in this year!!");
        }
    }

    @Override
    public void displayCustomerGetVoucher() {
        contractList = ReadAndWriteBookingAndContract.readContractFromCsv();
        Stack<Contract> discountContracts = new Stack<>();
        String thisMonth = ContractServiceImpl.contractSignedDate().substring(3);
        int count = 0;
        for (Contract contract : contractList) {
            if (contract.getContractSignDate().substring(3).equals(thisMonth)) {
                if (contract.getDiscount() == 0) {
                    discountContracts.add(contract);
                    count++;
                }
            }
        }
        if (count > 0) {
            System.out.println("There are " + count + " booking in this month.");
            System.out.println("Please enter the number of discount vouchers for this month");
            boolean check = true;
            int tenPercentV = 0;
            int twentyPercentV = 0;
            int fiftyPercentV = 0;
            while (check) {
                check = false;
                System.out.println("Enter the number of discount 10% voucher:");
                tenPercentV = Integer.parseInt(regexPersonData.inputSalary());
                if (tenPercentV > count) {
                    check = true;
                    System.out.println("All the voucher must be less than the number of booking in this month (" + count + ")");
                    continue;
                }
                System.out.println("You have " + (count - tenPercentV) + " for discount 20% voucher and discount 50% voucher");
                System.out.println("Enter the number of discount 20% voucher:");
                twentyPercentV = Integer.parseInt(regexPersonData.inputSalary());
                if (tenPercentV + twentyPercentV > count) {
                    check = true;
                    System.out.println("All the voucher must be less than the number of booking in this month (" + count + ")");
                    continue;
                }
                System.out.println("You have " + (count - tenPercentV - twentyPercentV) + " for discount 50% voucher");
                System.out.println("Enter the number of discount 50% voucher:");
                fiftyPercentV = Integer.parseInt(regexPersonData.inputSalary());
                if (tenPercentV + twentyPercentV + fiftyPercentV > count) {
                    check = true;
                    System.out.println("All the voucher must be less than the number of booking in this month (" + count + ")");
                }
            }
            System.out.println("Set vouchers for this month completed!!");
            Contract contract;
            System.out.println("The list of contract which get voucher this month:");
            for (int i = 1; i <= tenPercentV + twentyPercentV + fiftyPercentV; i++) {
                contract = discountContracts.pop();
                if (i <= tenPercentV) {
                    contract.setDiscount(10.0);
                } else if (i <= tenPercentV + twentyPercentV) {
                    contract.setDiscount(20.0);
                } else {
                    contract.setDiscount(50.0);
                }
                System.out.println(contract.toString());
            }
            ReadAndWriteBookingAndContract.writeContractToCsv(contractList);
        } else {
            System.out.println("This month has had no booking yet, please checking later!");
        }
    }
}
