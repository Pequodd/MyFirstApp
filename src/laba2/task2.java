package laba2;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {

		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Введите числло");
		float checknum = in.nextFloat();
		
		float c1 = checknum % 5;
		float c2 = checknum % 7;
		
		if ( c1==2 & c2 ==1)
		{
			
			System.out.println("Число соотвветсвует критериям");
			
		}
		
		else
		{
			
			System.out.println("Число не соотвветсвует критериям");
		}
		
		
		
		
		

	}

}
