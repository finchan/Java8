package com.tasche.lambda;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExecuteAround {
    public static void main(String[] args) throws IOException {
        String oneLine = processFile((BufferedReader br) -> br.readLine());
        System.out.println(oneLine);
        String twoLines = processFile((BufferedReader br) -> br.readLine() + br.readLine());
        System.out.println(twoLines);
    }

    public static String processFile(BufferedReaderProcessor brp) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir")
                + "\\src\\main\\java\\com\\tasche\\lambda\\test.txt"))) {
            return brp.process(br);
        }
    }
}
