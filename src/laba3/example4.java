package laba3;

import java.util.Scanner;

public class example4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите вариант решения 1 или 2");
        int variant = sc.nextInt();
        System.out.println("Введите количетсво чисел в последовательности Фибоначи");
        int usrnum = sc.nextInt();
        int firstnum = 0;
        int secnum = 1;
        int sumnum=1;

        if ( variant == 1 ){
            for (int x1 = usrnum; x1 > 0; --x1) {
                System.out.printf("\n"+sumnum);
                sumnum = firstnum + secnum;
                firstnum = secnum;
                secnum = sumnum;
            }


        }
        else if (variant == 2) {
            while(usrnum > 0) {
                System.out.printf("%d\n", sumnum);
                sumnum = firstnum + secnum;
                firstnum = secnum;
                secnum = sumnum;
                usrnum--;
            }

        }
        else {

            System.out.println("Выбран не верный вариант решения");
        }


    }
}
