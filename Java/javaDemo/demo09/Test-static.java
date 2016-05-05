
//本程序证明了A类的多个对象公用一个static属性i

class A
{
	public static int i = 10; //此处的staatic使得 aa1 aa2  aa3 公用一个属性i
	
	public void show()
	{
		System.out.printf("%d\n",i);
	}
}

class M
{
	public static void main(String[] args)
	{
		A aa1 = new A();
		A aa2 = new A();
		A aa3 = new A();
		
		aa1.i = 20;
		aa2.show();//把aa2中的i输出
		System.out.printf("%d\n",aa3.i);
		
	}
}
