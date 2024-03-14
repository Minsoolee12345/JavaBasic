package chap02;

import java.util.Scanner;
public class Ex03 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		final double PI = 31.4;
		
		System.out.print("원기둥의 밑면 반지름은? ");
		int n = in.nextInt();
		
		System.out.print("원기둥의 높이는? ");
		int m = in.nextInt();
		
		System.out.print("원기둥의 부피는 " + PI*n*m);
		
		
		in.close();
	}
}
