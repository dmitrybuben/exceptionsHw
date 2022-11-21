package Seminar2;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class hw2task4 {
    public static void main(String[] args) {
        stringEntryCheck();
    }

    public static void stringEntryCheck() {
        System.out.println("Введите данные: ");
        Scanner sc = new Scanner("");
        if (!sc.hasNext()) {
            throw new RuntimeException("Пустые строки вводить нельзя");
        } else {
            System.out.println("Вы ввели: " + sc.next());
        }
    }
}
