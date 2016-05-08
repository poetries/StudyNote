//printStackTrace可以把异常打印到屏幕上  一般用来调试程序

class A 
{
	int divide(int a,int b)
	{
		return a/b;
	}
	
	public void f()
	{
		g();
	}
	
	public void g()
	{
		divide(6,0);
	}
}



public class TestExcep_4
{
	public static void main(String[] args)
	{
		try
		{
			new A().f();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}



