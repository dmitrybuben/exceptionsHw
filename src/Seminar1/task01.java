package Seminar1;

//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
// Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
//        1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//        2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//        3. если вместо массива пришел null, метод вернет -3
//
//        Читаемый результат пользователю. Например, если вернулся -2, пользователю выведется сообщение:
//        “Искомый элемент не найден”.


public class task01 {
    public static final int MIN_LENGHT = 3;

    public static void main(String[] args) {
        int []arr = {1,2,3};
        int res = FindElement(2,arr);
        if(res == -3){
            System.out.println("The arrays is equal to null");
        }
        else if(res == -2){
            System.out.println("No such element found");
        }
        else if(res == -1){
            System.out.println("Array lenght less than minimal one");
        }
        else System.out.println(res);
    }

    public static int FindElement (int Num, int[]array){
        if(array != null){
            if (array.length >= MIN_LENGHT) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == Num) {
                        return i;
                    }
                }
                return -2;
            }
            return -1;
        }
        return -3;
    }
}
