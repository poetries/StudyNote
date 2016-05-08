//throws

import java.io.*;

class A
{
	public void f() throws ArithmeticException
	{
		throw new ArithmeticException();//throws抛出异常
	}
}

public class TestExcep_9
{
	public static void main(String[] aegs)
	{
		A aa = new A();
		
		try
		{
			
		aa.f();
		}
		catch(ArithmeticException e)
		{
			System.out.printf("哈哈哈哈");
		}
	}
}


/*
	总结：
	
	1、void f() throws A 
		{
			'''
			'''
		}
	2、throws A表示调用f方法时f方法可能会抛出A类异常，建议调用f方法时最好对f方法可能抛出的A类异常进行捕获
	
	3、throw A不表示f方法一定会抛出A类异常；throw Af方法也可以不抛出A类异常
	
	4、throw A 不表示调用f方法时，必须对A异常进行捕获
		假设：A是RuntimeExption的子类异常
			  由于RuntimeExption的子类异常可以处理也可以不处理，所编译器允许你调用f方法时，对f方法抛出的RuntimeExption子类异常不进行处理
			  
	
	5、强烈建议：
	
			1、对throes抛出的所有异常进行处理
			
			2、如果一个方法已经对A异常进行了处理，则不要在throws A 
			
			
			
*/
