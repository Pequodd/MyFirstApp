package laba3;

import java.util.Scanner;
import java.util.Random;

public class example7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        if (sc.hasNextInt()) {
            int arrsize = sc.nextInt();
            if (arrsize > 0) {

                int mass[] = new int[arrsize];
                for (int i = 0; i < mass.length; i++) {

                    if (i % 5 == 2) {
                        mass[i] = i;
                        System.out.println(mass[i]);
                    }

                }
            }
            else {
                System.out.println("Введено отрицательное число");
            }
        }

        else {
            System.out.println("Введено не целое число");
        }


    }
}
