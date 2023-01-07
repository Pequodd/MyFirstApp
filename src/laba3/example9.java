package laba3;

public class example9 {
    public static void main(String[] args) {

        char wovels[]=new char[10];
        char i = 'A';
        char wov[]={'A', 'E', 'I', 'O', 'U', 'Y'};


        for (int x=0;x<wovels.length;i++ ){

            for (int y = 0; y < wov.length; y++) //проверка на соответсвие массива гласных
            {
                if (i == wov[y]) {
                    i++;
                }
            }
            wov[x] = i; // Присвоение x-тому элементу массива значения i
            System.out.println("Элемент массива ["+x+"] = " + wovels[x]); // Сообщение пользователю
            x++;
        }

        System.out.println("Создан массив из гласных");

    }
}
