package laba3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {

     Scanner ns = new Scanner(System.in);
     System.out.println("Введите размер масива");
     int size = ns.nextInt();
     int[] nums = new int [size];
     Random rnd = new Random();

     for (int i = 0; i < nums.length; i++)
        {
            nums[i] = rnd.nextInt(200);
            System.out.println("Эллемент массива [" + i + "]" + nums[i]);
        }
        Arrays.sort(nums);
        System.out.println("Прозведена сортировка массива");
        for (int i=0; i<nums.length;i++){
            System.out.println("Эллемент массива ["+i+"] после сортировки= "+nums[i] );

        }
        }


    }


