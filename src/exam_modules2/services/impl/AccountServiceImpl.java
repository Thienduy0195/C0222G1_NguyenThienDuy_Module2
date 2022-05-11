package exam_modules2.services.impl;

import exam_modules2.models.PayBankAccount;
import exam_modules2.models.SaveBankAccount;
import exam_modules2.services.IAccountServices;
import exam_modules2.utils.NotFoundIDException;
import exam_modules2.utils.read_and_write.ReadAndWriteBank;
import exam_modules2.utils.RegexBankAccount;


import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AccountServiceImpl extends ReadAndWriteBank implements IAccountServices {

    public static final String PAY_BANK_PATH = "src/exam_modules2/data/pay_bank_account.csv";
    public static final String SAVE_BANK_PATH = "src/exam_modules2/data/save_bank_account.csv";
//    public static final String ABC = "src/exam_modules2/data/save_bank_account.csv";

    static Scanner scanner = new Scanner(System.in);
    List<SaveBankAccount> saveBankAccountList = new LinkedList<>();
    List<PayBankAccount> payBankAccountList = new LinkedList<>();

//    List<BankAccount> bankAccountList = new LinkedList<>();
//     List<BankAccount> bankAccountList = ReadAndWriteBank.readBankAccount();


    @Override
    public void addNewSaveAccount() {
//        SaveBankAccount saveBankAccount = new SaveBankAccount();
        int id = 1;
        if (!saveBankAccountList.isEmpty()) {
            id = saveBankAccountList.size() + 1;
        }

//        saveBankAccount.setId(id);
        System.out.println("Enter the bank account code:");
//        saveBankAccount.setAccountCode(scanner.nextLine());
        String code = scanner.nextLine();
        System.out.println("Enter the bank account holder's name:");
        String name = scanner.nextLine();
//        saveBankAccount.setHolderName(scanner.nextLine());
        System.out.println("Enter the day to create:");
        String createDate = scanner.nextLine();
//        String createDate = RegexBankAccount.checkCreateDate(scanner.nextLine());
//        saveBankAccount.setCreateDate(createDate);
        System.out.println("Enter the saving money:");
//        saveBankAccount.setSaveMoney(RegexBankAccount.inputDoubleNumber());
        double savingMoney = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the day to save:");
//        saveBankAccount.setSaveDate(RegexBankAccount.checkSaveDate(createDate));
        String saveDate = scanner.nextLine();
        System.out.println("Enter the rate of bank:");
//        saveBankAccount.setRate(RegexBankAccount.inputDoubleNumber());
        double rate = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the period of saving:");
//        saveBankAccount.setPeriod(RegexBankAccount.inputIntegerNumber());
        int period = Integer.parseInt(scanner.nextLine());
        SaveBankAccount saveBankAccount = new SaveBankAccount(id, code, name, createDate, savingMoney, saveDate, rate, period);
        saveBankAccountList.add(saveBankAccount);
        ReadAndWriteBank.writeSaveBankAccount(saveBankAccountList, SAVE_BANK_PATH);
        System.out.println(saveBankAccount.toString());
        System.out.println("success adding!!");
    }

    @Override
    public void addNewPayAccount() {
        PayBankAccount payBankAccount = new PayBankAccount();
        int id = 1;
        if (!payBankAccountList.isEmpty()) {
            id = payBankAccountList.size() + 1;
        }
        payBankAccount.setId(id);
        System.out.println("Enter the bank account code:");
        payBankAccount.setAccountCode(scanner.nextLine());
        System.out.println("Enter the bank account holder's name:");
        payBankAccount.setHolderName(scanner.nextLine());
        System.out.println("Enter the day to create:");
        payBankAccount.setCreateDate(RegexBankAccount.checkCreateDate(scanner.nextLine()));
        System.out.println("Enter card number:");
        payBankAccount.setCardNumber(String.valueOf(RegexBankAccount.inputIntegerNumber()));
        System.out.println("Enter the money in account:");
        payBankAccount.setInnerMoney(RegexBankAccount.inputDoubleNumber());
        payBankAccountList.add(payBankAccount);
        System.out.println(payBankAccount.toString());
        ReadAndWriteBank.writePayBankAccount(payBankAccountList, PAY_BANK_PATH);
        System.out.println("success adding!!");
    }

    @Override
    public void displayAccount() {
        try {
            saveBankAccountList = ReadAndWriteBank.readSaveBankAccount(SAVE_BANK_PATH);
            payBankAccountList = ReadAndWriteBank.readPayBankAccount(PAY_BANK_PATH);
            if (saveBankAccountList.isEmpty() || payBankAccountList.isEmpty()) {
                throw new IOException("the data is empty!!");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        for (SaveBankAccount item : saveBankAccountList) {
            System.out.println(item.toString());
        }
        for (PayBankAccount item : payBankAccountList) {
            System.out.println(item.toString());
        }
    }


    @Override
    public void searchAccount() {

        boolean check = true;
        while (check){
            System.out.println("The the the code to search bank account:");
            String code = scanner.nextLine();
            for (SaveBankAccount item: saveBankAccountList) {
                if(code.equals(item.getAccountCode())){
                    System.out.println(item.toString());
                }
                check = false;
                break;
            }
            for (PayBankAccount item: payBankAccountList) {
                if(code.equals(item.getAccountCode())){
                    System.out.println(item.toString());
                }
                check = false;
                break;
            }
            if (check){
                try{
                    throw new NotFoundIDException("Not found the id of the bank account!!");
                }catch (NotFoundIDException e){
                    System.out.println(e.getMessage());
                }


            }
        }


    }

    @Override
    public void deleteAccount() {
        displayAccount();
        boolean check = true;
        while (check) {
            System.out.println("Choose the id of the bank account which you want to delete!!");
            String code = scanner.nextLine();
            }
            if (check) {
                try {
                    throw new Exception("Not found the code you are searching!!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }



