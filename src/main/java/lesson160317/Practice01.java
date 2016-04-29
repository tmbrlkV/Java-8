package lesson160317;

import java.util.Arrays;
import java.util.Comparator;

public class Practice01 {
    public static void main(String[] args) {
        String[] a = {"one", "two", "three", "four"};
//        Arrays.sort(a, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });

        Arrays.sort(a, (s1, s2) -> s1.length() - s2.length()); // 0. sort by length
        Arrays.sort(a, (s1, s2) -> s2.length() - s1.length()); //1. reverse sort by length
        Arrays.sort(a, (s1, s2) -> s1.charAt(1) - s2.charAt(1)); //2. second alphabet sort
        Arrays.sort(a, (s1, s2) -> {
            if ((s1.charAt(0) == 't' || s1.charAt(0) == 'T') && (s2.charAt(0) == 't' || s2.charAt(0) == 'T')) {
                return s1.charAt(1) - s2.charAt(2);
            }
            return 0;  //3. second alphabet 'T'
        });
        Arrays.sort(a, (s1, s2) -> compared(s1, s2));
        System.out.println(Arrays.toString(a));
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello");
//            }
//        }).start();
        new Thread(() -> System.out.println("Hello")).start();

    }

    private static int compared(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
