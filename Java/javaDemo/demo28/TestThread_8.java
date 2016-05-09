
//yield

public class TestThread_8
{
	public static void main(String[] args)
	{
		MyThread mt = new MyThread();
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		
		t1.setName("线程A");
		t2.setName("线程B");
		
		t1.start();
		t2.start();
	}
	
	
}

class MyThread implements Runnable
{
	public void run()
	{
		for(int i = 0;i<=100;++i)
		{
			System.out.println(Thread.currentThread().getName()+""+i);
			if(0 == i%10)
			{
				Thread.yield();
			}
		}
	}
}

/*

	线程的让步：
	
		1、让出CPU，给其他线程执行的机会
		
		2、让运行中的线程主动放弃当前获得的CPU处理机会，但不是使该线程阻塞，而是使之转入就绪状态
			public static void yield()

*/
