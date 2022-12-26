import java.io.*;
import java.util.*; 
class quotient_remainder
{
	public static void main(String args[])
	{
		int num1,num2,quo,rem; 
		System.out.println("Enter the first number: "); 
		Scanner sc=new Scanner(System.in); 
		num1=sc.nextInt();
		System.out.println("Enter the Second number: "); 
		num2=sc.nextInt();
		quo=num1/num2; 
		rem=num1%num2;
		System.out.println("Quotient is: "+quo+"\n"+"Remainder is: "+rem);
	}
}