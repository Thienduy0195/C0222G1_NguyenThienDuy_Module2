package _ss16_io_text_file.practice.find_max_and_write_in_file;

import java.util.List;
import java.util.Scanner;

public class FindMaxValue {
    public static Scanner input = new Scanner(System.in);

    public static int findMax(List<Integer> numList){
        int max = numList.get(0);
        for (int i = 1; i < numList.size() ; i++) {
            if(max < numList.get(i)){
                max = numList.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("src/_ss16_io_text_file/practice/find_max_and_write_in_file/numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("src/_ss16_io_text_file/practice/find_max_and_write_in_file/results.txt", maxValue);
    }
}

