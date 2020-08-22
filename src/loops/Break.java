package loops;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
	
//	for(int i=0;i<=100;i++)
//	
//	{ if(i==5)
//	{ break;
//	
//	}
//		System.out.println(i);
//
//	}

		Scanner sc = new Scanner(System.in);
		
		for(;;)
		{
			int a =sc.nextInt();
			
			if(a<0)
			{break;
			
			}
		
	System.out.println(a);
		}
		
}}
