class A 
{
	int divide(int a,int b)
	{
		int m;
		m = a/b;
		//System.out.printf("哈哈哈哈\n");//第6行错 后面就不执行
		return m;
	}
	
}

public class TestExcep
{
	public static void main(String[] args)
	{
		A aa = new A();
		
		//aa.divide(6,0);
		
		//异常一种处理机制 可以用try{} catch来检测估计的那个代码会出异常
		//异常不是编译时的错误 是程序运行时捕捉到的错误
		//一个代码里面不能抛出两个异常  
		
		try
		{
			aa.divide(6,0);
		
		}
		//程序中所有出现的异常都是Exception的子类 不知道代码抛出什么异常就写Exception本身
		catch(Exception e)//e类似形参 e用来接收出错的信息 如果try中的代码出错
		{
			e.printStackTrace();//可以简单理解为输出该异常的具体信息
			System.out.printf("程序出错了!!!\n");
		}
		
		
		System.out.printf("今天很开心!!!");
			
	}
}
