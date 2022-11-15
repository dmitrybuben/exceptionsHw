package Seminar1;

//Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
//Метод должен пройтись по каждому элементу и проверить что он не равен null. А теперь реализуйте следующую логику:
//1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”.


import java.util.ArrayList;
import java.util.List;

public class task04 {
    public static void main(String[] args) {
        Integer[]arr = {1,2,null,4,null};
        System.out.println("indexes with null values are: " + checkArray(arr));
    }

    public static ArrayList<Integer> checkArray(Integer[]arr){
        ArrayList<Integer>indexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == null){
                indexes.add(i);
            }
        }
        return indexes;
    }
}
