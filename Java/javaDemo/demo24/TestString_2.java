
//测试String类的valueOf方法的用法

public class TestString_2
{
	public static void main(String[] args)  throws Exception //把异常抛出交由虚拟机处理
	{
		int i = 12;
		String str = "456";
		
		//str  = i;//error
		//i = str;//error
		
		//接收整型数据并输出
		str = String.valueOf(i);
		System.out.printf("str = %s\n",str);
		
		
		i = Integer.parseInt(str);//parseInt要求捕获异常 否则出错
		System.out.printf("i = %d\n",i);
		
		
	}
}





/*
	string类常用的方法：
	
	1、public char charAt(int index) 返回字符串中的第index个字符
	
	2、public intlength() 返回字符串的长度
	
	3、public int indexOf(String str) 返回字符串中出现str的第一个位置
	
	4、public int indexOf（String str，int fromIndex）返回字符串中从fromIndex开始出现str的第一个位置
	
	5、public Boolean equalsIgnoreCase（String another） 比较字符串与another是否一样（）
	
	6、public String replace（char oldChar,char newChar）在字符串中用newChar字符替换oldChar字符
	
	7、public bolean startWith(String prefix) 判断字符串是否以prefix字符串开头
	
	8、public boolean endWith(String suffix) 判断字符串是否以prefix字符串结尾
	
	9、public String toUPperCase()返回一个字符串的大写形式
	
	10、public String toLowerCase()返回一个字符串的小写形式
	
	11、public String （截取字符串比如从3-10 只能截取到9）substring(int beginIndex) 返回该字符串从beginIndex开始到结尾的子字符串
	
	12、public String substring(int beginEndex,int endIndex) 返回该字符串从beginIndex开始到endIndex结尾的子字符串
	
	
	静态重载方法：
	
		public static String valueOf（..）可以将基本类型的数据转化为字符串
		
		例如：
			public static String valueOf(double d)
			public static String valueOf(int i)
			
		方法public String [] spilt(String regex)可以将一个字符串按照指定的分隔符分隔，返回分隔符后的字符串数组
		
	
	
	
*/
