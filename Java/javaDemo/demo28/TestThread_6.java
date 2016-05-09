//线程的休眠

class A implements Runnable //Runnable没抛异常 run()方法也不能抛异常 不能throws Exception
{
	public void run() //throws Exception  接口没有抛出异常 error 必须try catch
	{
		for(int i=0;i<2;++i)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);

			
			try
			{
				
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
			
			//Thread.sleep(1000); //error 
			
		}
	}
}


public class TestThread_6
{
	public static void main(String[] args) 
	{
		A aa = new A();
		Thread tt = new Thread(aa);
		tt.start();
		

		
	}
	
}
