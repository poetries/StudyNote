class A 
{
	public void f()
	{
		System.out.printf("AAAA\n");
	}
}

class B extends A  
{
	public void f()
	{
		System.out.printf("BBBB\n");
	}
}

class C  extends B 
{
	public void f()
	{
		System.out.printf("CCCC\n");
	}
}

class D  extends C
{
	public void f()
	{
		System.out.printf("DDDD\n");
	}
}

public class Testpoly_2
{
	public static void g(A aa)
	{
		aa.f();//类似C语言的：（*aa）.f()
	}
	public static void main(String[] args)
	{
		A aa = new A();
		B bb = new B();
		C cc = new C();
		D dd = new D();
		
		g(aa);
		g(bb);//把子类的地址发送给父类 相当于父类指向了子类 相当于aa = bb 
			//	不是说把bb指向的对象发送给aa所指向的对象，而是把bb的值发送给aa的空间
		g(cc);
		g(dd);
		
	}
}
