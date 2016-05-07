
final class A 
{
	//在定义成员变量的同时初始化
	
	final public int i; //= 10;//常变量 final 类似C语言的const 这个变量必须附一个值 
	
	//定义构造方法
	//在类中所有的构造函数中初始化
	//定义对象一定会调用构造方法
	
	public A()
	{
		i = 22;
	}
	
	public void f()
	{
		//i = 22; //error Final修饰类中的若干属性表示该属性必须被赋值并且只能被赋值一次
	}
}


class TestFinal_2
{
	public static void main(String[] args)
	{
		
	}
	
}
