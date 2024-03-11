package sequence;

import java.util.Scanner;
public class Sequecne02 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요(원) : ");
		int n=in.nextInt();
		
		int a = n/500;
		int b = (n%500)/100;
		
		System.out.println(">> 500원 동전"+ a +"개와 100원 동전 "+ b +"개가 필요합니다.");
		
		in.close();
	}
}
