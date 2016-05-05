/*
	本程序证明了：
				静态方法不能访问非静态成员
				非静态方法可以访问静态成员
				
*/

class A 
{
	private static int i = 10;
	public int j = 99;
	
	public static  void f()
	{
		//g();//error 静态方法不能访问非静态成员 不一定得有对象 有非静态方法 静态方法一定有
		j = 22;//error 因为j是非静态的  而方法是静态的
		System.out.printf("FFF\n");
	}
	public void g()
	{
	//	f();  ok  说明非静态static方法 可以访问static静态成员
		System.out.printf("GGG\n");
		System.out.printf("%d\n",i);
	}
}

class  Teststastic4
{
	public static void  main(String[] args)
	{
		A aa = new A();
		aa.g();
	}
}
