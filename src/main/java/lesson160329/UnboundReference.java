package lesson160329;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UnboundReference {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("a", "b", "A", "B");
        strList.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        strList.sort(String::compareToIgnoreCase);
        System.out.println(strList);

        Map<String, String> map = new TreeMap<String, String>() {{
            put("alpha", "X");
            put("bravo", "Y");
            put("charlie", "Z");
        }};

//        String str = "alpha-bravo-charlie";
//        System.out.println(str.replace("al", "zaal"));
//
//        map.replaceAll(str::replace);
        map.replaceAll(String::concat);

        System.out.println(map);


    }
}
