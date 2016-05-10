/*

	本程序证明了：
		内部类的所有方法都可以访问外部类的所有成员，
		无论何种访问控制符，都可以，因为内部类被当作了外部类的一个成员
*/

class A
{
	private int j = 10;
	
	private void f()
	{
		System.out.println("FFFF");
	}

	class B
	{
		private int k;
		
		//内部类的所有方法都可以访问外部类的所有成员，无论何种访问控制符，都可以，因为内部类被当作了外部类的一个成员
		private void g()
		{
			System.out.println("j = " + j);  //内部类的私有方法可以访问外部类的私有属性
			f();  //内部类的私有方法可以访问外部类的私有方法
		}
	}

	public void m()
	{
		B bb = new B();
		bb.g();
	}
}


public class TestInnerClass_1
{
	public static void main(String[] args)
	{
		A aa = new A();	
		aa.m();
	}
}
/*
	在JDK 1.6中的运行结果是：
----------
j = 10
FFFF
----------
*/





/*

	内部类：
	
		内部类的定义：
			在A类的内部但是所有的外部定义了一个B类，则B类就是内部类，A是B的外部类
			
			
		内部类访问原则：
			内部类的方法可以访问外部类的所有成员
			外部类的方法不可以直接访问内部类的成员
			
		内部类的优点：
			可以让一个类方便访问另一个类中的所有成员
			增加程序的安全性，有效避免了其他不相关类对该类的访问
			
		何时使用内部类：
			如果一个A类要使用B类的所有成员，并且A类不需要被除B类以外的其他类访问
			我们可以应该吧A类定义成B类的内部类
			
			
			
*/
