package chap07;

public class Student
{
	private int i;
	public Student(int i) 
	{
		this.i = i;
	}

	public void print() 
	{
		System.out.println(i+"세의 학생입니다.");
	}

	public void eat() 
	{
		System.out.println("도시락을 먹습니다.");
	}
}
