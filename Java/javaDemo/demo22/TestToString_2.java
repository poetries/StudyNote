class Dian
{
	public int x,y;
	
	public Dian(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString() //重写toString方法
	{
		return "["+x+","+y+"]";
	}
}

public class TestPoint
{
	public static void main(String[] args)
	{
		Dian d  = new Dian(1,2);
		//System.out.printf("%s",d);
		System.out.println(d);//打印对象信息
	}

}

/*

	toString 方法总结：
	
	1、所有的类都默认自动继承了object类
	
	2、object类中的toString方法返回的是类的名字和该对象哈希码组成的一个字符串
	
	3、System.out.println(类对象名) 实际输出的是该对象的toString()方法所返回的字符串
	
	4、为了实际需要，建议子类重写从父类object继承的toString()方法
	
	
*/
