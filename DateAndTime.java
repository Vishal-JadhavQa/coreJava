package practiseByMKT;

import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) 
	{
		Date d1 = new Date();
		String input =  d1.toString();
		System.out.println(input);
		
		String day = input.substring(0, 3);
		System.out.println(day);
		
		String month = input.substring(4, 8);
		System.out.println(month);
		
		String date = input.substring(8, 10);
		System.out.println(date);
		
		System.out.println(day.concat(",").concat(month).concat("").concat(date));
		
	}

}
