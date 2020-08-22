//package strings;
//
//import java.util.Scanner;
//
//public class ReverseString {
//
//	
//    public   static  String reverseWords(String s) {
//        
//        int i = s.length()-1;
//        
//        String ans = "";
//        
//        
//        while(i>=0)
//        {
//            while(i>=0 && s.charAt(i)==' ') i--;
//            int j = i;
//            
//            if(i<0) break;
//            while(i>=0 && s.charAt(i)!=' ')i--;
//            
//            if(ans == "")
//            {
//            ans = ans.concat(s.substring(i+1,j+1));
//            }
//            else
//            {
//                  ans = ans.concat(" "+s.substring(i+1,j+1));
//            }
//        }
//     
//      return ans;
//      
//        
//    }
//        
//    
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println(" enter a string ");
//		
//		String a = sc.next();
//		
//		 reverseWords(a);
//	System.out.println( reverseWords(a));
//		
//		
//
//	}
//
//}
