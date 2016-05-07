class A 
{
	public void f()
	{
		System.out.printf("AAAA\n");
	}
}

class B extends A
{
	public void f()
	{
		System.out.printf("BBBB\n");
	}
	
	public void g()
	{
		System.out.printf("GGGG\n");
	}
}



public class Testpoly_3
{
	public static void main(String[] args)
	{
		A aa = new A();
		B bb = new B();
		
		aa = bb;//ok 把子类发送给父类，父类指向了子类
		//bb = aa; //error
		
		bb = (B)aa; //临时值 不影响aa 把实际指向子类的父类的引用强制转换子类的才能执行 有26行存在才正确 原因：父类指向了子类 此时aa是父类的数据类型把aa强制转换
		bb.f();
		
		
		//aa.g();//error 不能通过父类的引用调用子类特有的成员 只能调用从父类继承过来的成员和在子类中重写的方法
		aa.f();//ok  f是从父类继承过来的 这里受31行影响
	}
}

/*
	总结：
	
		1、子类对象可以直接赋给父类引用，但父类对象在任何情况下，都不可以直接赋给子类引用，因为：子类是父类的一种，但父类不是子类的一种
		    或者说：子类可以当做父类看，但父类不能当做子类看待
		
		2、通过父类引用只能访问子类对象从父类继承过来的成员
		
		3、通过父类引用不能访问子类对象所特有的成员
		
		4、父类引用永远不能直接赋给子类引用
		
			 1>只有在父类引用本身指向的就是一个子类对象时，才可以把父类引用强制转换为子类引用
			 2>其他情况下不允许把父类引用强制转化为子类引用，否运行出错

*/
