package Seminar1;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//Если длины массивов не равны, необходимо как-то оповестить пользователя.

import java.util.Arrays;

public class hw1task3 {
    public static void main(String[] args) {
        int[] arr = {12, 21, 32};
        int[] array = {1, 2, 3};
        System.out.println(Arrays.toString(diffArr(arr, array)));
    }

    public static int[] diffArr(int[] arr, int[] array) {
        if (arr.length != array.length) {
            throw new RuntimeException("Arrays got different lenghts");
        }
        int[] resArr = new int[arr.length];
        for (int i = 0; i < resArr.length; i++) {
            resArr[i] = arr[i] - array[i];
        }
        return resArr;
    }
}