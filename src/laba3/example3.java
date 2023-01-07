package laba3;

import java.util.Scanner;

public class example3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите тип определения дня недели: /n  else if(1), switch (2) ");
        int ans = sc.nextInt();

        if (ans==1) {
            sc.nextLine();
            System.out.println("Введите название дня недели");
            String day = sc.nextLine();
            int numofday = 0;
            if (day.equals("понедельник")) {
                numofday = 1;
            } else if (day.equals("вторник")) {
                numofday = 2;
            } else if (day.equals("среда")) {
                numofday = 3;
            } else if (day.equals("четверг")) {
                numofday = 4;
            } else if (day.equals("пятница")) {
                numofday = 5;
            } else if (day.equals("суббота")) {
                numofday = 6;
            } else if (day.equals("воскресенье")) {
                numofday = 7;
            } else {
                System.out.println("Такого дня в неделе нет");
            }

            System.out.println("введеный день недели по счету является " + numofday);
        }
        else if (ans==2) {
            sc.nextLine();
            System.out.println("Введите название дня недели");
            String day = sc.nextLine();

            switch (day){
                case "понедельник":
                System.out.println("1 день недели");
                break;

                case "вторник":
                    System.out.println("2 день недели");
                    break;

                case "среда":
                    System.out.println("3 день недели");
                    break;

                case "четверг":
                    System.out.println("4 день недели");
                    break;

                case "пятница":
                    System.out.println("5 день недели");
                    break;

                case "суббота":
                    System.out.println("6 день недели");
                    break;

                case "воскресенье":
                    System.out.println("6 день недели");
                    break;

                default:
                    System.out.println("проверьте ввод данных");
                    break;


            }
        }

        else {

            System.out.println("Только 1 или 2");

        }

        }


    }

