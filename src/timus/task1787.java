package timus;

import java.util.Scanner;

public class task1787 {

	public static void main(String[] args) {
    
		Scanner nn = new Scanner(System.in);
		int k = nn.nextInt();
		int n = nn.nextInt();
		
		int left =0;
		
		for (int i=0; i<n; i++) {
			
			
		int x = nn.nextInt();
		left = left+x-k;
		if( left <0 ) {
			
			
			left = 0;
		}	
		
		}
		System.out.println (left);
		
		
		
		
		
		

	}

}
