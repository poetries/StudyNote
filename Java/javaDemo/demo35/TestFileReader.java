//从硬盘读取数据
import java.io.*;

public class TestFileReader
{
	public static void main(String[] args) throws Exception
	{
		FileReader fr = new FileReader("F:\\workspace\\java\\TestFileReader.java");
		int ch;
		
		ch = fr.read();//read返回值一定是整型数据 内部有一个文件指针 读完一个自动下移一个
		while(-1!=ch)//-1表示文件读到结尾了
		{
			System.out.printf("%c",ch);
			ch = fr.read();
		}
		fr.close();
	}
	
}
