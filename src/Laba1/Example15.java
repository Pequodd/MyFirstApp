package Laba1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1;
        int n2;
        int n3;
        int n4;

        System.out.println("Введиет первое число");
        n1=in.nextInt();

        System.out.println("Введиет второе число");
        n2=in.nextInt();

        n3=n1+n2;
        n4=n1-n2;

        System.out.println("Сумма чисел равна: "+n3+"\n");
        System.out.println("Разность4 чисел равна: "+n4);
    }
}
