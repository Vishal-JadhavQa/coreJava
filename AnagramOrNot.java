 package practiseByMKT;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramOrNot {

	public static void main(String[] args) 
	{
		String a = "care";
		String b = "race";
		
		char c[] = a.toCharArray();
		char d[] = b.toCharArray();
		
		Arrays.sort(c);
		Arrays.sort(d);
		
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		
		boolean stringYesOrNo = Arrays.equals(c, d);
		if(stringYesOrNo == true)
		{
			System.out.println("Anagram String");
		}
		else
		{
			System.out.println("Not an Anagram String");
		}
		
	}
}
