package chap03_Book;

import java.util.*;
public class Ex01 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		if(n>=19)
		{
			System.out.println("성년");
		}
		else
		{
			System.out.println("미성년");
		}
		
		in.close();
	}
}
