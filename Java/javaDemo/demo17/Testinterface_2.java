
interface It 
{
	public static final int i = 20;
	public abstract void f();
}

//接口中定义的属性必须是public static final的，
//而接口中定义的方法必须是public abstract的，
//因此这些修饰可以部分或全部省略

interface It2
{
	int i = 20; //可以省略public static  因为接口默认的就是这个类型
	void f();
}

//一个类可以在继承父类的同时实现一个或多个接口
//但extend关键字必须在implement之前

//类继承接口 接口是抽象的 类也要加上abstract
//因为：接口中定义的方法必须是public abstract的
//f()方法被重写了 abstract就不需要了

class A implements It2 //类继承接口不能通过entends 要通过implements来实现
{
	public void f()
	{
		// i = 99; //error i是public static final类型的
		System.out.printf("i = %d\n",i);
	}
}


class Testinterface_1
{
	public static void main(String[] args)
	{
		A aa = new A();
		aa.f();
	}
	
}

