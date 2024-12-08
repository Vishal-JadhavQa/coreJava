package practiseByMKT;

import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Name");
		String name = sc.next();
		
		System.out.println("ID");
		int id = sc.nextInt();
		
		System.out.println("College Name");
		String college = sc.next();
		
		System.out.println("Branch Name");
		String br_name = sc.next();
		
		System.out.println("Contact Number");
		float num = sc.nextFloat();
	}

}
