package Seminar2;

/*Обработайте возможные исключительные ситуации. “Битые” значения в исходном массиве считайте нулями.
Можно внести в код правки, которые считаете необходимыми.*/

public class Task2 {
    public static void main(String[] args) {
        String[][] arr = null;//{{"-", "a", "3", "4", "5"}, {"4", "5", "6", "4", "6"}};
        System.out.println(sum2d(arr));
    }

    public static int sum2d(String[][] arr) {
        if (arr == null){
            throw new RuntimeException("The array in null");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int val = 0;
                try {
                    val = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("Symbol is not a digit");
                } finally {
                    sum += val;
                }
            }
        }
        return sum;
    }
}
