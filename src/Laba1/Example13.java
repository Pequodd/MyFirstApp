package Laba1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число");
        int n1=in.nextInt();

        System.out.println("Введите второе число");
        int n2=in.nextInt();

        int sum=n1+n2;

        System.out.printf("Сумма чисел: "+sum);


    }
}
