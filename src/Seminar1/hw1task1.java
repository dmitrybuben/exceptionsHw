package Seminar1;

//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

import java.util.Arrays;

public class hw1task1 {
    public static void main(String[] args) {
        int[]array = {1,2,3,45,4};
        System.out.println(Arrays.toString(printArray(array)));

        float c = div(5,0);

        int n = strToNum("1234O");
    }
    // 1. Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    public static int[] printArray(int[]arr){
        for (int i = 0; i <= arr.length; i++) {
            arr[i] = 5;
        }
        return arr;
    }

    // 2. Exception in thread "main" java.lang.ArithmeticException: / by zero
    public static int div(int a, int b) {
        return a/b;
    }

    // 3. Exception in thread "main" java.lang.NumberFormatException: For input string: "1234O"
    public static int strToNum(String str){
        return Integer.parseInt(str);
    }
}
