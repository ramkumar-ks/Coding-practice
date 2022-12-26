import java.io.*; 
import java.util.*; 
class add_two_num
{
	public static void main(String args[])
	{
		int num1,num2,res; 
		System.out.println("Enter First no"); 
		Scanner sc=new Scanner(System.in); 
		num1=sc.nextInt(); 
		System.out.println("Enter Second no"); 
		num2=sc.nextInt();
		res=num1+num2; 
		System.out.println("The result is: "+res);
	}
}