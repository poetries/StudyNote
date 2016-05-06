/*
继承：

1、一个类从已有的类那里获得其的属性和方法，这种现象叫类的继承
2、这种新类称为子类，也叫 派生类，已有的那个类叫父类，或者基类
3、继承的好处：
			代码得到了极大的重用
			形成一种层次体系结构，为多态创建条件

4、继承实现方式：

				class SubClass extends SuperClass
				{
					
				}
	
*/


class Human
{
	public String  name = "张三";
	public int age = 22;
}

class student extends Human
{

	public double score = 88.9;
}

class Graduate extends student
{
	
	public String daoshi = "周杰伦";
}

public class Test_extends_2
{
	public static void main(String[] args)
	{
		Graduate gd = new Graduate();
		System.out.printf("%s %f %s\n",gd.name,gd.score,gd.daoshi);
	}
}
