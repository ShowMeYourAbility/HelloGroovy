package com.llmcu;

import java.util.Arrays;

public class TestToArray {
    public static void main(String[] args) {
        Integer[] array = Arrays.asList(1, 2, 3).stream().toArray(Integer[]::new);
        for (Integer integer : array) {
            System.out.println(integer);
        }
    }
}
