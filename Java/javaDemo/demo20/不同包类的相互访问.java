
//A包

package zhangsan.lisi;

public class A //public 加上才对 只有共有的类才可以被另一个包访问
{
	public void f()
	{
		System.out.printf("AAAA");
	}
}

//B包  B包访问A包

package com.ruide;

//import zhangsan.lisi.*;  //导入包

import zhangsan.lisi.A; //导入A这个类 不用导入整个包

class B 
{
	public static void main(String[] args)
	{
		zhangsan.lisi.A aa = new zhangsan.lisi.A();
		aa.f();
	}
}

//单独编译时必须先编译A.java 在编译B.java 否则会出错
//编译方法：DOS下： javac -d . A.java  B.java  (-d .)--》在当前目录下生成包路径
//运行： java com.ruide.B

/*
  总结：

1、在同一个包中只有私有的不能被另一个类访问，也只有私有的不能被继承

2、在不同包没有任何关系的两个类，只有public类的public成员才可以被另一个包中的类访问

3、在不同包中有继承关系的两个类，只有public类的public成员和public类的protected成员可以被另一个包中的子类在内部使用，
但是子类在外部，通过子类对象名只能访问父类的public成员

*/
