package coditionalStatement;

public class NestedLogics {

	public static void main(String[] args) {
int a= 10;
int b = 200;
int c= 30;
int result = 0;
if(a>b)
{ if(a>c) {result = a;
} else {result = c;

	
}
	}
if(b>a) {if (b>c) {result = b;}
else{result=c;}

System.out.println(result);
}}}
