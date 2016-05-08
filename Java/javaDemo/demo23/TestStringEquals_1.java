
class A 
{
	public int i;
	
	public A(int i)
	{
		this.i = i;
	}
}

public class TestStringEquals_1
{
	public static void main(String[] args)
	{
		A aa1 = new A(2);
		A aa2 = new A(2);
		
		System.out.println(aa1.equals(aa2)); //输出结果：false
		
		//判断aa1和aa2是否相等 还可以写成if(aa1 == aa2) else 
		//System.out.println(aa1);//A@659e0bfd
		//System.out.println(aa2);//A@2a139a55
		
		
	}
}
