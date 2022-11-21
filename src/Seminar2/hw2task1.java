package Seminar2;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class hw2task1 {
    public static void main(String[] args) {
        numEntry();
    }

    public static void numEntry() {
        System.out.println("Enter the float number: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextFloat()) {
            System.out.println("You entered: " + sc.nextFloat());
            sc.close();
            } else {
            System.out.println("Wrong input, try again");
            numEntry();
        }
    }
}
