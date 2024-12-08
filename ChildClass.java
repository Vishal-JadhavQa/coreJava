package practiseByMKT;

class ParentClass
{
	static void add()
	{
		System.out.println("Parent class 1");
	}
	
	static void sub()
	{
		System.out.println("Parent class 2");
	}
	
}

public class ChildClass extends ParentClass
{
	
	static void mul()
	{
		System.out.println("Child class 1");
	}
	
	static void div()
	{
		System.out.println("Child class 2");
	}

	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
		
	}

}
