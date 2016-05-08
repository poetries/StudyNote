import java.util.Scanner; //导入sum提供的包

public class TestExcep_3 
{
	public static void main(String[] args)
	{
		int i;
		
		//Scanner是sum公司提供的一个类
		Scanner sc = new Scanner(System.in);//System.in标准键盘输入流
		
		//用户输入合法才把try中的语句输出
		try
		{
			i = sc.nextInt();//从键盘输入一个字符当做整型来处理
			System.out.printf("i = %d",i);
		}
		//数据不正确才执行以下 捕获异常
		catch(Exception e)
		{
			System.out.printf("输入数据不合法，程序被终止!\n");
		}
	}
}
