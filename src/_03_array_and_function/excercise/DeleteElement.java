package _03_array_and_function.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int [] array = {1,4,6,7,8,6,9,6,11,16};
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter x");
        int x = input.nextInt();
        int index = 1;
        boolean check = false;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]==x){
                check = true;
                index = i;
                break;
            }
        }
        if (check){
            System.out.println(x + " is at the index " + index);
        } else {
            System.out.println(Arrays.toString(array) + " is not includes " + x);
        }
        int a, i;
        int count =0;
        for (a=i=0; i <array.length;i++){
            if(array[i]!=x){
                array[a] = array[i];
                a++;
            } else {
                count++;
            }
        }
        for (int j = 0; j <count ; j++) {
            array[array.length-(j+1)] = 0;
        }
        System.out.println("The new array after deleted " + x + " is: " + Arrays.toString(array));
    }
}
