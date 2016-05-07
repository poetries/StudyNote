
/*
	多态：一个父类的引用类型变量它既可以指向父类对象也可以指向子类对象，它可以根据当前时刻指向的不同，自动调用不同的对象方法，这就是多态
	
	多态的优点：同样一段代码做不同的事情

*/

class A
{
	public void f()
	{
		System.out.printf("AAAA\n");
	}
}

class B extends A   //重写方法的权限不能低于被重写方法的访问权限
{
	public  void f() //此处的public权限要比A处的访问权限高才可以重写  改成protected就不行
	{

		System.out.printf("BBBB\n");
	}
}


public class Testpoly
{
	public static void main(String[] args)
	{
		A aa = new A();
		B bb = new B();
		
		aa.f();
		bb.f();
		
		aa = bb;//把bb当aa看 就是把子类bb当做父类aa看待
		//bb = aa; //error 把父类当做子类看待 不可能
		
		aa.f();
	}
}
