//自定义异常

import java.io.*;

class DivisorIsZeroException extends Exception//必须继承 Exception
{
	public DivisorIsZeroException(String name)
	{
		super(name);
	}
}

class A
{
	public int divide(int a,int b) throws DivisorIsZeroException
	{
		int m = 0;
		
		if(0 == b)
			throw new DivisorIsZeroException("除数不嗯给你为零");
		else
			m = a/b;
		
		return m;
	}
}

public class TestExcep_8
{
	public static void main(String[] aegs)
	{
		A aa = new A();
		
		try
		{
			aa.divide(6,2);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
