
//不同包的继承关系

//A.java文件

package zhangsan.lisi;

public class A 
{
	public void g()//公有的
	{
		System.out.printf("GGGG\n");
	}
	protected void b()//保护型的
	{
		System.out.printf("BBBB\n");
	}
}

//B.java文件

package com.ruide;
import zhangsan.lisi.*;


class B extends A //B 类继承A类
{
	public void f()
	{
		g();//ok
		b();//在子类内部可以访问从另一个包继承过来的父类的publi和protec成员
	}
}

class M 
{
	public static void main(String[] args)
	{
		B bb = new B();
		
		//bb.f();//ok
		
		
		//在子类的外部只能访问继承过来的公有的 不能访问保护的
		
		//bb.g(); ok 可以通过子类对象名访问从另一个包继承过来的公有的成员
		
		//bb.b();//error  因为b()是protected 
	}
}


/*
	不同访问修饰符：（重点）
	
	1、在同一个包中只有私有的不能被另一个类访问，也只有私有的不能被继承
	
	2、在不同包没有任何关系的两个类，只有public类的public成员才可以被另一个包中的类访问
	
	3、在不同包中有继承关系的两个类，只有public类的public成员和public类的protected成员可以被另一个包中的子类在内部使用，
	   但是子类在外部，通过子类对象名只能访问父类的public成员
	
	
	
	包的发布：
	
		1、不能给源文件：
		2、新建一个空的文件夹放com zhangsan 这两个文件夹 --终端输入命令：jar cvf  T.jar(假设名字是T) *（*表示当前目录下所有文件）--应该进入要打包的那个空的文件在打包
			
	
	
		//假设从网上下载的包导入演示：

		//要把jar包的当前的目录包的名字设置set classpath=路径 （临时的） 设置到环境变量里面
		import zhangsan.lisi.A;

		public class test
		{
			public static void main(String[] args)
			{
				A aa = new A();
				aa.g();
			}
		}



*/
