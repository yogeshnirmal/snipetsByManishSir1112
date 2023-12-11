package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        int k = 4;
        int[] Arr = {100, 200, 300, 400};

        List<Integer> listofInterger = new ArrayList<>();

        for (int i = 0; i <= Arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                if (j < Arr.length) {
                    sum += Arr[j];
                }
            }
            listofInterger.add(sum);
        }

        Optional<Integer> max = listofInterger.stream().max((i1, i2) -> i1.compareTo(i2));
        
        System.out.println("max"+max);

    }
}