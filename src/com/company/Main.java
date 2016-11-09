package com.company;
import java.util.Arrays;

public class Main
{
    public static final CompareByK COMPARE_BY_K = new CompareByK();

    public static void main(String[] args) {
        Pair [] mass = new Pair[] {
                new Pair(0, 0.71, 1.1),
                new Pair(0, 4.71, 5.21),
                new Pair(0, 1.7221, 1.1),
                new Pair(0, 8.71, 9.1),
                new Pair(0, 3.36, -6.003),
        };


        System.out.println(Arrays.deepToString(mass));
        Arrays.sort(mass, COMPARE_BY_K);
        System.out.println(Arrays.deepToString(mass));
    }

}
