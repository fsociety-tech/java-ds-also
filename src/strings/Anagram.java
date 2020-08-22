package strings;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		
//		String one = sc.next();
		
		String a= "aab#$%21";
		String b = "aba#$12";
		
		boolean anagram= true;
		
//		boolean visited[] = new boolean[b.length()] ;
//		
//		
//		if(a.length()==b.length())
//		{
//		
//		for(int i=0;i<a.length();i++)
//		{
//			char c = a.charAt(i);
//			anagram = false;
//			for(int j=0;j<b.length();j++)
//			{
//			 if(b.charAt(j)==c && !visited[j] )
//			 {
//				 visited[j] = true;
//				 anagram = true;
//				 break;
//			 }
//				 
//			}
//			
//			if(!anagram)
//			{
//				break;
//				
//			}
//			
//			
//		}}
		
		int al[] = new int[256];
//		int bl[] = new int[256];
		
		for( char c: a.toCharArray()) {
		
		 int index = (int) c;
		 al[index]++;
		 
		}
		for( char c: b.toCharArray()) {
			
			 int index = (int) c;
//			 bl[index]++;
			 al[index]--;
			}
		for(int i =0;i<256;i++)
		{
//			if(al[i]!=bl[i])
			if(al[i]!=0)
			{
				anagram = false;
			}
		}
		
		if(anagram)
		{
			System.out.println("is Anagram ");
		}
		else 
		
		{System.out.println("not anagram ");
		
	
		
		
		
	}

}}
