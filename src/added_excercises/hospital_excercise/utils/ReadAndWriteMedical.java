package added_excercises.hospital_excercise.utils;

import added_excercises.hospital_excercise.models.MedicalRecord;
import added_excercises.hospital_excercise.models.NormalMedicalRecord;
import added_excercises.hospital_excercise.models.VipMedicalRecord;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteMedical {

    public static String MEDICAL_PATH = "src/added_excercises/hospital_excercise/data/medical_record.csv";

    public static void writeMedical(List<MedicalRecord> list) {
        File file = new File(MEDICAL_PATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            if (!file.exists()){
                throw new FileNotFoundException("File not found!!");
            }
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (MedicalRecord medicalRecord: list) {
                bufferedWriter.write(medicalRecord.makeText());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if (bufferedWriter != null){
                    bufferedWriter.close();
                    fileWriter.close();
                }
            }catch (IOException e){
                System.err.println("Error at write medical record to Csv!!");
            }
        }
    }

    public static List<MedicalRecord> readMedical(){
        List<MedicalRecord> medicalRecordList = new LinkedList<>();
        File file = new File(MEDICAL_PATH);
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String [] array;
            NormalMedicalRecord normalMedicalRecord;
            VipMedicalRecord vipMedicalRecord;
            while ((line = bufferedReader.readLine()) != null){
                array = line.split(",");
                if(array.length==7){
                    normalMedicalRecord = new NormalMedicalRecord(Integer.parseInt(array[0]),array[1], array[2],
                            array[3],array[4],
                            array[5], Double.parseDouble(array[6]));
                    medicalRecordList.add(normalMedicalRecord);
                }else if (array.length==8){
                    vipMedicalRecord = new VipMedicalRecord(Integer.parseInt(array[0]),array[1], array[2],
                            array[3],array[4],
                            array[5], array[6], Integer.parseInt(array[7]));
                    medicalRecordList.add(vipMedicalRecord);
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.err.println("Error at read medical record to Csv!!");
        }
        return medicalRecordList;
    }
}
