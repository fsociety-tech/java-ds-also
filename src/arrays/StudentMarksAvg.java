package arrays;

import java.util.Scanner;

public class StudentMarksAvg {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter no of students ");

int n = sc.nextInt();

int[] marks = new int[n];
System.out.println("Enter the marks now");
for(int i=0;i<n;i++)
{
	 marks[i]=sc.nextInt();
	 System.out.println("marks entered "+ marks[i]);
}

int avgmarks = 0;
for(int i=0; i<n;i++)
{ 
	avgmarks+=marks[i];
}

avgmarks/=n;

System.out.println("average marks = "+ avgmarks);
}
	}


