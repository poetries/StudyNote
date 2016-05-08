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
