package chap02;

import java.util.Scanner;
public class Ex06 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int d = in.nextInt();
		
		double b = (double)5/9*(d-32);
		
		
		System.out.printf("%.5f",b);
		
		in.close();
	}

}
