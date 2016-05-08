//统计一个String对象中大写字母 小写字母 非字母 各自出现的次数

class TestString_6
{
	public static void main(String[] args)
	{
		String str = "abAM1,!23";
		
		
		// C语言中的写法
		// char ch = str.charAt(i);//返回字符串中的第index个字符
		// if(ch >='a'&&ch<='z')
			
		int cntU = 0;//大写字母个数
		int cntL = 0;//小写字母个数
		int cntOther = 0;
		
		
//方法一：

/*
	
		for(int i=0;i<str.length();++i)
		{
			char ch = str.charAt(i);//找到下表为i的这个元素
			if(ch>='a' && ch<='z')
				cntL++;
			else if(ch>='A'&&ch<='Z')
				cntU++;
			else
				cntOther++;
		}
		
		System.out.printf("大写字母个数：%d\n",cntU);
		System.out.printf("小写字母个数：%d\n",cntL);
		System.out.printf("非字母个数：%d\n",cntOther); */
		
		
		//方法二：
		
/* 		for(int i = 0;i<str.length();++i)
		{
			char ch = str.charAt(i);//找到下表为i的这个元素
			
			if(Character.isUpperCase(ch))//确定指定字符是否为大写字母
			{
				cntU++;
			}
			else if(Character.isLowerCase(ch))
				cntL++;
			else
				cntOther++;
		} */
		//方法三
		
		String s1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String s2 = "abcdefghijklmnopqrstuvwxyz";
		
		for(int i=0;i<str.length();++i)
		{
			char ch = str.charAt(i);//找到下表为i的这个元素
			if(-1!=(s1.indexOf(ch)))//返回ch在s1中出现的位置 等于-1相当于没出现
				cntU++;
		    else if(-1!=s2.indexOf(ch))
				cntL++;
			else
				cntOther++;
		}

		
		System.out.printf("大写字母个数：%d\n",cntU);
		System.out.printf("小写字母个数：%d\n",cntL);
		System.out.printf("非字母个数：%d\n",cntOther);
	}

}
