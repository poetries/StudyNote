public class TestString_3
{
	public static void main(String[] args)
	{
		String s1 = "sun java",s2 = "Sun Java";
		System.out.println(s1.charAt(1));//u
		System.out.println(s2.length());//8
		System.out.println(s1.indexOf("java"));//4
		System.out.println(s1.indexOf("Java"));//-1
		System.out.println(s1.equals(s2));//false  判断两个字符是否相等
		System.out.println(s1.equalsIgnoreCase(s2));//true
		
		String  s = "我是程序员，我在学java";
		String  sr = s.replace("我","你");
		System.out.println(sr);//你是程序员，你在学java
	}
}
