//本程序证明了：一个类的属性可以是类对象

/*
	总结：
	
	1、静态成员属于类本身，而不是属于对象，被类的所有对象所共有
	2、即便不创建对象，也可以使用类本身的静态成员
	3、静态成员分为：
				静态数据成员
				静态方法成员
				
	4、使用静态成员的两种方法：
						类名.静态成员名
						类对象名.静态成员名
*/
class A
{
	public void f()
	{
		System.out.printf("哈哈哈!\n");
	}
}

class B
{
	public int i = 10;
	public A aa = new A();//aa是一个对象，aa是否也是B的属性？是
	
	public void g()
	{
		aa.f();
	}
	
}

public class Test_Static3
{
	public static void main(String[] args)
	{
		B bb = new B();
		bb.g();
	}
}
