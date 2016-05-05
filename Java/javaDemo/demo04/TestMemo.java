class A
{
  //private int i;
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
	*/
		  
	int i;
	int j;
}

class TestMemo
{
	public static void main(String[] args)
	{
		//aa是在栈里面分配的 是静态的  new A()是在堆里面分配的 是动态的  aa类名 A是类对象名 可以通过类名和类对象名访问
		
		A aa = new A();//(A*)malloc(sizeof(A));
		//new A() 在堆中动态分配一块区域
		//aa本身的内存是在栈中分配的
		//堆中内存的地址赋给aa
		//aa指向了堆中内存 aa代表了堆中内存
		//aa.i 代表：aa这个静态指针变量所指向的动态内存中的A对象的i员
		//aa.j 代表：aa这个静态指针变量所指向的动态内存中的A对象的j员
		
		aa.i = 10;
		aa.j = 20;
		
		System.out.printf("%d %d\n",aa.i,aa.j);
		
		//int i = 10;
	}
}

