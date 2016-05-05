
/*
	只有非private的static成员才可以通过类名的方式访问
	static只是表明了该成员具有了可以通过类名访问的潜在特征，
	但是是否可以通过类名访问，还必须满足一个条件：该成员必须是非private

*/
class A
{
	public static int i = 10;
	
	private  static void f()
	{
		System.out.printf("哈哈哈！！\n");
	}
}

class Teststatic3
{
	public static void main(String[] args)
	{
		//A.f();//error
		A.i = 22;

	}
}
