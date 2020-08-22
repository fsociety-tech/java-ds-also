package coditionalStatement;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter your first digit");
int a = sc.nextInt();
System.out.println("enter secont no digit");
int b = sc.nextInt();

System.out.println("enter the operation to be performed");
sc.nextLine();
char operation = sc.nextLine().charAt(0);
int result = 0;
switch(operation)
{case '+':
	result = a+b;
	break;
case '-':
result = a-b;
break;
case '*':
	result= a*b;
	break;
case '/':
	result= a/b;
	break;
	default:
		System.out.println("nothing has to be done now");
	
}

System.out.println("the result is = "+ result);


	}

}
