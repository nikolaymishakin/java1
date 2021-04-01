package ru.progwards.java1.lessons.io1;

import java.io.*;
import java.util.Scanner;

public class LineCount {
    public static int calcEmpty(String fileName) throws IOException {
        int count = 0;
        FileReader stringFile = new FileReader(fileName);
        Scanner scanner = new Scanner(stringFile);
        while (scanner.hasNextLine()) {
            String file = scanner.nextLine();
            count++;
        }
        stringFile.close();
        return count;
    }
}
