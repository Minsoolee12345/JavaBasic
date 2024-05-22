package FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample 
{
	public static void main(String[] args) throws IOException 
	{
		// 원본 파일과 복사본 파일 변수 선언
		String orgFilename = "Curi_01.jpg";
		String copiedFilename = "Curi_01_copied.jpg";
		try {
			// 원본 파일을 읽기 위해 파일? 인풋스트림 생성
			FileInputStream fis = new FileInputStream(orgFilename);
			
			// 복사본 파일을 쓰기 위한 파일? 아웃풋스트림 생성
			FileOutputStream fos = new FileOutputStream(copiedFilename);
			
			// 파일을 한 바이트식 복사하는 메서드 호출
			copyEachOneByte(fis, fos);
			//copyEachKByte(fis, fos);
			
			// 스트림을 비워서 모든 데이터를 출력
			fos.flush();
			
			// 아웃풋스트림 닫기
			fos.close();
			
			// 인풋스트림 닫기
			fis.close();
			
			// 복사가 완료됐다고 메세지 출력
			System.out.println("복사가 완료되었습니다.");
			
			// 예외처리
		} catch (FileNotFoundException e) {
			// 파일을 찾지 못했을 때 오류 메세지 출력
			System.out.println(e.getMessage());
		}	
	}
	
	private static void copyEachOneByte(FileInputStream fis, FileOutputStream fos) throws IOException 
	{
		// 한 바이트의 ㄷ데이터를 저장하는 변수
		int byteInput;
		
		// 파일의 끝에 도달할 때 까지 반복
		while ((byteInput = fis.read()) != -1) 
		{
			// 인풋스트림에서 한 바이트씩 읽어서 아웃풋에 씀
			fos.write(byteInput);
		}
	}
	
	private static void copyEachKByte(FileInputStream fis, FileOutputStream fos) throws IOException 
	{
		// 데이터를 저장할 바이트 배열 선언
		byte kbInput[] = new byte[1024];
		
		while (fis.read(kbInput) != -1) 
		{
			//인풋스트림에서 바이트를 읽어 아웃풋스트림에 씀 
			fos.write(kbInput);
		}
	}
}
