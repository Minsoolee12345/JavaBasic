package FileIO;

import java.io.File;
import java.io.IOException;

public class FileInfoExample
{
	public static void main(String[] args) throws IOException 
	{
		// 디렉터리를 가리키는 File 객체 생성
		File imgDir = new File("C:/Temp/images");
		
		// 파일을 가리키는 File 객체 생성
		File testFile = new File("C:/Temp/test.txt");
		
		// 만약 imgDir 디렉터리가 없다면
		if(imgDir.exists() == false) 
		{ 
			// 디렉터리 생성
			imgDir.mkdirs();
			
			// 디렉터리 생성 확인 메세지 출력
			System.out.println(imgDir.getName() + "을 생성합니다.");
		}
		
		// 만약 testFile 파일이 없다면
		if(testFile.exists() == false) 
		{
			// 파일 생성
			testFile.createNewFile();
			
			// 생성 확인 출력 메세지
			System.out.println(testFile.getName() + "을 생성합니다.");
		}
		
		// 디렉터리를 가리키는 File 객체 생성
		File tempDir = new File("C:/Temp");
		
		// listFiles()는 디렉러티와 파일을 객체 배열로 반환함
		File[] contents = tempDir.listFiles();
		
		// 파일 내용을 출력하는 메세지
		System.out.println(tempDir.getName() + "의 내용을 출력합니다.");
		
		// contents 배열에 있는 파일을 순회함
		for(File file : contents) 
		{
			// 파일 또는 디렉터리 이름 출력
			System.out.print("\t" + file.getName());
			
			// 만약 파일 객체가 디렉터리라면
			if (file.isDirectory()) 
			{
				// 메세지 출력
				System.out.print("<DIR>");
			}
			
			// 디렉터리가 아니라면
			else 
			{
				// 파일의 길이 출력
				System.out.print("<"+file.length() + ">");
			}
			
			// 줄 바꾸기
			System.out.println();
		}
	}
}