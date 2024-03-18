package loop;

import java.util.Scanner;
public class DoWhile01 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int sum=0;
		int n;
		
		do
		{
			System.out.print("숫자를 입력하세요 : ");
			n=in.nextInt();
			sum+=n;
		}while(n!=0);
		
		System.out.println("지금까지 입력한 숫자의 합은 "+sum+"입니다.");
		
		in.close();
	}

}
