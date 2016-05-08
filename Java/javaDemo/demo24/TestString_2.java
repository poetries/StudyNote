
//测试String类的valueOf方法的用法

public class TestString_2
{
	public static void main(String[] args)  throws Exception //把异常抛出交由虚拟机处理
	{
		int i = 12;
		String str = "456";
		
		//str  = i;//error
		//i = str;//error
		
		//把整型数据转化为字符串
		str = String.valueOf(i);
		System.out.printf("str = %s\n",str);
		
		
		i = Integer.parseInt(str);//parseInt要求捕获异常 否则出错
		System.out.printf("i = %d\n",i);
		
		
	}
}




