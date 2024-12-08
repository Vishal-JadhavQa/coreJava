package practiseByMKT;

class one
	{
		static void add()
	{
		System.out.println("Class One");
	}	
}

class two extends one
	{
		static void sub()
	{
			System.out.println("Class Two extends One");
	}
		void mod()
		{
			System.out.println("Non-static method 2");
		}		
}

public class Multi_Level extends two {

	void div()
	{
		System.out.println("Non-static method 1");
	}
	
		static void mul()
		{
			System.out.println("Class Multi-level extends Two");
		}
	
	public static void main(String[] args) 
	{
	
		add();
		sub();
		mul();
		
		Multi_Level ml = new Multi_Level();
		ml.div();
		ml.mod();		
	}
}
