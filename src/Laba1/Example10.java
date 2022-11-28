package Laba1;

import java.util.Scanner;
import java.util.Calendar;

public class Example10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();

        int year;
        int byear;
        int age;

        System.out.println("Введите ваш год рождения");
        byear = in.nextInt();
        year = calendar.get(Calendar.YEAR);
        age = year-byear;
        System.out.printf("Вам сейчас "+age+" лет");



    }










    }

