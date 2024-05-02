package chap06;

class Person 
{
    String name;
    int age;

    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    void show() 
    {
        System.out.println("사람[이름 : " + name + ", 나이 : " + age + "]");
    }
}

class Student extends Person 
{
    int studentId;

    public Student(String name, int age, int studentId) 
    {
        super(name, age);
        this.studentId = studentId;
    }

    @Override
    void show() 
    {
        System.out.println("학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + studentId + "]");
    }
}

class ForeignStudent extends Student 
{
    String nationality;

    public ForeignStudent(String name, int age, int studentId, String nationality) 
    {
        super(name, age, studentId);
        this.nationality = nationality;
    }

    @Override
    void show()
    {
        System.out.println("외국학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + studentId + ", 국적 : " + nationality + "]");
    }
}

public class PersonTest 
{
    public static void main(String[] args) 
    {
        Person person = new Person("길동이", 22);
        person.show();

        Student student = new Student("황진이", 23, 100);
        student.show();

        ForeignStudent foreignStudent = new ForeignStudent("Amy", 30, 200, "U.S.A");
        foreignStudent.show();
    }
}