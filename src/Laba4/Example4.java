package Laba4;

public class Example4 {
    public static void main(String[] args) {
        int figure = 20;
        int i ;
        int j ;
        int z=0;
        for (i = 1 ; i <= figure; i++){
            System.out.print("номер строки: " + i + " ");
            for (j = 0; j <=z; j++){
                System.out.print("+");
            }
            z = z + 1;
            System.out.println(" Количество символов в строке " + z);
        }
    }
}
