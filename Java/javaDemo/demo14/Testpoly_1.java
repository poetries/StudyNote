//多态：同样一段代码做不同的事情

class A
{
	public void f()
	{
		System.out.printf("AAAA\n");
	}
}
class B extends A
{
	public  void f() 
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
