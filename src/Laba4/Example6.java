package Laba4;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("введите высоту прямоугольника: ");
        int height = id.nextInt();
        char [][] graph = new char [height][];
        for (int i=0;i<graph.length;i++){
            int j = i+1;
            graph[i]=new char[j];
        }
        int z = 0;
        for (int i =0; i < height; i++){
            for (int j = 0; j <i+1; j++){
                graph[i][j] = 'X';
            }
        }
        for (int i =0; i < height; i++){//печать массива
            int count = i+1;//переменная для повышения номера индекса для вывода на консоль
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j < graph[i].length; j++){
                System.out.print(graph[i][j]+" ");
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0; //обнуление счетчика
        }
    }
}
