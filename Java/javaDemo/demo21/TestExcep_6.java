
class A 
{
	int divide(int a,int b)
	{
		int m = 0;
		
		m = a/b;
		
		return m;
	}
}

public class TestExcep_6
{
	public static void main(String[] aegs)
	{
		try
		{
			new A().divide(6,0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.printf("哈哈哈哈 !\n");
		}
	}
}





/*
	异常的处理步骤：
	
		try
		{
			语句1;
			语句2;
		}
		catch(ExceptionName1 e)
		{
			当产生ExceptionName1异常时的处理措施
		}
		
		catch(ExceptionName2 e)//一旦语句一抛出异常，则语句2永远得不到执行
		{
			当产生ExceptionName2异常时的处理措施
		}
		...
		
		finally
		{
			无论是否捕捉到异常都必须处理的代码
		}
		
		
		finally的作用：
		
			1、	无论try所指定的程序块中是否抛出异常，也无论catch语句的异常类型是否与所抛出的异常类型一致，finally中的代码一定被执行
			
			2、finally语句为异常处理提供一个统一的出口，使得在控制流程转到程序的其他部分以前，能够对程序的状态做统一的管理
			
			3、通常在finally语句中可以进行资源的清除工作，如：关闭打开的额文件，清除临时文件
		
		
		

*/
