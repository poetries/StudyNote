
//无论是继承Thread类的run方法还是实现Runnable接口的run方法，都不能抛出任何异常

//原因：重写方法抛出异常的范围不能大于被重写方法排除的异常

class Aimplements Runnable
{
	public void run() //throws Exception //注释不能去掉 否则编译出错
	{

	}
}

class B extends Thread
{
	public void run()//throws Exception //加上这个就报错
	{
		
	}
}
