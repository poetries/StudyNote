/*

	有关HashMap类的实例
*/

import java.util.*;

public class TestHashMap_1
{
	public static void main(String[] args)
	{
		Map m1 = new HashMap();
		m1.put("one", 1);
		m1.put("two", 2);
		m1.put("three", 3);
		System.out.println("1-> " + m1);
		System.out.println("2-> " + m1.size());
		m1.put(66.6, 'm');  //Map中键和值的类型是任意的，这也是Map强大的重要表现
		m1.put(123L, 34);
		System.out.println("3-> " + m1.size());
		System.out.println("4-> " + m1);

		System.out.println(m1.containsKey("three")); //true  ontainsKey 不要写成了containKey
		System.out.println(m1.containsValue(34));  //true
		System.out.println(m1.containsValue(123L));  //false
	}
}
/*
	在JDK 1.6中的运行结果是：
---------------------
1-> {two=2, one=1, three=3}
2-> 3
3-> 5
4-> {two=2, one=1, three=3, 123=34, 66.6=m}
true
true
false
---------------------
*/
