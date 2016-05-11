
/*
	DataOutputStream 中的 writeXXX(data)方法
		与
	PrintStream 中的 println(data)的区别
	
	总结:
		DataOutputStream 中的 writeXXX(data)方法是把data在内存中的二进制数据写入文件
		PrintStream 中的 println(data)写出的是该数据的格式化后的字符串		
*/

import java.io.*;

public class TestPrintStream_1
{
	public static void main(String[] args) throws Exception 
	{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("f:/kk.txt"));
		//实际是把数据写入dos所依附的FileOutputStream这个匿名流所关联的目录下
		dos.writeLong(12345);  //实际写入文件的是00 00 00 00 00 00 30 39
		dos.close();
		System.out.printf("%#X\n", 12345);
		
		PrintStream ps = new PrintStream(new FileOutputStream("f:/kk2.txt"), true);
		ps.println(12345);  //实际写入文件的是'1' '2' '3' '4' '5'
		ps.close();
	}
}




/*
	Print流：
	
	Print流只有输出，没有输入
	
	分类：
		PrintWrite输出字符
		PrintStream输入字节

		
	Print流的由来：
	
		Write的write方法可以写入：
		
				一个字符
				一个字符数组
				一个字符数组的一部分
				一个字符串
				一个字符串的一部分
				
		OutputStream的write方法可以写入：
		
				一个字节
				一个字节数组
				一个字节数组的一部分
		
		DataOutputStream流可以写入：
		
				一个字节
				一个字节数组（继承自OutputStream）
				一个字节数组的一部分
				所有的基本类型的二进制代码
					如：writeDouble（8.8）写入的是二进制代码，共享八个字节
				
		PrintStream流的print可以写入
				
				所有基本类型数据的字符串形式表示
					如：print(8.8) 写入的是“8”“.” "8"这三个字符 共占三个字节
					
		
				
		PrintStream：
				
				PrintStream在OutputStream基础上提供了增强的功能，即可以方便输出各种类型的数据(而不仅限于byte型)的格式化表示形式
				
				PrintStream重载了print和println方法，用于各种不同类型的数据格式化输出
				
				格式化输出是指将一个数据用其字符串格式输出
				
				
				
*/

