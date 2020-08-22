package loops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
//int sum =0;
//
//for(int i=0;i<10;i++)
//{sum = sum +i;
//	}
//System.out.println("sum = "+ sum);
//		int tableof = 5;
//		
//		
//		for(int i=1; i<11;i++)
//		{ System.out.println("Table of 5 ="+ tableof*i);
//		
//		}
//		for(int i=0;i<10;i--)
//		{System.out.println(i);\
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no");
		int no = sc.nextInt();
		int fact = 1;
		for(int i=no;i>=1;i--)
		{ fact= fact*i;
		
		}
		System.out.println(fact);
		
		
}}