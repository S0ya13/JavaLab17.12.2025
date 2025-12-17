package pl.edu.vistula.task3;

import java.util.Arrays;
import java.util.Random;

public class ArrayStreamMain {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rnd = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(100) + 1;
        }

        Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
        System.out.println();

        int min = Arrays.stream(numbers).min().orElse(0);
        int max = Arrays.stream(numbers).max().orElse(0);

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
