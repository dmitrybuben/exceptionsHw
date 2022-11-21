package Seminar2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        writeToFile();
        fillArr(writeToFile());
    }

    public static File writeToFile() {
        File file = new File("/Users/dmitrybuben/IdeaProjects/Exceptions/src/Seminar2/task3.txt");
        FileWriter fw;
        try {
            fw = new FileWriter(file);
            fw.write("Anna=4\n");
            fw.write("Elena=5\n");
            fw.write("Marina=6\n");
            fw.write("Vladimir=?\n");
            fw.write("Konstantin=?\n");
            fw.write("Ivan=4");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("File doesn't exist");
        }
        return file;
    }

    public static String[][] fillArr(File file) {
        String[][] arr = new String[6][2];
        try {
            FileReader fr = new FileReader(file);
            Scanner sc = new Scanner(fr);
            int i = 0;
            while (sc.hasNextLine()) {
                String[] str = sc.next().split("=");
                arr[i][0] = str[0];
                if ("?".equals(str[1])) {
                    arr[i][1] = String.valueOf(arr[i][0].length());
                } else {
                    arr[i][1] = str[1];
                }
                i++;
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println("Unable to close");
                }
                for (int j = 0; j < arr.length; j++) {
                    for (int k = 0; k < arr[0].length; k++) {
                        System.out.println(arr[j][k]);
                    }
            }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return arr;
    }
}
