package laba3;

import java.util.Arrays;

public class example8 {

    public static void main(String[] args) {
        int alma = 10;
        char alphabet[]  = new char [alma];
        System.out.println("Создан массив из 10 эллементов");
        char i = 's';
        for (int x = 0; x < alma; i--) {
            if (i%2 == 1) {
                alphabet[x] = i;
                System.out.println("Элемент массива ["+x+"] = " + alphabet[x]);
                x++;
            }
        }
        System.out.println("конец массива\n");
        Arrays.sort(alphabet);
        System.out.println("Произведена сортировка массива");
        for (int x = 0 ; x < alphabet.length ; x++ ){
            System.out.println("Элемент массива ["+x+"] после сортировки = " + alphabet[x]);
        }
        System.out.println("конец массива");
    }
}
