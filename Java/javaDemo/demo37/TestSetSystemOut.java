//标准输入输出的重定向

import java.io.*;

public class TestSetSystemOut
{
	public static void main(String[] args)
	{
		PrintStream ps_out = null;
				
		try
		{
			ps_out = new PrintStream(new FileOutputStream("f:/ww.txt"));
			System.setOut(ps_out); //将System.out的值重新设置为ps_out,即System.out不在关联到显示器，而是关联到"d:/share/ww.txt"文件
			System.out.println(12); //这实际上是把12输出到了System.out所关联的f:/ww.txt中
			System.out.println(55.5);  //同上
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				ps_out.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}
}
	
/*

	PrintWriter:
	
	PrintWrite提供了PrintStream的所有打印方法，其他方法也从不抛出IOException
	
	与PrintStream的区别：
	
		作为处理流使用时，PrintStream只能封装OutputStream类型的字节流，而PrintWrite既可以封装OutputStream,还能封装write
		
		PrintWriter 中的println()方法具有更好的跨平台性
		
		

*/
