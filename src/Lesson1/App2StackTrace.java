package Lesson1;

// Stack trace - цепочка вызовов: первая строка - где возникло исключение,
// последняя - отправная точка откуда был вызов

public class App2StackTrace {
    public static void main(String[] args) {
        a();
    }

    public static void a(){
        b();
    }

    public static void b(){
        c();
    }

    public static void c(){
        int[] ints  = new int[10];
        System.out.println(ints [1000]);
    }
}
