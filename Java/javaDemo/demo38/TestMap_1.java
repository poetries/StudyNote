import java.util.*;

public class TestMap_1
{
	public static void main(String[] args)
	{
		Map m = new HashMap();
		m.put("one","zhagnsan");
		m.put("two",70);
		m.put(new A(),"12");
		System.out.println(m.get("12"));
		System.out.println(m);
		
		
	}
}

class A
{
	
}


/*
	预备知识：哈希表
	
	哈希表定义：
			哈希表不是只存储需要保存到额数据，而是既保存数据也保存数据的主键，实际是：先保存主键，然后哈希表会根据某种算法自动计算出以当前主键为主键的数据的存储的位置，然后在把数据存储进去
	
	哈希表：
			假设待保存的数据是val，val的主键是key，则哈希表先存储key，然后哈希表会自动根据key计算出val存储位置，最终把val存储进去
			
	
	哈希表注意事项：
			Hash即哈希表又称散列表
			
			Hash中不允许存在重复的键
			
			哈希表主要是为了提高数据的存储速度和查找速度设计的
			
			哈希表是人类的一种追求
			
			机会所有的哈希表都会产生冲突
			
			java中是利用桶来解决哈希冲突的
			
			
	



*/
