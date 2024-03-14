package select;

import java.util.Scanner;
public class If04 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int n = in.nextInt();
		
		char grade;
		
		if(n>=90)
		{
			grade  = 'A';
		}
		else if(n>=80)
		{
			grade  = 'B';
		}
		else if(n>=70)
		{
			grade  = 'C';
		}
		else if(n>=60)
		{
			grade  = 'D';
		}
		else
		{
			grade  = 'F';
		}
		
		System.out.println("학점은 " + grade + "입니다.");
		in.close();
	}

}
