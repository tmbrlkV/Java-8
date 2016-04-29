package lesson160317;

import java.util.Arrays;

public class StaticExample {
    public static void main(String[] args) {
        Integer[] a = {10, 20, -30, 23, 16, 3, 91, 0};

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        Arrays.sort(a, (i, j) -> Integer.compareUnsigned(i, j));
        Arrays.sort(a, Integer::compareUnsigned);

        System.out.println(Arrays.toString(a));
    }
}
