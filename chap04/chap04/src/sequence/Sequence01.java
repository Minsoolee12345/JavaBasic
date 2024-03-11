package sequence;

import java.util.Scanner;
public class Sequence01 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int t=0;
		
		System.out.print("변수 a에 넣을 숫자 입력 : ");
		int n = in.nextInt();
		
		System.out.print("변수 a에 넣을 숫자 입력 : ");
		int m = in.nextInt();
		
		t=n;
		n=m;
		m=t;
		
		
		System.out.println("Swapping 결과 > ");
		
		
		System.out.println("변수 a의 값 = " + m);
		System.out.println("변수 a의 값 = " + n);
		
		in.close();
		
	}
}
