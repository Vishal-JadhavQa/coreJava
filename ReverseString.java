package practiseByMKT;

public class ReverseString {

	public static void main(String[] args) 
	{
		String a = "Vishal";
		String reverse = "";
		
		
		for(int i = 5; i>=0; i--)
		{
			char c1 = a.charAt(i);
			reverse = reverse + c1;
		}

		System.out.println(reverse);
	}

}
