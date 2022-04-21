package _ss16_io_text_file.excercise.read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCountry {

    public static List<String[]> readFile(String path) {
        File file = new File(path);
        List<String[]> countryList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] countryArray = line.split(",");
                countryList.add(countryArray);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countryList;
    }
}
