package _ss16_io_text_file.excercise.read_file;

import java.util.ArrayList;
import java.util.List;

public class CountryMain {
    public static List<CountryClass> list = new ArrayList<>();

    public static void main(String[] args) {
        display();
    }

    public static void display() {
        List<String[]> strList = ReadAndWriteCountry.readFile("src/_ss16_io_text_file/excercise/read_file/Country");
        for (String[] item : strList) {
            list.add(new CountryClass(Integer.parseInt(item[0]), item[1], item[2]));
        }
        for (CountryClass item : list) {
            System.out.println(item.toString());
        }
    }

}
