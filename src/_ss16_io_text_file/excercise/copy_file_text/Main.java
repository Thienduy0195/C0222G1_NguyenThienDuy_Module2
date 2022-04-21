package _ss16_io_text_file.excercise.copy_file_text;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ReadAndWriteStringInFile readAndWrite = new ReadAndWriteStringInFile();
        List<String> stList = readAndWrite.readFile("src/_ss16_io_text_file/excercise/copy_file_text/main_file.txt");
        for (String item : stList
        ) {
            readAndWrite.writeFile("src/_ss16_io_text_file/excercise/copy_file_text/copy_file.txt", item);
        }
    }
}
