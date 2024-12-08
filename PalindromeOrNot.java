package practiseByMKT;

public class PalindromeOrNot {

	public static void main(String[] args) {
		
		String input = "malhar";
		String reverse = "";
		
		for(int i = input.length()-1; i>=0; i--)
		{
			char c1 =  input.charAt(i);
			reverse = reverse + c1;
		}
		
		System.out.println(reverse);
		
		if(input.equals(reverse))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
