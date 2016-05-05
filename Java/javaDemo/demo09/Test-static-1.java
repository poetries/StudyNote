/*
	本程序证明了：
	static属性i是属于类本身
	或者说没有对象，我们依然可以直接通过类名的方式访问该类内部的static属性
	static 方法也是同理
*/
class A
{
	public static int i = 10;
	
	public  static void f()
	{
		System.out.printf("哈哈哈！！\n");
	}
}

class Teststatic1
{
	public static void main(String[] args)
	{
			System.out.printf("%d\n",A.i);
			A.f();
		System.out.printf("%d\n",A.i);
		
		
	}
}
