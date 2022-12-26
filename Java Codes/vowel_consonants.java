import java.io.*; 
import java.util.*; 
class vowel_consonants
{
	public static void main(String args[])
	{
		String chr;
		System.out.println("Enter the Character: "); 
		Scanner sc=new Scanner(System.in); 
		chr=sc.nextLine();
		String a=chr.toLowerCase(); 
		switch(a){
		case "a":
		case "e":
		case "i":
		case "o":
		case "u": 
		System.out.println("Vowel"); 
		break;
		default: 
		System.out.println("Consonant"); 
		break;
		}
	}
}