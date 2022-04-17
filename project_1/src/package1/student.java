package package1;

public class student 
{
	int age;
	int rollno;
	
	public void display()
	{
		System.out.println("welcome to all of you");
	}
	public void display1()
	{
		System.out.println("automation is very easy");
	}
	public static void main(String[] args) 
	{
		student udit=new student();
		System.out.print("udit age is ");
		udit.age=21;
		System.out.println(udit.age);
		System.out.print("udit rollno is ");
		udit.rollno=32;
		System.out.println(udit.rollno);
		udit.display();
		udit.display1();
	}
}
