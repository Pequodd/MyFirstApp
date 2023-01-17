package laba2;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.printf("Введите число для проверки деления");
		int numbr = in.nextInt();

		if (numbr %3 == 0)
		{
			
			System.out.println("Число делится на 3");
		}
		
		else {
			
			System.out.println("Число не делится на 3");
			
		}
		
		
		
		
		
		
		

	}

}
