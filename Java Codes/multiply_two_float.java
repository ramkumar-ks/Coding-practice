import java.io.*; 
import java.util.*; 
class after
{
	public static void main(String args[])
	{
		float num1,num2,res; 
		System.out.println("Enter First no"); 
		Scanner sc=new Scanner(System.in); 
		num1=sc.nextFloat(); 
		System.out.println("Enter Second no"); 
		num2=sc.nextFloat(); 
		res=num1*num2;
		System.out.println("The result is: "+res);
	}
}