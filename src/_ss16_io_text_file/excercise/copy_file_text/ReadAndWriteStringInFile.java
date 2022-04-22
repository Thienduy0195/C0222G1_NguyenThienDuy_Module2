package _ss16_io_text_file.excercise.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteStringInFile {
    public List<String> readFile(String path) throws IOException {
        List<String> stringList = new ArrayList<>();
        int count = 0;
        BufferedReader br = null;
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                count += line.length();
                stringList.add(line);
            }
        } catch (IOException e) {
            System.out.println("File not found, please creating new file.");
        }finally {
            if(br != null){
                br.close();
            }
        }
        System.out.println("The numbers of character in file is: " + count);
        return stringList;
    }

    public void writeFile(String path, String str) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
            bw.write(str);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("The copy file is not found!, please create copy file!");
        }
    }
}

