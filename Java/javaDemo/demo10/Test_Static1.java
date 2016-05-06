//本程序作用：计算A这个类造出了多少个对象

class A
{
	private int i;
	private static int cnt = 0;//用静态的少占用空间  用private外部不可修改
	
	public A()
	{
		++cnt;
	}
	
	public A(int i)
	{
		this.i = i;
		++cnt;
	}
	
	public static int getCnt()
	{
		
		//	return   //返回的 是A对象的个数
		return cnt;
	
	}
}

public class Test_Static1
{
	public static void main(String[] args)
	{
		System.out.printf("当前时刻A对象的个数是：%d\n",A.getCnt());
		
		A aa1 = new A();
		System.out.printf("当前时刻A对象的个数是：%d\n",A.getCnt());
		
		A aa2 = new A();
		System.out.printf("当前时刻A对象的个数是：%d\n",A.getCnt());
	}
}
