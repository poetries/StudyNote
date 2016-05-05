class A
{
	/*
  
	  类的访问控制符有四种：
			  public
			  protect
			  default
			  private 
			在一个类内部 所有的成员可以相互访问，访问控制符是透明的；访问控制符是针对外部访问而言的
		外部访问包括两种方式：
			通过类名访问内服成员
			通过对象名访问内部成员
		public  可通过外部访问方式访问内部public成员
		private 不可以通过外部访问方式访问类内部public成员
		
		
		总结：private修饰符（重点）
			在一个类的内部，所有的成员可以相互访问 访问控制符是透明的
			在一个类的外部：通过 类对象名.私有成员名  的方式无法访问该对象中的私有成员 这样编译会出错
	*/
	
	private int i;
	public int j;
	protected int m;
	
	
	private void f()
	{
		i = 1;
		j = 2;
		m = 3;
		//g();
		//k();
		
	}
	protected void k()
	{
		
	}
	
	public void g()
	{
		i = 1;
		j = 2;
		m = 3;
		//f();
		k();
	}
	
}

class TestAccess
{
	public static void main(String[] args)
	{
		A aa = new A();
		//aa.i=10  //error是私有的
		//a.j = 20;//OK j是公有的public
		//aa.m = 30; //ok  因为m是保护型的
		
		//aa.f();//f()是私有的 不能访问  无论是私有的属性还是方法 类外部都不能访问
		aa.g(); //ok 
		
		
		
	}
}

