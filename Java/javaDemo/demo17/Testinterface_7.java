//一个类要实现某接口中方法时，必须在方法返回值前加public

interface It1
{
	void f();

}

class A implements It1 //去掉了abstract就报错
{
	public void f() //public不能省 也不能改为其他修饰符
	{
		System.out.printf("AAAA\n");
	}
}

public class Q 
{
	public static void main(String[] args)
	{
		//It it = new It();//error
		
		It it = new A();
		it.f();
	}
}
