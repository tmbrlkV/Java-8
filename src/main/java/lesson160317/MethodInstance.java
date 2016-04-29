package lesson160317;

import java.util.Arrays;

public class MethodInstance {
    public static void main(String[] args) {
        String[] a = {"one", "two", "three"};
//        for (String s: a) {
//            System.out.println(s);
//        }

        Arrays.asList(a).forEach(p -> System.out.println(p));
        System.out.println();
        Arrays.asList(a).forEach(System.out::println);
    }
}
