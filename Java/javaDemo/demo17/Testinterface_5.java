//不可以new接口对象，但可以定义一个接口引用类型的变量并将其指向实现接口的对象，达到多态的目的
	
interface It
{
	void f();//默认public abstract final  一般不加
}

class A implements It //如果方法只是继承过来没有被重写 则需要在class前加上 abstract
{
	public void f() //实现抽象方法 重写要求权限不能低于被继承的权限 所以加上public
	{
		System.out.printf("AAAA\n");
	}
	public void g()
	{
		
	}
}
class D 
{
	
}

public class Testinterface_5
{
	public static void main(String[] args)
	{
		//int i;
		
		//接口引用类型的变量并将其指向实现接口的对象，达到多态的目的
		It it;//it是局部变量 java要求局部变量在使用时要初始化
		it = new A(); //it指向接口的实现类
		it.f();
		
		it.g();//error 因为：通过接口的引用只能调用子类从父类继承过来的成员；不能调用子类所特有的
		
		
		//It it2 = new It();//error 接口不能被new 因为是抽象的
		
	}
}
