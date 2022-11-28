package Laba1;


import java.util.Calendar;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();

        int age;
        int byear;
        int cyear;

        cyear=calendar.get(Calendar.YEAR);

        System.out.println("Введите возраст");
        age=in.nextInt();
        byear=cyear-age;
        System.out.printf("Ваш возраст "+byear);

    }
}
