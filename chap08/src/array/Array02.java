package array;


//import java.util.Scanner;
//public class Array02 
//{
//	public static void main(String[] args) 
//	{
//		Scanner in = new Scanner(System.in);
//		
//		int n = in.nextInt();
//		
//		int ar[] = new int[n];
//		
//		int sum=0;
//		
//		
//		for(int i=0; i<ar.length; i++)
//		{
//			ar[i]=in.nextInt();
//			sum+=ar[i];
//		}
//		
//		System.out.println(sum);
//		System.out.println(sum/ar.length);
//		
//		
//		in.close();
//	}
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array02
{
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("학생 수: ");
		int numStudent = Integer.parseInt(br.readLine());
		
		System.out.print(numStudent + "명의 성적 : ");
		String inStr =br.readLine();
		
		StringTokenizer st = new StringTokenizer(inStr," ");
		
		int[] scores = new int[numStudent];
		
		for(int i=0; i<numStudent; i++)
		{
			scores[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum=0;
		
		for(int i=0; i<scores.length; i++)
		{
			sum+=scores[i];
		}
		
		int av = sum/scores.length;
		
		System.out.println("합계: "+sum);
		System.out.println("평균: "+av);
		
	}
}