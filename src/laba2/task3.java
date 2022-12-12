package laba2;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		
		
	Scanner dd = new Scanner (System.in);
		
	int div1;
	boolean check;
	boolean check2;
	
	
	System.out.println("Введите число для проверки");
	div1 = dd.nextInt();
	if (div1 % 4==0 )
		
	{
		check=true;

	}
	else 
	{
		check=false;
	}
	
	
	if (div1<10)
	
	{ 
		check2=true;
	}
	
	else 
	
	{ 
		check2=false;
	}
	
	if ( check & check2 == true)
		
	{
		System.out.println("Число делится на 4 и меньше 10");
	}
	
	else
	{
		{
			System.out.println("Число не  делится на 4 и больше или равно 10");
		}
	}

}
}