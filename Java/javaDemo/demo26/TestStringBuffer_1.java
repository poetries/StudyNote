
public class TestStringBuffer_1
{
	public  static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		
		sb.append("abc");
		sb.append("123");
		System.out.println("sb = "+sb); //sb = abc123
		
		sb.insert(3,"--");
		System.out.println("sb = "+sb); //sb = abc -- 123
		
		sb.delete(2,6);//把下表从2到6-1的下标删除
		System.out.println("sb = "+sb);//sb = ab23
		
		sb.reverse();
		System.out.println("sb = "+sb);//sb = 32ba
		
		String str = sb.toString();
		System.out.println("str = "+str);//str = 23ba
	}
} 


/*
	StringBuffer类的由来：
	
	1、StringBuffer类对象一旦创建就不可更改
	
	2、如果经常对字符串内容进行修改，则使用StringBuffer
	
	3、如果经常对字符串内容进行修改而使用String的话，就会导致既耗空间又耗时间
	
	4、例子：
			String s1 = "abcdefg"
			String  s2 = "123"
			String  s1 = s1 + s2 //在数据区 原始的字符串不能被改变 又重写生成了一个空间
			删除s1中的字母d（生成一个新串abc 在生成一个新串efg 最后合并两个新串 即删除d）
	
	5、StringBuffer对象的内容是可以改变的
	
	6、因此String类中没有修饰字符串的方法，但是StringBuffer类中却有大量修改字符串的方法
	

	StringBuffer类的构造函数：
	
	1、public StringBuffer() 创建一个空的没有任何字符的StringBuffer对象
	
	2、public StringBuffer（int capacity）创建一个不带字符 ，但具有指定初始容量的字符串缓冲区
	
	3、public STringBuffer(string str)创建一个StringBuffer对象，包含于Str对象相同的字符串序列
	
	
	StringBuffer常用的方法：
	
	1、重载方法public StringBuffer append() 可以理解为该StringBuffer对象添加字符序列，返回添加后的该StringBuffer对象引用
	
			例如：
				public StringBuffer append(String  str)
				public StringBuffer append(StringBuffer sbuf)
				public StringBuffer append(char[] str )
				public StringBuffer append( char[] str,int offset,int len)//从offset指定位置放入
				public StringBuffer append( double d)
				public StringBuffer append(object obj )
	
	2、重载方法public StringBuffer insert()可以作为StringBuffer对象在指定位置插入
	
			如：
				public StringBuffer insert(int offset,String str)
				public  StringBuffer insert(int offset,double d)
		
	3、重载方法public StringBuffer delete(int start,int end)可删除从start开始到end-1为止的一端字符序列
	
	4、和String类似的方法
		
		public int indexOf(String str)
		public int indexOf(String str，int fromIndex)
		public String substring(int start)
		public  String  substring(int start,int end)
		publicint length()
		
		
	5、方法public StringBuffer reverse()用于将字符串序列逆序
	
	
	
	
	
*/
