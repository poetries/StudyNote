
//要抛出的异常 必须得是Throwable的子类

//去掉extends Throwable就会报错

class A extends Throwable
{
	
}
class M 
{
	public void f() throw A 
	{
		throw new A();//要抛出的异常必须是Throwable的子类
	}
}

public class TestExcep_7
{
	public static void main(String[] aegs)
	{
		
	}
}


/*

	throw:用来抛出异常
	
	1、格式：
			throw new 异常名(参数)
	
	2、假设f方法抛出了A异常，则f方法有两种方式来处理A异常
	
			1、throws A 
					谁调用了f方法，谁处理A异常，f方法本身不处理A异常
			
			2、try{...}catch(){...}
					f方法本身自己处理A异常
	
	3、要抛出的异常 必须得是Throwable的子类

	
*/
