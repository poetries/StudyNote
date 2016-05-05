

class Student
{
	public String  name;
	public  int age;
	
	public Student(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void showInformation()
	{
		System.out.printf("name = %s ,age = %d\n",this.name,this.age);
	}
		
}

public class testthis_1
{
	public static void main(String[] args)
	{
		Student aa = Student();
		
		
	}
}
