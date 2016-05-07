//A.java文件

class A 
{
	public void f()
	{
		System.out.printf("AAAA");
	}
}

//B.java文件

class B
{
	public static void main(String[] args)
	{
		A aa = new A();
		aa.f();
	}
}

//执行命令 javac A.java B.java   java B 

//附注：因为类A和类B默认是在同一个无名的包中所以彼此可以互相访问
//只要是丰私有的成员都可以被同包的另一个类访问
