package _03_array_and_function.practice;

public class FindMinValue {
    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] testArray = {20, 12, 19, 95, 17, 6, 19, 96};
        int index = minValue(testArray);
        System.out.println("The smallest element in the array is: " + testArray[index]);
    }
}
