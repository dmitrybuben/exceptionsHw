package Seminar1;

/*4*. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше*/

import java.util.Arrays;

public class hw1task4 {
    public static void main(String[] args) {
        int[]arr = {4,3,30};
        int[]array = {8,0};
        System.out.println(Arrays.toString(divArray(arr,array)));

    }

    public static double[] divArray(int[]arr, int[]array){
        if(arr.length != array.length) {
            throw new RuntimeException("Arrays got different length");
        }
        double[]resArr = new double[arr.length];
        for (int i = 0; i < resArr.length; i++) {
            if(array[i] !=0) {
                resArr[i] = (double) arr[i] / array[i];
            }
            else {
                throw new RuntimeException("Divider can not be zero");
            }
        }
        return resArr;
    }
}
