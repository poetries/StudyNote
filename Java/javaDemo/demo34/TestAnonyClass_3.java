/*

	创建匿名类之继承父类：
	
	1、假设A是个类名
	
	2、格式：
			new A()
			{
				重写了A类的方法代码
				添加自己的方法或属性代码（不建议，没有实际意义）
				
			}
	
	3、功能：
		生成了一个A类的子类对象，该匿名类对象继承了A的所有非private成员
		
		
*/


class A
{
	public void f()
	{
		System.out.println("哈哈");
	}
}

public class TestAnonyClass_3
{
	public static void main(String[] args)
	{
		A aa = new A()
			{
				//重写了父类A的方法
				public void f()
				{
					System.out.println("嘿嘿");
				}
				
				//可以定义自己的方法，但没有任何实际意义
				public void g()
				{
					System.out.println("GGGG");
				}
			};
		
		aa.f();
		//aa.g();  //error
	}
}
/*
	在JDK 1.6中的运行结果是：
-----------------------------
FFFF
GGGG
-----------------------------
*/
