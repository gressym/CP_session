//To check the charactor whether it is vowel or consonant and check for invalid input.
import java.util.Scanner;
import java.io.*;
public class program
{
	public static void main(String[] args) {
	    
	    Scanner sc= new Scanner(System.in);
		System.out.println("Enter any character:");
		char ch=sc.next().charAt(0);
		if(ch>='a' && ch<='z')
		{
		    
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
		    System.out.println("Vowel");
		    
		}
		else 
		{
		    System.out.println("Consonant");
		    
		}
		}
		else if(ch>='A' && ch<='Z')
		{
		    if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
		    System.out.println("Vowel");
		    
		}
		else 
		{
		    System.out.println("Consonant");
		    
		}
		}
		else
		{
		    System.out.println("Invalid input.");
		}
	}
}
