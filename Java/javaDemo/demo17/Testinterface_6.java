//实现接口类

//如果一个类值实现了一个接口的部分方法 则该类必须声明为抽象类

interface It1
{
	void f();
	void g();
}

abstract class A implements It1 //去掉了abstract就报错
{
	public void f()
	{
		System.out.printf("AAAA\n");
	}
}

public class Q 
{
	public static void main(String[] args)
	{
		System.out.printf("哈哈哈哈!\n");
	}
}
