package Laba1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);

        System.out.println("input surname");
        String surname = in.nextLine();

        System.out.println("input name");
        String name = in.nextLine();

        System.out.println("input perv");
        String perv = in.nextLine();

        System.out.printf("Hello:");
        System.out.printf(" "+surname+" " );
        System.out.printf(" "+name+" ");
        System.out.printf(" "+perv+" ");



    }
}
