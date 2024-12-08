package practiseByMKT;

public class Method_overloading {

	static void add()
	{
		System.out.println("Addition");
	}
	
	void add(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	
	static void add(int a, double b)
	{
		double c = a+b;
		System.out.println(c);
	}
	
	void add(double a, double b)
	{
		double c = a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		add();
		add(10, 10.0);
		
		Method_overloading m1 = new Method_overloading();
		m1.add(10, 10);
		m1.add(10.0, 20.0);
	}

}
