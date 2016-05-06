//supper常见错误用法
//一个类里面一定有默认的构造方法 只要生成对象 一定会调用里面的方法

class A
{
	public int i;
	public A(int i)
	{
		this.i = i;
	}
}

class B extends A
{
	
	public int j;
	
	public B(int i,int j)
	{
		//super();//需要初始化父类的无参的构造函数
		super(i);
		this.j = j;
		
	}
	
	
	public void f(int i)
	{
		//super(i); error 普通方法中不能调用父类的构造方法
	}
}

public  class Test_super_3
{
	public static void main(String[] args)
	{
		
	}
}
