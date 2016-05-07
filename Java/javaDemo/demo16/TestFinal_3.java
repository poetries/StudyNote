/*
	Final关键字：
	
	1、Final可以修饰：
	
				1、整个类
				2、类中的若干个属性
				3、类中的若干个方法

				1、Final修饰整个类：
				
							1、表示该类不能被继承
							2、如果认为一个类已经很完美且不要定义子类来继承它时，可以使用它
							3、格式：
									public final class A
									public 和final可以互换
									
								
				2、类中的若干个属性
				
							1、Final修饰类中的若干属性表示该属性必须被赋值并且只能被赋值一次 
							
							2、初始化方式有两种：（只能选择其中一种）
							
								1>在定义成员变量的同时初始化
								2>在类中所有的构造函数中初始化
							
							3、注意：一个类的所有普通方法都不可以修改Final修饰过的成员变量的值
							
				3、Final修饰类中的若干方法
							
							1、表示该方法可以被子类继承
*/


//Final修饰类中的若干方法:表示该方法可以被子类继承

class A 
{
	final public void f() //如果在前面加final就会报错 
	{
		System.out.printf("AAAA\n");
	}
}

class B extends A  //子类只是继承A 要重写的话就不能在父类A加加final
{
	
	// public void f()
	// {
		// System.out.printf(""BBBB\n");
	// }
}


class TestFinal_3
{
	public static void main(String[] args)
	{
		
	}
	
}
