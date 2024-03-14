package chap02;

import java.util.Scanner;
public class Ex07 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		if(n%5==0 && n%4==0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		if(n%5==0 || n%4==0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		if(n%5!=0 || n%4!=0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		in.close();

	}

}
