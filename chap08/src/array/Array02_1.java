package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array02_1 
{
	public static int getNumberKeyboard(String message) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(message);
		return Integer.parseInt(br.readLine());
	}
	
	
	public static int[] getScoresLine(int num) throws IOException
	{
		//점수 array 생성
		int[] myArr = new int[num];
		
		
		// 한 줄 읽어오기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inStr = br.readLine();
		
		// 쪼개서 정수로 변환해서 배열에 저장하기
		StringTokenizer st = new StringTokenizer(inStr," ");
		for(int i=0; i<num; i++)
		{
			myArr[i] = Integer.parseInt(st.nextToken());
		}
		
		return myArr;
	}
	
	public static void printSumAverage(int myArr[])
	{
		int sum=0;
		
		for(int i=0; i<myArr.length; i++)
		{
			sum+=myArr[i];
		}
		
		int av = sum/myArr.length;
		
		System.out.println(">> 합계: "+sum);
		System.out.println(">> 평균: "+sum/av);
	}
	
	public static void main(String arg[]) throws IOException
	{
		int numStudent = getNumberKeyboard("학생 수: ");
		int[] scores = getScoresLine(numStudent);
		printSumAverage(scores);
	}
}
