/*
	创建匿名类的三种方式：
	
	继承父类
	
	实现接口
	
	实现抽象类



*/

//创建匿名类之实现接口

/*
	假设A是接口名
	
	格式：
		new A()
		{
			实现接口中方法的代码
		}
		
	功能：生成一个实现A类接口的匿名类对象
	

*/


interface It
{
	void f();
	//void g();  //  如果该语句生效的话，21行到27行的代码中就必须的实现g方法
}

public class TestAnonyClass_1
{
	public static void main(String[] args)
	{
		It it = new It()
			{  //21行
				public void f()
				{
					System.out.println("哈哈");
				}
			};  //27行	
		
		//error	
//		It it = new It1()
//			(  //是{ 不是(
//				public void f()
//				{
//					System.out.println("哈哈");
//				}
//			);  // 是} 不是)				
		
		//error
//		It it = new It()
//			(
//				{	
//					public void f()
//					{
//						System.out.println("哈哈");
//					}
//				}
//			;
		
		it.f();		
	}
}
