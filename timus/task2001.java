package timus;

import java.util.Scanner;

public class task2001 {
	
	public static void main(String[] args) {
	
	Scanner nn = new Scanner (System.in);
	int a1=nn.nextInt();
	int b1=nn.nextInt();
	int a2=nn.nextInt();
	int b2=nn.nextInt();
	int a3=nn.nextInt();
	int b3=nn.nextInt();
	
	int berries2 = b1-b2;
	int berries1 = b3-berries2-b2;	
	System.out.println (berries1+" "+berries2);
	
	
	}

}
