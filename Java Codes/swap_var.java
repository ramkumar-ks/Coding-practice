import java.io.*; 
import java.util.*; 
class swap_var
{
	public static void main(String args[])
	{
		int num1,num2,temp; 
		System.out.println("Enter the first number: "); 
		Scanner sc=new Scanner(System.in); 
		num1=sc.nextInt();
		System.out.println("Enter the Second number: ");
		num2=sc.nextInt(); 
		System.out.println("Before Swap:"); 
		System.out.println(num1); 
		System.out.println(num2); 
		temp=num1;
		num1=num2; 
		num2=temp;
		System.out.println("After Swap:"); 
		System.out.println(num1); 
		System.out.println(num2);
	}
}