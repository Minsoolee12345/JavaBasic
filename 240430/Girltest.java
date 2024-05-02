package chap06;

public class Girltest
{
	public static void main(String arg[])
	{
		Girl g1 = new Girl();
		Girl g2 = new GoodGirl();
		GoodGirl gg = new BestGirl();
		
		gg.show();
	}
}

class Girl 
{
	String name;
}

class GoodGirl extends Girl 
{
	public void show() 
	{
		System.out.println("그녀는 자바를 잘 안다.");
	}
}

class BestGirl extends GoodGirl 
{
	public void show() 
	{
		System.out.println("그녀는 자바를 무지하게 잘 안다.");
	}
}