package laba3;

import java.util.Scanner;

public class example5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите вариант решения задачи 1 или 2");
        int varnt = sc.nextInt();

        System.out.println("Введите первое число");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число");
        int num2 = sc.nextInt();
        int count;

        if (varnt == 1) {
            System.out.printf("Используется цикл wheel \n");
            if (num1 < num2) {
             for (count=num1; count <= num2; count++ ){

                 System.out.println(count);

             }
                }
            else if ( num2 < num1 ){
                for(count=num2;count<=num1;count++){

                    System.out.println(count);
                }
                }
            }

                else if ( varnt==2 ) {
                    System.out.printf("Используется цикл wheel \n");
                    if (num1<num2){
                        count=num1;
                        while (count<=num2){
                            System.out.println(count);
                            count++;
                        }
                    }
                    else if (num2<num1){

                        count=num2;
                        while (count<=num1){
                            System.out.println(count);
                            count++;
                        }
                    }


        }


        }
    }
