package Laba5;

public class Example4   {
    public static void main(String[] args) {

        class Example_4{

            //класс, у которого есть символьное и целочисленное поле
            private char ch1;
            private int int1;
            //версия конструктора с двумя аргументами (целое число и символ – определяют значения полей)
            Example_4(int i, char c){
                ch1 = c;
                int1 = i;
                int length = (int) (Math.log10(int1) + 1);
                double result = (double)ch1 + (double)int1*1/Math.pow(10, length);
                System.out.println("result1 = "+result+"; ch = "+(double)ch1+ "; int = "+length);
            }


            //версия конструктора с одним аргументом типа double
            Example_4(double d){
                //действительная часть аргумента определяет код символа (значение символьного поля)
                char ch1 = (char)d;
                //дробная часть (с учетом десятых и сотых) определяет значение целочисленного поля
                int1 = (int)((d -(int)d)*100);
                System.out.println("ch = "+ch1+"; int = "+int1);
            }
        }

        Example_4 myexample1 = new Example_4(12,'A');
        Example_4 myexample2 = new Example_4(65.1267);
    }
}
