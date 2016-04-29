package lesson160329;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Practice01 {
    public static void main(String[] args) {
        method1(0, 1, Math::cos); // 1
        Arrays.asList("1", "2", "3").forEach(System.out::println); // 2
        method2(0, 1, Math::pow);
        method3(0, 1, Integer::sum);

    }

    private static void method1(double x, double y, UnaryOperator<Double> d) {

    }

    private static void method2(double x, double y, BinaryOperator<Double> d) {

    }

    private static void method3(double x, double y, BinaryOperator<Integer> d) {

    }
}