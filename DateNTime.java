package practiseByMKT;

import java.util.Date;

public class DateNTime {

	public static void main(String[] args) 
	{
		Date d1 = new Date();
		String input =  d1.toString();
		System.out.println("Current date is : " +input);
		
		Date d2 = new Date(d1.getTime()+(1000*60*60*24*1));
		System.out.println("Future Date is : " +d2);
		
		Date d3 = new Date(d1.getTime()+(1000*60*60*24*(-1)));
		System.out.println("Past Date is : " +d3);
	}

}
