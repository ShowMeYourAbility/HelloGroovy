package com.llmcu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L05jdk {
    public static void main(String[] args) throws IOException, InterruptedException, NoSuchFieldException, IllegalAccessException {
        Process process = Runtime.getRuntime().exec("java -version");
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        String output;
        while ((output = br.readLine()) != null) {
            System.out.println(output);
        }
        int i = process.waitFor();
    }
}
