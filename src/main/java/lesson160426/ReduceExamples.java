package lesson160426;

import java.util.Arrays;

public class ReduceExamples {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;

        for (int i : numbers) {
            sum += i;
        }

        System.out.println("Foreach sum:" + sum);

        sum = Arrays.stream(numbers).reduce(0, Integer::sum);

        System.out.println("Stream sum:" + sum);

        System.out.println("Stream count:" + Arrays.stream(numbers).map(d -> 1).reduce(0, Integer::sum));

        sum = Arrays.stream(numbers).reduce(0, Integer::max);

        System.out.println("Stream max:" + sum);

    }
}
