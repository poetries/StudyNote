import java.io.*;

class A 
{
/* 	public void f() 
	{
		//处理IOException方式一
		try
		{
			throw new IOException();
		}
		catch(IOException e)
		{
			
		}
				
	}
*/
	
	//处理IOException方式二

	public void f() throws IOException //throw把throw抛出的异常交给IOException被调用者则处理
	{
		throw new IOException();//throw表示抛出异常
	}
	
	public void g()
	{
		throw new ArithmeticException();//算数异常 可处理可不处理
	}
	
	
}
public class TestExcep_5
{
	public static void main(String[] args)
	{
		A aa = new A();
		
		try
		{
			aa.f();
		}
		catch(Exception e)
		{
			
		}
	}
}



/*
	异常的分类：
	
	1、Error是系统错误，程序员无法处理这些异常
	
		Error:
			由java虚拟机生成并抛出，包括动态连接失败、虚拟机错误等，java程序无法对此错误处理
			
		
	
	2、Exception是程序员可以捕获并处理的异常
	
		Exception:
				一般程序中可预知的问题，其产生的异常可能会带来意想不到的结果，异常java编译器程序必须捕获或生命所有的非运行时的异常
	
	
	
	3、RuntimeException的子类异常 可以处理也可不处理的异常
	
		RuntimeException:
				java虚拟机在运行时生成的异常，如被0除等系统错误、数组下标越界等，其产生笔记频繁，处理麻烦，对程序可读性和运行效率影响太大；
				因此，有系统检测，用户可不做处理，系统将他们交给缺省的异常处理程序
				
	
	4、凡是继承自Exception但又不是RuntimeException子类的异常我们必须进行捕获
		
		
	异常处理的两种方式：(任选一个都可以)
		
		1、try{} catch(Exception e){}
		
		2、在方法的后面加上 throws-- （表示本方法不处理，让被调用则处理）(hrows不抛出异常，交由被调用则处理)---最后可抛给java虚拟机处理
		
			如：	public void f() throws IOException //throw把throw抛出的异常交给IOException被调用者则处理
					  {
					      	throw new IOException();//throw表示抛出异常
					  }
					
					
*/
