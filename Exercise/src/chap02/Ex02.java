package chap02;

import java.util.Scanner;
public class Ex02 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int n = in.nextInt();
		
		System.out.println(n*n);
		
		in.close();
	}
}
