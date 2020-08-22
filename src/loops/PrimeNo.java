package loops;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no:- ");
		
		int n= sc.nextInt();
		 boolean isprime = true;
		 
		 for(int i= 2; i<n;  i++)
		 { if(n%i==0) isprime=false;
		
		 
		 
		 }
		 if(n<2) isprime= false;
//		 if(n==2) isprime=true;
		 
		 System.out.println("is a prime no = "+isprime);
	}
//		Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt(); // input testcases
//        
//        while(t-- >0) //while testcase have not been exhausted
//        {
//            int n = 0, i = 0, fact = 0;
//            n = sc.nextInt();
//            
//            for( i = 1; i*i <= n; i++) // All the factors of a number lie on each side of sqrt(n), i.e i = 1 to sqrt(n), n/i = sqrt(n) to n. 
//            {
//                if(n%i == 0)  { //if n is divisible by any number from 1 to n the increase the factors count
//                  fact++;
//                 if((i*i)!=n) fact++;
//                }
//            }
//            
//            if(fact == 2) //prime has only two factors 1 and number itself
//              System.out.println("Yes");
//            else
//              System.out.println("No");
//        }
//    }
}
