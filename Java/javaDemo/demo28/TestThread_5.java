//线程的休眠

class A implements Runnable
{
	public void run()
	{
		for(int i=0;i<2;++i)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			//System.out.println("嘿嘿嘿!\n");
			
			try
			{
				//1000毫秒
				Thread.sleep(1000);//这里Thread.sleep(1000)会抛出异常 必须进行捕获
			}
			catch(Exception e)
			{
				
			}
		}
	}
}


public class TestThread_5
{
	public static void main(String[] args)
	{
		A aa = new A();
		Thread tt = new Thread(aa);
		tt.start();
		
		//当执行一次tt.start后 反复执行下面的语句
		while(true)
		{
			System.out.println("哈哈哈!\n");
		}
		
		
	}
	
}

/*

	线程的休眠：
	
		1、线程休眠——暂停执行当前运行中的线程，使之进入阻塞状态，待经过指定的“延迟时间”后再醒来并进入就绪状态
		
		2、Thread类提供相关方法
			public static void sleep(long millis)
			public static voud sleep(long millis,int nanos)
		
		3、由于是静态，可以由Thread直接调用
		
		4、sleep()方法会抛出InterruptException异常，我们必须对其进行捕获
		
		

*/
