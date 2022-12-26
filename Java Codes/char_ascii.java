import java.io.*;
import java.util.*; 
class char_ascii
{
	public static void main(String args[])
	{
		int val;
		System.out.println("Enter the value: "); 
		Scanner sc=new Scanner(System.in); 
		val=sc.nextInt();
		char a; 
		a=(char)val;
		System.out.println("The result is: "+a);
	}
}