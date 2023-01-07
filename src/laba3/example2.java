package laba3;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {

        System.out.println("Введите число в диапазоне от 1 до 7");
        Scanner sc = new Scanner(System.in);
        int dayn = sc.nextInt();
        switch(dayn)
        {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("число вне недельного диапазона");
                break;
        }


    }
}
