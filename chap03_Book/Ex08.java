package chap03_Book;

public class Ex08 
{
	static int factorial(int n)
	{
		int fac=1;
		for(int i=1; i<=n; i++)
		{
			fac*=i;
		}
		return fac;
	}
	
	public static void main(String[] args) 
	{	
		System.out.println(factorial(5));
	}
}
