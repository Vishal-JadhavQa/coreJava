package practiseByMKT;

public class Non_Static_Methods {

	void mul()
	{
		System.out.println("Multiplication");
	}
	
	void mul(int a, double b)
	{
		double c = a*b;
		System.out.println(c);
	}
	
	void mul(double a , double b)
	{
		double c = a*b;
		System.out.println(c);
	}
	
	void mul(int a, int b)
	{
		double c = a*b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Non_Static_Methods m1 = new Non_Static_Methods();
		m1.mul();
		m1.mul(10, 10);
		m1.mul(10, 10.0);
		m1.mul(3.14, 12.12);
		

	}

}
