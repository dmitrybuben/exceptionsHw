package Seminar1;

//Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
//Если длина массива меньше некоторого заданного минимума,
//метод возвращает -1, в качестве кода ошибки, иначе - длину массива.

public class task00 {
    public static final int MIN_LENGTH = 3;

    public static void main(String[] args) {
        int[]array = {1, 2, 3, 4, 5};
        System.out.println(CheckArrayLenght(array));
    }

    public static int CheckArrayLenght(int[] array) {
        if (array != null) {
            if (array.length < MIN_LENGTH) {
                return -1;
            }
            return array.length;
        }
        return -2;
    }
}
