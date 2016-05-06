//重写父类方法

class A
{
	public void f()
	{
		System.out.printf("AAAA\n");
	}
}
class B extends A
{
	public void f() //重写继承过来的父类方法
	{
		super.f();//super调用从父类继承过来的f方法
		System.out.printf("BBBB\n");
	}
}

public class TestOver_1
{
	public static void main(String[] args)
	{
		B bb = new B();
		bb.f();
	}
}
