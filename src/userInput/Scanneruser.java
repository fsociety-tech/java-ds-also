package userInput;
import java.util.Scanner;

public class Scanneruser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
 int principal = sc.nextInt();
 float rate = (float)sc.nextFloat();
  int time= sc.nextInt();
  
  float SimpleInterest = principal * rate *time /100;
  
  System.out.println("Simple interest is"+ SimpleInterest);
  
  
		

	}

}
