package oprtator;

public class Exemple02 
{
	public static void main(String arg[])
	{
		int x=10,y=10;
		
		System.out.print(x==10);
		System.out.println("x와 y는 같습니까?" + (x==y));
		System.out.println();
		
		System.out.println(x<10 && x<20);
		System.out.println(x<10 || x<20);
		System.out.println(!(x<10 && x<20));
	}
}
