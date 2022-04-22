package _test_serialization;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Country> myList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
//         display();
//        myList.add(new Country(1, "a", "a", new Capital()));
//        myList.add(new Country(2, "a", "a", new Capital()));
//        myList.add(new Country(3, "a", "a", new Capital()));
//         writerObj();

        readObj();
        for (Country c :
                myList) {
            System.out.println(c);
        }
    }
    public static void readObj(){
        try {
            myList = (List<Country>) ReaderFile.readFileBinary("src/_test_serialization/countries.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writerObj(){

        ReaderFile.writerFileBinary("_15_io_text_file/exercise/reader_file_csv/obj.csv", myList);

    }

//    public static void display() throws IOException {
//        List<String[]> list = ReaderFile.readFile("_15_io_text_file/exercise/reader_file_csv/countries.csv");
//        for (String[] item: list) {
//           myList.add(new Country(Integer.parseInt(item[0]),item[1],item[2]));
//        }
//        for ( Country item: myList) {
//            System.out.println(item.toString());
//        }
//    }
}
