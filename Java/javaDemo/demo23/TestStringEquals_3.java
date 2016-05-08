//toString方法

class A
{
	public String toString()//public要加 不然访问权限过低
	{
		return "哈哈哈"
	}
}

public class TestStringEquals_3
{
	public static void main(String[] args)
	{
		//System.out.println(new A());
		System.out.println((new A()).toString()); //两个等价
		
		
	}
}
