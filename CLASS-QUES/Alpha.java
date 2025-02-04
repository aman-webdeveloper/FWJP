// package pack1;

import java.util.Scanner;

public class Alpha
{
	public static void main(String[] args) 
	{
//	step1-input character
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = sc.next().charAt(0);
//		next() inputs a string of characters  - yes
//		charAt(index) : it is a string class method, which is used to extract 
//		ith index value from the given string
		
//		the character is alphabet or not?
		// A-Z = 65 to 90 , a-z = 97 to 122
		boolean c1 = (ch>=65 && ch<=90) || (ch>=97 && ch<=122);
		boolean c2 = (ch>='A' && ch<='Z') || (ch>='a' && ch<='z');
		System.out.println("Result of c1 : "+c1);
		System.out.println("Result of c2 : "+c2);
		
		char ch1= (char)(c1==true?(ch>='A' && ch<='Z')==true?ch+32:ch:ch);
		System.out.println("ch1 : "+ch1);
		
		String result = c1==true
				?ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'?ch+" is a vowel":ch+" is not a vowel"
				:ch+" is not an alphabet so can't check it for vowel";
		System.out.println(result);
		
//		number range for 0 to 9 (48 to 57)
		boolean n1 = ch>='0' && ch<='9';
		String num = n1?ch+" is Numerical value":ch+" is not a numerical value";
		
		System.out.println(num);
		System.out.println(!c2 && !n1? ch+" is a special character": ch+" is not a special character;");
		
	}
}