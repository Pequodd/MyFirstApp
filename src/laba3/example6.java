package laba3;

import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {

        System.out.println("Введите вариант решения");
        Scanner sc = new Scanner(System.in);
        int varnt = sc.nextInt();
        System.out.println("Ввведите количество чисел в сумме");
        int usrinput = sc.nextInt();
        int sum = 0;

        if (varnt==1) {
            for (int i = 0; usrinput > 0; i++) {
                if (i % 5 == 2 || i % 3 == 1) {
                    System.out.printf("%d\n", i);
                    sum = sum + i;
                    usrinput--;
                }
            }
        }
        else if (varnt==2){
            int i=0;
            while (usrinput>0){
                i++;
                if (i % 5 == 2 || i % 3 == 1){
                    System.out.printf("%d\n", i);
                    sum = sum + i;
                    usrinput--;
                }


            }


        }
        else {
            System.out.println("Введен не верный номер варианта ( 1 или 2 )");
        }

        System.out.printf("сумма %d", sum);
    }
    }

