//本程序让A这个类保证只造出一个对象

class A
{
	public int i = 20;
	private static A aa = new A(); //aa 是A的属性 static不能省略（静态的不可以访问非静态的成员）	
	private  A()  //private 把new禁止 使之不能造出对象
	{
		
	}
	
	public static A getA() //static不能省略 因为：静态的不可以访问非静态的成员
	{
		return aa;
	}
	
}

public class Test_Static2
{
	public static void main(String[] args)
	{
		// A aa1 = new A(); //如果A类的构造方法是私有的 则new就会报错
		// A aa2 = new A();
		
		A aa1 = A.getA();
		A aa2 = A.getA();
		
		aa1.i = 99;
		System.out.printf("%d\n",aa2.i); //此步说明aa1 aa2公用一个静态的i成员
		
		//检测aa1 aa2是否相等
		
		if(aa1 == aa2)
			System.out.printf("aa1和aa2相等\n");
		else
			System.out.printf("aa1和aa2不相等\n");
	}
}
