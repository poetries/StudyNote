//转换流

import java.io.*;

public class TestString
{
	public static void main(String[] args)
	{
		String str = null;
		
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//System.in代表从键盘输入
			str = br.readLine();
			System.out.println("str = "+str);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
}



/*
	readLine()与回车的问题：
	
	String str = "123";
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
	
	str = br.readLine();
	
	如果直接输入回车的话，则：
			
				br.readLine()会丢弃回车符，而不是返回回车符，即br.readLine()遇到回车符是终止读取，并把读取到的回车符丢弃掉
				
				br.readLine()返回的是"" 而不是null ""表示空字符串 null表示空指针，空指针及时空地址 空地址就是不指向任何存储单元的意思
				


*/
