package practiseByMKT;

public class String_Functions {

	public static void main(String[] args) 
	{
		String a = "I Love Myself";
		String b = "";
		
		int length = a.length();
		System.out.println("Length of a String is : " +length);
		
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
		for(int i = length-1; i>=0; i--)
		{
			b = b + a.charAt(i);
		}
		System.out.println("Reverse string is : " +b);
	}

}
