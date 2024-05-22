package FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamExample
{
	public static void main(String[] args) throws IOException 
	{
		// 원본 파일과 복사본 파일 변수 선언
		String orgFilename = "D1_Student.txt";
		String copiedFilename = "D1_Student_copied.txt";
		
		try {
			// 원본 파일을 읽기 위한 파일리더
			FileReader fr = new FileReader(orgFilename);
			
			// 복사된 파일을 쓰기 위한 파일라이터
			FileWriter fw =new FileWriter(copiedFilename); 
			
			// 원본 파일에 복사된 파일로 문자 데이터를 복사
			copyCharData(fr, fw);
			//copyCharArrData(fr, fw);
			
			// 파일라이터를 비워 모든 데이터를 씀
			fw.flush();
			
			// 파일라이터 닫기
			fw.close();
			
			// 파일리더 닫기 
			fr.close();
			
			// 복사를 완료했다는 메세지 출력
			System.out.println(orgFilename + " 복사가 완료되었습니다.");
			
			// 예외처리
		} catch (FileNotFoundException e) {
			// 원본 파일을 찾을 수 없을때 메세지 출력
			System.out.println(e.getMessage());
		}

	}
	
	// 데이터를 복사하는 함수
	private static void copyCharArrData(FileReader fr, FileWriter fw) throws IOException 
	{
		// 100개의 문자를 저장할 수 있는 문자배열
		char[] charArrData = new char[100];
		
		// 파일의 끝에 도달할 때 까지 반복
		while (fr.read(charArrData) != -1)
		{
			// 읽은 데이터를 출력
			System.out.print(charArrData);
			
			//읽은 데이터를 파일에 씀
			fw.write(charArrData);
		}
		
	}
	
	// 문자를 하나씩 복사하는 함수
	private static void copyCharData(FileReader fr, FileWriter fw) throws IOException 
	{
		// 문자를 저장하는 변수 선언
		int charData;
		
		// 파일의 끝에 도달할 때 까지 반복
		while ((charData = fr.read()) != -1)
		{
			// 읽은 데이터를 출력
			System.out.print((char)charData);
			
			//읽은 데이터를 파일에 씀
			fw.write(charData);
		}
	}
}
