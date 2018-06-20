import java.util.Scanner;
import java.util.Arrays;
class Anagram{
	
	
	
	
	
	 boolean checkAnagram(String word,String anagram)
	{

		String str1=word.toUpperCase();
		String str2=anagram.toUpperCase();
		char[] c1=str1.toCharArray();
		char[] c2=str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		String s1=new String(c1);
		String s2=new String(c2);
		
		  if(s1.equals(s2)) System.out.println("True");
			else System.out.println("false");
			
		
    return false;	
	}
	
public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter word: ");
	String word=sc.next();
	System.out.println("Enter anagram :");
	String anagram=sc.next();
	
	
	Anagram ang=new Anagram();
	ang.checkAnagram(word,anagram);
	
	
}

	
	
}