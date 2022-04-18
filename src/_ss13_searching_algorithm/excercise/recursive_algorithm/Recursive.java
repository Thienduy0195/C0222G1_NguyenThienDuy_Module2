package _ss13_searching_algorithm.excercise.recursive_algorithm;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Recursive {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 9, 15, 19, 25};
        Arrays.sort(arr);
        binarySearch(arr, 0, arr.length - 1, 5);
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        int mid = -1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (array[mid] == value) {
                return mid;
            }
            if (array[mid] > value) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            binarySearch(array, left, right, value);
        }
        return mid;
    }
}
