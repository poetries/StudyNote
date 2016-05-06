//ѾԌѲɃA֢ٶ`ѣֻ֤լԶһٶהг

class A
{
	public int i = 20;
	private static A aa = new A(); //aa 是A对象的属性 static不能省 否则getA()方法不能访问aa（静态的不能访问非静态的）
	
	private  A()  //private ёnew޻ֹ ʹ֮һŜլԶהг
	{
		
	}
	
	public static AgetA() //static一定不能省略（原因：可以让外部非静态的成员访问静态的方法）
	{
		return aa;
	}
	
}

public class Test_Static2
{
	public static void main(String[] args)
	{
		// A aa1 = new A(); //ɧڻA`քٹլ׽רˇ˽Ԑք ղnewߍܡѨխ
		// A aa2 = new A();
	}
}
