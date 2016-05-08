public class TestString_5
{
	public static void main(String[] args)
	{	
		int j = 1234567;
		String  sNumber = String.valueOf(j); //把整型数据转化为字符串
		System.out.println("j是"+sNumber.length()+"位数");
		String s = "Mary,F,1976";
		String[]  sPlit = s.split(",");//把s这个字符串，以逗号分隔，放到数组里面 Mary放到数组的第一个元素
		for(int i = 0;i<sPlit.length;i++)
			System.out.println(sPlit[i]);
	}
}	

/* 
输出结果：

j是7位数
Mary
F
1976 */
