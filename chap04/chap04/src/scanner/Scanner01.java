package scanner;

import java.util.Scanner;
public class Scanner01 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수 타입 숫자를 입력하세요 : ");
		int n = in.nextInt();
		System.out.print("정수 타입 숫자를 입력하세요 : ");
		double m = in.nextDouble();
		
		System.out.println(n  +" + " + m + " = " + (n+m));
		System.out.println(n  +" - " + m + " = " + (n-m));
		System.out.println(n  +" * " + m + " = " + (n*m));
		System.out.println(n  +" / " + m + " = " + (n/m));
		
		in.close();
	}
}
