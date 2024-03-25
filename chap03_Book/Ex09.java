package chap03_Book;

public class Ex09 
{
	static void foo(String str,int a)
	{
		System.out.println(str+" "+a);
	}
	
	static void foo(String str,int a,int b)
	{
		System.out.println(str+" "+a+" "+b);
	}
	
	static void foo(String str)
	{
		System.out.println(str);
	}
	
	public static void main(String[] args) 
	{
		foo("안녕", 1);
		foo("안녕하세요", 1,2);
		foo("잘있어");
	}
}
