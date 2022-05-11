package exam_modules2.utils.read_and_write;

import added_excercises.excercise2.Subject;
import exam_modules2.models.BankAccount;
import exam_modules2.models.PayBankAccount;
import exam_modules2.models.SaveBankAccount;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteBank {
    public static final String PAY_BANK_PATH = "src/exam_modules2/data/pay_bank_account.csv";
    public static final String SAVE_BANK_PATH = "src/exam_modules2/data/save_bank_account.csv";

//    public static final String BANK_PATH = "src/exam_modules2/data/bank_account.csv";
public static void main(String[] args) {
    List<SaveBankAccount> list = new LinkedList<>();
    list.add(new SaveBankAccount(5, "ABC", "XYZ", "DFE",56, "SDF", 57,8));
    writeSaveBankAccount(list, SAVE_BANK_PATH);
}

    public static void writeSaveBankAccount(List<SaveBankAccount> list, String path) {
        File file = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
//            if (!file.exists()) {
//                throw new FileNotFoundException("File not found!!");
//            }
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (SaveBankAccount bankAccount : list) {
                bufferedWriter.write(bankAccount.makeText());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.err.println("Error at write subject to Csv!!");
            }
        }
    }

    public static void writePayBankAccount(List<PayBankAccount> list, String path) {
        File file = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            if (!file.exists()) {
                throw new FileNotFoundException("File not found!!");
            }
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (PayBankAccount bankAccount : list) {
                bufferedWriter.write(bankAccount.makeText());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.err.println("Error at write subject to Csv!!");
            }
        }
    }

    public static List<SaveBankAccount> readSaveBankAccount(String path) {
        List<SaveBankAccount> bankList = new LinkedList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] array;
            SaveBankAccount bankAccount;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                    bankAccount = new SaveBankAccount(Integer.parseInt(array[0]), array[1], array[2], array[3], Double.parseDouble(array[4]), array[5],Double.parseDouble(array[6]), Integer.parseInt(array[7]));
                bankList.add(bankAccount);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.err.println("Error at read bank account to Csv!!");
        }
        return bankList;
    }

    public static List<PayBankAccount> readPayBankAccount(String path) {
        List<PayBankAccount> bankList = new LinkedList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] array;
            PayBankAccount bankAccount;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                    bankAccount = new PayBankAccount(Integer.parseInt(array[0]), array[1], array[2], array[3],array[4], Integer.parseInt(array[5]) );
                bankList.add(bankAccount);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.err.println("Error at read bank account to Csv!!");
        }
        return bankList;
    }

}
