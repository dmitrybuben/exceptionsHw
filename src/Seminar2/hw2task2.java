package Seminar2;

//Если необходимо, исправьте данный код

public class hw2task2 {
    public static void main(String[] args) {
        try {
            int[]intArray = {1,2,3,4,5,6,7,8,9};
            int d = 0;
            double result = (double)intArray[8] / d;
            System.out.println("result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        }
    }
}
