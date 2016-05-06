//本程序让A这个类保证只造出一个对象

class A
{
	public int i = 20;
	private static A aa = new A(); //aa 鏄疉瀵硅薄鐨勫睘鎬?static涓嶈兘鐪?鍚﹀垯getA()鏂规硶涓嶈兘璁块棶aa锛堥潤鎬佺殑涓嶈兘璁块棶闈為潤鎬佺殑锛?
	
	private  A()  //private 把new禁止 使之不能造出对象
	{
		
	}
	
	public static AgetA() //static涓€瀹氫笉鑳界渷鐣ワ紙鍘熷洜锛氬彲浠ヨ澶栭儴闈為潤鎬佺殑鎴愬憳璁块棶闈欐€佺殑鏂规硶锛?
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
	}
}
