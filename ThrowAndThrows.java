package practiseByMKT;
public class ThrowAndThrows {

	public static void checkAge(int age) throws Exception
	{
		if(age < 18)
		{
			throw new Exception("Age must be 18 or older");
		}
			System.out.println("You are eligible to vote");
	}
	
	public static void main(String[] args) 
	{
		try
		{
			checkAge(20);
			checkAge(15);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
