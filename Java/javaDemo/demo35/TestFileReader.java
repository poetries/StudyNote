//从硬盘读取数据
import java.io.*;

public class TestFileReader
{
	public static void main(String[] args) throws Exception
	{
		FileReader fr = new FileReader("F:\\workspace\\java\\TestFileReader.java");
		int ch;
		
		ch = fr.read();
		while(-1!=ch)//-1表示文件读到结尾了
		{
			System.out.printf("%c",ch);
			ch = fr.read();
		}
		fr.close();
	}
	
}
