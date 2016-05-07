abstract class A 
{
	abstract public void f();
	
}

class B extends A  //把f重写了 所以子类class前不加abstract也可以
{
	public void f()
	{
		System.out.printf("BBBB\n");
	}
}

class TestAbstractPoly_2
{
	public static void main(String[] args)
	{
	//	A aa = new A(); //error
		
		B bb = new B();
		bb.f(); //ok
		
		A aa;//ok  可以定义一个抽象类的引用 但是不可以定一个抽象类的对象
		aa = bb;//把bb赋给aa父类  aa是抽象的 bb是具体实现的
		aa.f(); //利用了多态
	}
	
	
}

/*
	1、抽象类不能new对象 但是可通过父类的引用调用子类的具体方法

*/
