class A
{
	public int i;
	public int j;
	
    public void show()
	{
		System.out.printf("i = %d,j = %d\n",i,j);
	}
	
	public void set(int a,int b)
	{
		i = a;
		j = b;
	}
	
	public A(int a,int b) //构造函数（名字和类名一样，无返回值）  类似函数 却不是函数
	{
		i = a;
		j = b;
		System.out.printf("无参数函数调用！");
	}
	
}

class TestConst
{
	public static void main(String[] args)
	{
	//	A aa = new A();
		
		//方法一
		// aa.i = 1;
		// aa.j = 2;
		
		//方法二
		//aa.set(1,2);
		//aa.show();
		
		//方法三 定义的完成初始化 发送给构造函数执行
		A aa = new A(1,2);
		
		//System.out.printf("%d %d\n",aa.i,aa.j)
		aa.show();
	}
}

