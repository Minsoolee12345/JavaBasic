package chap03_Book;

import java.util.Scanner;
public class Ex02 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		
		switch(str)
		{
		case "A":
			System.out.println("아주 잘했습니다.");
			break;
		case "B":
		case "C":
			System.out.println("잘했습니다");
			break;
		case "D":
		case "F":
			System.out.println("보통입니다");
		default :
			System.out.println("노력해야겠습니다");
		}
		
		in.close();
	}
}
