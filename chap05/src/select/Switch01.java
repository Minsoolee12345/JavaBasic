package select;

import java.util.Scanner;
public class Switch01 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 ");
		int n = in.nextInt();
		int r = n%2;
		
		switch(r)
		{
		case 0 :
			System.out.println("짝수입니다.");
			break;
		case 1 :
			System.out.println("홀수입니다.");
			break;
		default :
			System.out.println("알 수 없음.");
		}
		in.close();
	}
}
