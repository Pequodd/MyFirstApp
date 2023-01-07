package laba3;


import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class example10 {
    public static void main(String[] args) {


        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int count = sc.nextInt();

        int massiv[] = new int [count];
        int min = 0;
        for (int i=0; i<count;i++)
        {

            massiv[i] = rnd.nextInt(200);
            System.out.println(massiv[i]);


            min = massiv[0];
            for (int u=0; u<massiv.length;u++){
            if (massiv[u]<min)
            min = massiv[u];

            }


        }
        System.out.println("=========================");
        System.out.println("Минимальный эллемент массивва: "+min);
        int indx=0;
        for (int g=0;g<massiv.length;g++){




        }

        System.out.println("Индекс: ");

        }
    }
