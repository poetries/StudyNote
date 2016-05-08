//统计一个字符串在哪另一个字符串中出现的次数

public class TestString_7
{
	public static void main(String[] args)
	{
		String str1 = "abcvcasdabcabc";
		String str2 = "abc";
		
		int index = -1;//先让位置为-1  开始找不到
		int cnt = 0;
		
		index = str1.indexOf(str2);//str2在 str1中第一次出现的位置
		
		while(-1 != index) //z如果位置不是-1 说明已经找到了 
		{
			++cnt;
			index = str1.indexOf(str2,index+str2.length());//int indexOf（String str，int fromIndex）返回字符串中从fromIndex开始出现str的第一个位置
		}
		
		System.out.printf("%d\n",cnt);
	}
}
