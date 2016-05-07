class A 
{
	int divide(int a,int b)
	{
		int m;
		m = a/b;
		return m;
	}
	
}

public class TestExcep
{
	public static void main(String[] args)
	{
		A aa = new A();
		
		//异常一种处理机制 可以用try{} catch来检测估计的那个代码会出异常
		//异常不是编译时的错误 是程序运行时捕捉到的错误
		// try
		// {
			// aa.divide(6,0);
		
		// }
		// catch(ArithmeticException e)//如果try中的代码出错
		// {
			// System.out.printf("程序出错了!!!\n");
		// }
		
		
		System.out.printf("今天很开心!!!");
			
	}
}
