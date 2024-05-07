package chap07;

public class Concrete 
{

	private int i;
	private int j;
	
	public Concrete(int i, int j) 
	{
		this.i = i;
		this.j = j;
	}

	public void show() 
	{
		System.out.print("i = " + i + ", ");
		System.out.print("j = " + j);
	}
	
	

}
