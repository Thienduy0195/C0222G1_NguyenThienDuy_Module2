package _super_ss_testall.test_this;

import java.util.*;

public class Ex {
    public static void main(String[] args) {
        int[] array = {-1, 150, 190, 170, -1, -1, 160, 180, -1, -1};
        System.out.println(Arrays.toString(solution(array)));
        ;
    }

    static int[] solution(int[] a) {

        List<Integer> l = new ArrayList<>();
        for (int i : a) {
            if (i != -1) {
                l.add(i);
            }
        }
        Collections.sort(l);
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                a[i] = l.get(b);
                b++;
            }
        }
        return a;
    }
}
