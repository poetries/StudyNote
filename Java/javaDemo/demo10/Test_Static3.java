//本程序证明了：一个类的属性可以是类对象
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
