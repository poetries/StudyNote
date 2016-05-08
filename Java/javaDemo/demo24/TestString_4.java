public class TestString_4
{
	public static void main(String[] args)
	{
		String s = "Welcome to Java World!";
		String s1 = "  sun java  ";
		System.out.println(s.startsWith("Welcome"));//true
		System.out.println(s.endsWith("World"));//false  以感叹号结束
		String  sL = s.toLowerCase();
		String  sU = s.toUpperCase();
		System.out.println(sL);
		System.out.println(sU);
		String subS = s.substring(11);//substring 截取字符串 从11开始截取
		System.out.println(subS);//Jave World!
		String  sp = s1.trim();
		System.out.println(sp);//sum java   trime()去掉左边和右边的空格
		
	}
}   
