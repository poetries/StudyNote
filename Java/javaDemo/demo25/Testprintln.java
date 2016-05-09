//66_printf和println的区别


class Dian
{
	public int x,y;
	
	public Dian(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public  String toString()
	{
		return "["+x+","+y+"]";
	}
}

public class Testprintln
{
	public static void main(String[] args)
	{
		Dian d = new Dian(3,2);
		//System.out.printf("%s\n",d);
		System.out.println(d);
		
		int i,j,k;
		i = 1;
		j = 2;
		k = 3;
		
		System.out.printf("%d的值+%d的值是%d\n",i,j,k);//这种方法好
		//System.out.println(i+"的值+"+j+"的值是"+k);
		
		int m= 12;
		//System.out.printf("%d\n",m);
		System.out.println(m);//这种好
		
		System.out.printf("%d用十六进制数表示是:%#X\n",m,m);
		//System.out.println("十进制数字"+m+"用十六进制表示是：OX"+Integer.toHexString(m).toUpperCase());
		
		
		System.out.printf("%b\n","abc".equals("张三"));//返回布尔类型 
		System.out.printf("%d\n","abc".length());
		System.out.printf("%d\n","abcadsdfad".indexOf("ads"));
	}
}
