package _03_array_and_function.excercise_by_method;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementByMethod {
    public static void main(String[] args) {
        int [] arr = {1,4,6,7,8,9,11,16,0,0,0};
        System.out.println(Arrays.toString(addElement(arr)));;
    }
    public static int[] addElement(int[] array) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the element which need to be added");
        int x = input.nextInt();
        int index;
        do {
            System.out.println("Please enter the index to add " + x);
            index = input.nextInt();
            if (index <= -1 || index >= array.length) {
                System.out.println("Can't add " + x + " into the array");
            }
        } while (index <= -1 || index >= array.length);

        int i;
        for (i = array.length - 1; i >= index; i--) {
            array[i] = array[i - 1];
            if (i == index) {
                array[i] = x;
            }
        }
        return array;
    }
}


