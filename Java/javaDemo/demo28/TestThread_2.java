

/*

	创建线程的方法：
	
	第二种：

		1、定义一个实现Runnable接口的类，假定为A
		
		2、创建A类对象aa 代码如下：A aa = new A()
		
		3、利用aa构造一个Thread对象tt
							Thread tt = new Thread(aa)
							
		4、调用tt中的start方法：tt.start()
		
		


*/


class A implements Runnable //实定义一个实现Runnable接口的类
{
	public void run()//重写run()方法
	{
		while(true)
		{
			System.out.println("AAAA\n"); 
		}
	}
}


class B
{
	
}

public class TestThread_2
{
	public static void main(String[] args)
	{
		A aa = new A();
		//aa.start();//error
		
		Thread t = new Thread(aa);
		t.start();
		
		//B bb = B new B();//error
		//Thread tt = Thread(bb);//error
	}
}
