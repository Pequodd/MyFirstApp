package Laba1;

import java.util.Scanner;

public class Example9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите навание месяца");
        String mname = in.nextLine();

        System.out.println("Введите количество дней в месяце");
        Integer mount = in.nextInt();

        System.out.printf("В месяце "+mname+" "+mount+" дней");


    }

}
