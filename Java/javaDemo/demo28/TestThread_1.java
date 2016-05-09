/* 	创建线程的方法：
	
	第一种：	
			1、创建一个集成Thread的类（假定A类），并重写Thread中的run方法
			
			2、构造一个A类对象，假设aa
			
			3、调用aa的start方法【start方法时从Thread集成过来的】
			
			
			
			
			
	注意问题：

		1、Thread中的start()方法的功能是创建一个新的进程，并调用该线程的run()方法，直接调用run()方法不会创建新的进程
		
		2、执行一个线程实际就是执行该线程run方法中的代码（这个重要）
		
		3、执行完aa.start()后并不表示aa对应的线程就一定会立即执行 aa.start()执行完后只是表示aa线程具有了可立即被CPU执行的资格
		   但由于想抢占CPU执行的线程很多，CPU并不一定会立即去执行aa所对应的线程
		   
		4、一个Thread对象且只能代表一个线程 一个Thread对象不能调用两次start()方法，否则会抛出java.lang.IIegalThreadStateException异常
		
		
			

 */

 //创建一个集成Thread的类
class A extends Thread //A 继承了Thread类中的run方法 并且重写了run
{
	public void run()//重写run()方法
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
		A aa = new A();//构造一个A类对象
		a.start();//调用aa的start方法，start方法会创建一个新的进程，并自动调用aa对象的run()方法
		
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
