package Lesson1;

import java.io.File;

public class App {
    public static void main(String[] args) {
        int [] ints = new int[10];
        System.out.println(ints[1000]);
        //System.out.println(divide(10,0));
        //System.out.println(GetFileSize(new File("logfile.txt")));
    }

    public static int divide(int a1, int a2){
        /*if(a2 == 0){
            return -1;
        }*/
        return(a1/a2);
    }

    public static long GetFileSize(File file){
        if (!file.exists()){
            return -1L;
        }
        return file.length();
    }
}

