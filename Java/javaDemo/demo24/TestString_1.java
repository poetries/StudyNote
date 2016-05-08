//测试String类的equals方法的使用
//==的用法
//常量字符串的用法



public class TestString_1
{
	public static void main(String[] args)
	{
		
		//new出来的在堆中存放 导致str1指向第一个 str2指向另一个
		String  str1 = new String("china");
		String  str2 = new String("china");
		System.out.println(str1.equals(str2));	//结果是：true   equals是用来判断str1指向的对象和str2指向的对象是否相等
		
		if(str1 == str2)//等号是判断他们 两自身的 String类的equals方法时用来判断两个对象的自身的内容内容是否相等
			System.out.println("str1 == str2");//str1 str2 自身的内容是否相等，还是用来str1指向的对象的内容和str2指向的对象的内容是否相等？
		else
			System.out.println("str1 != str2");//这里结果：不相等
		
		
		
		// str3 str4 在栈中存放 “china”字符串在Date segment存放
		//正因如此：导致str3 \str4同时指向data segment 
		//要记住：字符串常量在数据区存放的
		String str3 = "china";
		String str4 = "china";
		
		if(str3 == str4)
			System.out.println("str3 == str4");//这里的结果是相等
		
		else
			System.out.println("str3!=str4");
	}
}



/*
	String类：
	
	1、java.langString类对象表示不可修改的Unicode编码编码字符串
	
	2、在java中双引号括起来的字符串也被当做String对象
		System.out.println("abc".length());//输出3
		System.out.printfln("abc".equals("abc"));//输出true
		
		
	String类的equals方法：
	
	1、String类已经重写了Object中的equals方法
	
	2、例子：
			假设str1和str2都是string对象
			
			str1.equals(str2):是用来比较str1变量本身所占内存的值所指向的对象和str2变量本身所占的内存的值所指向
			的对象的内容是否相等，如相等，返回true 否则返回false
			
	3、String类的equals方法时用来判断两个对象的内容是否相等，object类的equals方法是来判断两个对象是否是同一个对象
	
	4、一定要注意 == 与equals的区别
	
	
	
*/
