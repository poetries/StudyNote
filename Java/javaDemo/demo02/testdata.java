class testdata
{
	public static void main(String[] args)
	{
		byte b = 10;//一个字节
		int i = 6;//4个字节
		i = b;//OK
		//b = i;//error 会丢失数据
		b = (byte)i;//OK  强制类型转换
		//b = i;//本语句错误 (byte)i 不会改变i本身
		
		float  x;
		//x = 10*0.2;//error 10*0.2是double类型
		x = 10*0.2f;//ok
		//x = (float)(10*0.2);
		System.out.printf(b+","+i+","+x);
		

	}
}
