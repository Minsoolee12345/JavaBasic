package scanner;

import java.util.Scanner;
public class Scanner02 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		final double PI = 3.14;
		
		System.out.println("원의 반지름을 입력하세요.(cm): ");
		int n=in.nextInt();
		
		System.out.println("원의 넓이는 "+ (PI*n*n) +"입니다.");
		
		in.close();
	}
}
