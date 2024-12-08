package practiseByMKT;

public class String_Functions_1 
{
	public static void main(String[] args) 
	{
		String a = "Welcome India";
		System.out.println("Index of 'C' is : " +a.indexOf('c'));
		
		String b = "Programming";
		System.out.println("Character at index 4 is : " +b.charAt(4));
		
		
		String str1 = "Hello";
		String str2 = " World";
		
		System.out.println("String concatenation : " +str1.concat(str2));
		
		String str3 = "Welcome to Java Programming";
		System.out.println("Substring A is : " +str3.substring(11));
		
		String str4 = "Programming is fun";
		System.out.println("Substring B is : "+str4.substring(0, 11));
		
	}
}
