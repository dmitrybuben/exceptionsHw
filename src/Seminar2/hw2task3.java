package Seminar2;

import java.io.FileNotFoundException;

public class hw2task3 {
    public static void main(String[] args){
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Index out of array bound");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}

