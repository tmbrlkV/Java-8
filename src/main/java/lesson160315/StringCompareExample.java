package lesson160315;

import java.util.Arrays;

public class StringCompareExample {
    public static void main(String[] args) {
        String[] array = {"one", "two", "three", "four"};
//        Arrays.sort(array, new Comparator<String>() {
//            @Override
//            public int compare(String s, String t) {
//                return s.length() - t.length();
//            }
//        });

//        Arrays.sort(array, (firstString, secondString) -> {
//            return firstString.length() - secondString.length();
//        });
        Arrays.sort(array, (firstString, secondString) -> firstString.length() - secondString.length());
        for (String s : array) {
            System.out.println(s);
        }

    }
}
