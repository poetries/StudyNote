class B 
{
	public int i;
	
	public B(int i)//构造函数方法
	{
		this.i = i;
	}
	
	//希望运行结果是true 重写父类的object中的equals方法
	
	public boolean equals(Object ob)
	{
		B bb = (B)ob;
		
		//这里不能写成obj.i 因为父类object不能访问子类所特有的i
		if(this.i == bb.i)//如果当前对象的i(this就是当前调用A方法的aa1对象)和obj代表的i相等
			return true;
		else
			return false;
	}
}

public class TestStringEquals_4
{
	public static void main(String[] args)
	{
		B bb1 = new B(2);
		B bb2 = new B(2);
		
		//这里看文档方法：equals(Objec obj) 指示其他某个对象是否与此“相等”
		//利用了多态
		
		System.out.println(bb1.equals(bb2));//这里看bb2是否能发送给形参obj
		//运行结果是：false
		//希望运行结果是true 就该改写方法
	}
}
