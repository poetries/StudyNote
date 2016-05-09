//常见线程方法介绍
class A extends Thread
{
	public void run()
	{
	//	System.out.println("AAAA\n");
		System.out.printf("%s线程在执行!\n",Thread.currentThread().getName());
		
	}
}

public class TestThread_3
{
	public static void main(String[] args)
	{
		A aa1 = new A();
		aa1.setName("张三");//修改线程的名字
		aa1.start();
		
		A aa2 = new A();
		aa2.start();
		
		A aa3 = new A();
		aa3.setName("李四");
		aa3.start();
		
		// 执行结果：
		
		// main线程在执行!
		// 李四线程在执行!
		// Thread-1线程在执行!
		// 张三线程在执行!
		
		//System.out.println("BBBB\n");
		System.out.printf("%s线程在执行!\n",Thread.currentThread().getName());
		//通过类名Thread的对象currentThread，调用getName()方法 
		
		
	}
}


/*
	Thread的常用方法：
	
	[final修饰一个类表示不能被重写]
	
	1、public final void setName(String  name) 设置当前线程的名字
	
	2、public static Thread currentThread()返回当前正在执行的线程对象的引用
	
	3、public final String getName() 返回当前线程的名字
	
	
	
**/
