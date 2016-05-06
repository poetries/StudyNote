//本程序让A这个类保证只造出一个对象

class A
{
	public int i = 20;
	A aa = new A();
	
	private  A()  //private 把new禁止 使之不能造出对象
	{
		
	}
	
}

public class Test_Static2
{
	public static void main(String[] args)
	{
		// A aa1 = new A();
		// A aa2 = new A();
	}
}
