//重写父类方法

/*
	方法重写：
			1、指在子类中重新定义父类中已有的方法
			2、重写方法必须和被重写方法具有相同的方法名称、参数列表和返回值类型
			3、子类中不允许出现与父类同名同参但不同返回类型的方法
			4、覆盖方法时，不能使用比父类中覆盖的方法更严格的访问权限
*/

class A
{
	protected void f()
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

public class TestOver_2
{
	public static void main(String[] args)
	{

	}
}
