package Laba1;

import java.util.Calendar;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();

        int year;
        int age;

        year = calendar.get(Calendar.YEAR);
        System.out.println("Введите имя");
        String name = in.nextLine();

        System.out.println("Введите год рождения");
        int byears = in.nextInt();
        age=year-byears;


        System.out.printf(name);
        System.out.printf(" "+age);

    }
}
