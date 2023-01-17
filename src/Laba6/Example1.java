package Laba6;

public class Example1 {
    public static void main(String[] args) {
        Try1 try1 = new Try1();
        try1.setField('A');
        try1.setField("Hello World!");
        char[] arrayChar = new char[] {'B'};
        try1.setField(arrayChar);
        char[] arrayChar2 = new char[] {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!' };
        try1.setField(arrayChar2);
    }
}


class Try1 {
    char charField;
    String stringField;
    public void setField (char char1) {
        this.charField = char1;
        System.out.println(charField);
    }
    public void setField (String string1) {
        this.stringField = string1;
        System.out.println(stringField);
    }
    public void setField (char[] charAr) {
        if (charAr.length < 2) {
            this.charField = charAr[0];
            System.out.println(charField);
        } else {
            stringField = new String(charAr);
            System.out.println(stringField);
        }
    }
}