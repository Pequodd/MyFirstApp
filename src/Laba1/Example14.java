package Laba1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int usernumber;
        int n1;
        int n2;
        int n3;
        int n4;

        System.out.println("Введите число");
        usernumber = in.nextInt();

        n1=usernumber-1;
        n2=usernumber+1;
        n3=n1+n2+usernumber;
        n4=(int)Math.pow(n3,2);

        System.out.printf(String.valueOf(n1)+" ");
        System.out.printf(String.valueOf(usernumber)+" ");
        System.out.printf(String.valueOf(n2)+" ");
        System.out.printf(String.valueOf(n4));







    }
}
