package added_excercises.excercise2;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteSubject {
    public static final String SUBJECT_PATH = "src/added_excercises/excercise2/subject.csv";
    public static final String SUBJECT_HEADER = "CODE,NAME,VERSION,LEVEL,STUDY TIME";

    public static void writeSubject(List<Subject> list) {
        File file = new File(SUBJECT_PATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            if (!file.exists()){
                throw new FileNotFoundException("File not found!!");
            }
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line="";
            bufferedWriter.write(SUBJECT_HEADER);
            for (Subject subject: list) {
                bufferedWriter.newLine();
                bufferedWriter.write(subject.makeText());
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
                System.err.println("Error at write subject to Csv!!");
            }
        }
    }

    public static List<Subject> readSubject(){
        List<Subject> subjectList = new LinkedList<>();
        File file = new File(SUBJECT_PATH);
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String [] array;
            Subject subject;
            while ((line = bufferedReader.readLine()) != null){
                array = line.split(",");
                if (array[0].contains("CODE")){
                    continue;
                }
                subject = new Subject(array[0],array[1], array[2], array[3], Integer.parseInt(array[4]));
                subjectList.add(subject);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.err.println("Error at read subject to Csv!!");
        }
        return subjectList;
    }
}
