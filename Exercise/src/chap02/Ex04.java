package chap02;

import java.util.Scanner;
public class Ex04 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("초 단위 정수를 입력하세요 : ");
		int n = in.nextInt();
		
		int h = n/3600;
		int m = n/60;
		int s = (n%600)%60;
		
		System.out.print(h + "시간 " + m + "분 " + s + "초");
		
		in.close();
	}
}
