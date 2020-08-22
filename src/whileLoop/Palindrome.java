package whileLoop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int reverse = 0;
int temp = n;


while(temp>0)
{
	int lastdigit = temp%10;
	temp/=10;
	reverse = reverse*10 +lastdigit;
	
}
	
	if(reverse==n)
	{ System.out.println("given no "+n+" is palindrome");
	
}
	else System.out.println("given no is not a palindrome");

	}

}

