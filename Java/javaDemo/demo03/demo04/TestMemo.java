class A
{
	int i;
	int j;
}

class TestMemo
{
	public static void main(String[] args)
	{
		//aa是在栈里面分配的 是静态的  new A()是在堆里面分配的 是动态的
		
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
		
	}
}
