package _ss14_sort_algorithm.excercise;

public class DescribeInsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 14, 11, 7, 2, 5, 19};
        System.out.println("MẢNG TRƯỚC KHI SẮP XẾP: ");
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
        insertionSort(arr);
        System.out.println("MẢNG SAU KHI HOÀN TẤT SẮP XẾP: ");
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public static void insertionSort(int[] array) {
        System.out.println("Khai báo 2 biến x và pos để (x) nhận giá trị cần xét còn pos nhận vị trí để chèn x");
        int x, pos;
        for (int i = 1; i < array.length; i++) { //đoạn array[0] đã sắp xếp
            System.out.println("Gán x = array[" + i + "] (x = " + array[i] + ")");
            x = array[i]; // gán x chạy từ array[1]
            System.out.println("Gán pos = i (pos = " + i + ")");
            pos = i; // gán pos chạy từ 1
            while (pos > 0 && x < array[pos - 1]) {
                System.out.println("Vì " + x + " nhỏ hơn " + array[pos - 1] + " nên hoán đổi vị trí giữa " + x + " và " + array[pos - 1]);
                System.out.println(" >> chèn " + array[pos - 1] + " vào vị trí của " + x + " (vị trí " + (pos) + ")");
                array[pos] = array[pos - 1]; // đổi chỗ
                pos--;
                System.out.println(" >> chèn " + x + " vào vị trí của " + array[pos] + " lúc nảy, (vị trí " + pos + ")");
                array[pos] = x;
                System.out.println(">>>>>>>>Mảng lúc này: ");
                for (int item : array) {
                    System.out.print(item + " ");
                }
                System.out.println();
            }
            if (x > array[pos - 1]) {
                System.out.println(x + " lớn hơn " + array[pos - 1] + " nên giữ nguyên vị trí, mảng không thay đổi, tăng i lên " + (i + 1));
            }
        }
    }
}
