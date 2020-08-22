package loops;

import java.util.Scanner;

public class Pattern10 {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println(" enter a no ");
		 int a = sc.nextInt();
		 

		 for(int i=1; i<=a; i+=2)
		 {
			 for(int j = 1; j<=i; j+=2)
			 {
//				 if(j==2 || j%2==0)
//				 {
//					 j++;
//					 
//				 }
				 
				 if(j!=2 && j%2!=0 )
				 {
				 System.out.print(j+" ");
			 }
		

				 if(j%i==0)
			{
					System.out.println(j+2+" "); 
				 }
			
		 }
			 System.out.println();
		 }}}
		 
			 
		
			 
		 
		 
		 
	
	
		
	


