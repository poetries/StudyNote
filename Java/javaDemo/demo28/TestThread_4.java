
class T1 implements Runnable //创建线程的第二种方式
{
	public void run()
	{
		for(int i = 0;i<100;i++)
			System.out.println("T1: "+i);
	}
}


class T2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<100;i++)
			System.out.printf("----T2: ",+i);
	}
}

public class TestThread_4
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new T1());
		Thread t2 = new Thread(new T2());
		
		//t1优先级设置成比t2高 先执行
		
		t1.setPriority(Thread.NORM_PRIORITY+3);//setPriority()设置线程的优先级数值 Thread.NORM_PRIORITY = 5 
		t1.start();
		t2.start();
		
		
		
	}
	
}




/*
	线程控制的基本方法：
	
			1、isAlive() 判断线程是否还活着(就绪、运行、阻塞) 即线程是否还未终止
			
			2、getPriority()获得线程的优先级数值
			
			3、setPriority()设置线程的优先级数值
			
			4、Thread.sleep() 将当前线程睡眠指定毫秒数
			
			5、join()调用某线程的该方法，将当前线程与该线程合并，即等待该线程结束，在恢复当前线程的运行
			
			6、yield()让出CPU，当前线程进入就绪等待调度
			
			7、wait() 当前线程进入对象的wait pool
			
			8、notify()/notifyAll() 唤醒wait pool 中的一个/所有等待线程
			
	
	线程的优先级：
	
			1、线程的优先级采用数字来表示，范围从1到10
			
			2、主线程的缺省优先级是5，子线程的优先级默认与其父线程的优先级相同
			
		
			3、java提供一个线程调度器来监控程序中启动进入就绪状态的所有线程，线程调度器按照线程的优先级决定英调度那个线程来执行
				
			   线程的优先级用数字来表示，范围从1-10 一个线程的缺省优先级是5
			   
					Thread.MIN_PRIORITY = 1 
					Thread.MAX_PRIORITY = 10
					Thread.NORM_PRIORITY = 5 
					
			4、使用下述线程方法获得或设置线程对象的优先级
					int getPriority()
					void setPriority(int new Priority)
					
					
			通常高优先级的线程将先于优先级低的线程执行，但并不总是在这样，因此实际开发中并不单纯依赖优先级来决定线程运行次序
*/
