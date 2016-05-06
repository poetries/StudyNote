/*
		同胞继承权限问题（重点）
		
		1、子类的所有方法内部double可以访问父类除私有 成员以外的所有成员，所谓子类的所有方法也包括子类的私有方法
		2、通过子类对象名可以访问：
								父类私有成员以外的所有成员
								子类本身的除私有成员属性和私有方法
		
		子类可以继承父类除私有成员以外的所有成员
		父类的私有成员不可以被子类继承，其他的成员都可以被子类继承
		
		子类访问父类成员的三种方式：
						1、在子类内部访问父类成员
						2、通过子类对象名访问父类成员
						3、通过子类的类名访问父类成员
	
*/

*/


/*
	本程序证明了：
	
		1、子类内部可以发访问父类非私有的成员 私有成员无法被子类方法访问
		2、通过子类对象名只能访问从父类继承过来的非私有成员
		3、总结：私有不能被继承 
				 私有物理上已经被继承过来，但是逻辑上程序不能被访问，因此继承要慎重，否则浪费内存空间
				 
*/

class A 
{
	public int i;
	protected int j;
	private int k;
	
	public void g()
	{
		
	}
	
	private void s()
	{
		
	}
	
	protected void b()
	{
		
	}
}

class B extends A 
{
	private void m()
	{
		i = 10;
		j = 20;
	//	k = 30;//error私有属性不能被继承
	
		g();
		b();
		//s();//error 私有的方法不能被继承
	}
	
	
	
		public void f()
	{
		i = 10;
		j = 20;
	//	k = 30;//error私有属性不能被继承
	
		g();
		b();
		//s();//error 私有的方法不能被继承
	}
	
	
}


class Test_extends_3 
{
	public static void main(String[] args)
	{
		B bb = new B();
		bb.i = 20;
		bb.j = 30;
		bb.f();
		bb.g();
		bb.s();//eror
		bb.k = 33;//error
	}
}
