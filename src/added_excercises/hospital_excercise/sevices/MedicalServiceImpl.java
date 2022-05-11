package added_excercises.hospital_excercise.sevices;

import added_excercises.hospital_excercise.models.MedicalRecord;
import added_excercises.hospital_excercise.models.NormalMedicalRecord;
import added_excercises.hospital_excercise.models.VipMedicalRecord;
import added_excercises.hospital_excercise.utils.ReadAndWriteMedical;
import added_excercises.hospital_excercise.utils.RegexMedical;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MedicalServiceImpl implements MedicalService {
    Scanner input = new Scanner(System.in);

    List<MedicalRecord> medicalRecordList = new LinkedList<>();

    @Override
    public void addNewNormalMedicalRecord() {
        medicalRecordList = ReadAndWriteMedical.readMedical();
        int recordNumber = 1;
        if (!medicalRecordList.isEmpty()) {
            recordNumber = medicalRecordList.size() + 1;
        }
        System.out.println("Please enter the record code:");
        String medicalRecordCode = RegexMedical.regexInput(input.nextLine(), RegexMedical.REGEX_MEDICAL_CODE,
                "The medical record code must be in format BA-XXX. Example: BA-123, BA-002...");
        System.out.println("Please enter the patient's name:");
        String patientName = RegexMedical.regexInput(input.nextLine(), RegexMedical.REGEX_PATIENT_NAME,
                "The patient's name must be in format BN-XXX. Example: BN-123, BN-002...");
        System.out.println("Please enter the check in day:");
        String checkInDay = RegexMedical.regexDate(input.nextLine());
        System.out.println("Please enter the check out day:");
        String checkOutDay = RegexMedical.regexDate(input.nextLine());
        System.out.println("Please enter the reason:");
        String reason = input.nextLine();
        System.out.println("Please enter the hospital fee:");
        double hospitalFees = Double.parseDouble(RegexMedical.regexInput(input.nextLine(),
                RegexMedical.REGEX_POSITIVE_NUMBER, "It must be a positive number!"));
        NormalMedicalRecord normalMedicalRecord = new NormalMedicalRecord(recordNumber, medicalRecordCode,
                patientName, checkInDay,
                checkOutDay, reason, hospitalFees);
        medicalRecordList.add(normalMedicalRecord);
        ReadAndWriteMedical.writeMedical(medicalRecordList);
        System.out.println("Add new normal medical record successfully!!");

    }

    @Override
    public void addNewVipMedicalRecord() {
        medicalRecordList = ReadAndWriteMedical.readMedical();
        int recordNumber = 1;
        if (!medicalRecordList.isEmpty()) {
            recordNumber = medicalRecordList.size() + 1;
        }
        System.out.println("Please enter the medical record code:");
        String medicalRecordCode = RegexMedical.regexInput(input.nextLine(), RegexMedical.REGEX_MEDICAL_CODE,
                "The medical record code must be in format BA-XXX. Example: BA-123, BA-002...");
        System.out.println("Please enter the patient's name:");
        String patientName = RegexMedical.regexInput(input.nextLine(), RegexMedical.REGEX_PATIENT_NAME,
                "The patient's name must be in format BN-XXX. Example: BN-123, BN-002...");
        System.out.println("Please enter the check in day:");
        String checkInDay = RegexMedical.regexDate(input.nextLine());
        System.out.println("Please enter the check out day:");
        String checkOutDay = RegexMedical.checkStartEndDate(checkInDay);
        System.out.println("Please enter the reason:");
        String reason = input.nextLine();
        System.out.println("Please enter the vip type: 1. VIP I ** 2. VIP II ** VIP III");
        String vipType = inputVipPackage();
        System.out.println("Please enter the vip period:");
        int vipTime = Integer.parseInt(RegexMedical.regexInput(input.nextLine(), RegexMedical.REGEX_POSITIVE_NUMBER, "It must be a positive number!"));
        VipMedicalRecord vipMedicalRecord = new VipMedicalRecord(recordNumber, medicalRecordCode,
                patientName, checkInDay, checkOutDay,
                reason, vipType, vipTime);
        medicalRecordList.add(vipMedicalRecord);
        ReadAndWriteMedical.writeMedical(medicalRecordList);
        System.out.println("Add new VIP medical record successfully!!");
    }

    @Override
    public void deleteMedicalRecord() {
        medicalRecordList = ReadAndWriteMedical.readMedical();
        boolean check = true;
        while (check) {
            System.out.println("Choose the id of the medical record which you want to delete!!");
            String code = RegexMedical.regexInput(input.nextLine(), RegexMedical.REGEX_MEDICAL_CODE,
                    "The medical record code must be in format BA-XXX. Example: BA-123, BA-002...");
            for (int i = 0; i < medicalRecordList.size(); i++) {
                if (code.equals(medicalRecordList.get(i).getMedicalRecordCode())) {
                    String choiceToDelete;
                    while (check){
                        System.out.println("Do you want to delete this medical record?");
                        System.out.println("1. YES  ** 2. NO");
                        choiceToDelete = input.nextLine();
                        switch (choiceToDelete){
                            case "1":
                                medicalRecordList.remove(medicalRecordList.get(i));
                                ReadAndWriteMedical.writeMedical(medicalRecordList);
                                System.out.println("THE LIST AFTER REMOVING:");
                                displayMedicalRecord();
                                check = false;
                                break;
                            case "2":
                                check = false;
                                break;
                            default:
                                System.out.println("Wrong choice, please try again!!");
                        }
                    }
                }
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

    @Override
    public void displayMedicalRecord() {
        try {
            medicalRecordList = ReadAndWriteMedical.readMedical();
            if (medicalRecordList.isEmpty()) {
                throw new NullPointerException();
            }
            for (MedicalRecord item : medicalRecordList) {
                System.out.println(item.toString());
            }
        } catch (NullPointerException e) {
            System.err.println("The data of medical record is empty!!");
        }
    }

    public String inputVipPackage() {
        String vip = "";
        boolean check = true;
        while (check) {
            switch (input.nextLine()) {
                case "1":
                    vip = "VIP I";
                    check = false;
                    break;
                case "2":
                    vip = "VIP II";
                    check = false;
                    break;
                case "3":
                    vip = "VIP III";
                    check = false;
                    break;
                default:
                    System.err.println("Wrong choice, please enter again!!");
            }
        }
        return vip;
    }
}
