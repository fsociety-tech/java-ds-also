package arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int a[]= {2,4,3,1,0,5,7};
		
		int n = a.length;
		
		boolean sorted = true;
		for( int i=0; i<n-1; i++)
		{
//			for(int j=0; j<n-1;j++)
			for(int j=0; j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{ int temp = a[j];
				 a[j]= a[j+1];
				 a[j+1]= temp;
				sorted = false;
				}
			}
			if(sorted) break;
		}
		
		for(int item:a)
		{
			System.out.print(item+" ");
		}
	}

}
