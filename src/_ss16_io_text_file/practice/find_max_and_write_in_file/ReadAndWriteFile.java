package _ss16_io_text_file.practice.find_max_and_write_in_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public List<Integer> readFile(String filePath) {
        List<Integer> numberList = new ArrayList<>();
        try{
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine())!= null){
                numberList.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numberList;
    }

    public void writeFile(String filePath, int max){
        try{
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            System.out.println("Giá trị lớn nhất là: " + max);//hiển thị giá trị lớn nhất ra cửa sổ console
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
