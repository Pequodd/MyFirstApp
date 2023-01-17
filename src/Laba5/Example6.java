package Laba5;

public class Example6 {
    private int max;
    private int min;
    public void setNum (int num1, int num2) {
        max = Math.max(num1, num2);
        min = Math.min(num1, num2);
    }
    public void setNum (int num) {
        max = Math.max(max, num);
        min = Math.min(min, num);
    }
    Example6(int num1, int num2) {
        max = Math.max(num1, num2);
        min = Math.min(num1, num2);
    }
    Example6(int num) {
        max = Math.max(max, num);
        min = Math.min(min, num);
    }
    void count() {
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
    }
}

class Main_m {
    public static void main(String[] args) {
        Example6 example6 = new Example6(12, 22);
        example6.count();
        Example6 example61 = new Example6(22);
        example61.count();
        example6.setNum(13, 33);
        example6.count();
        example61.setNum(33);
        example61.count();
    }
}
