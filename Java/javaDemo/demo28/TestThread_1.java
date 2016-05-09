class A extends Thread //A 继承了Thread类中的run方法 并且重写了run
{
	public void run()//必须是run
	{
		while(true)
		{
			System.out.println("AAAA\n"); //这是一个线程
		}
	}
}

public class TestThread_1
{
	public static void main(String[] args)
	{
		A aa = new A();
		a.start();//会开辟两个线程 自动aa对象里面的run方法 star语句--开启一个线程
		
		while(true)
		{
			System.out.print("BBBB\n");//这是一个线程
		}
	}
}

/*
	线程的定义：
	
	1、线程是程序中的不同的执行路径
	
	2、以前编写的程序，每个程序都有一个入口、一个出口以及一个顺序执行的序列，在程序执行过程中的任何指定时刻，都只有一个单独的执行点
	
	3、事实上，在单个程序内部是可以在同一时刻进行多种运算的，这就是所谓的多线程
	
	4、程序、进程、线程的异同参见操作系统，这些并不影响我们队java的学习
	
	

	多线程优势：
	
	1、多线程编程简单，效率高（能直接共享数据和资源）
	
	2、适合开发服务（如web服务，聊天服务）
	
	
*/
