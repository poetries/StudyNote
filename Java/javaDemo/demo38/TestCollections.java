// 测试Collections类的使用


import java.util.*;

public class TestCollections
{
	public static void main(String[] args)
	{
		List lt = new LinkedList(); 
		for (int i=0; i<7; ++i)
		{
			lt.add("a" + i);
		}
		System.out.println(lt);
		Collections.shuffle(lt);  //记住LinkedList中是没有shuffle方法的，因此需要通过Collections类的相关方法来实现
		System.out.println(lt);
		Collections.sort(lt); //默认升序排序，要降序很简单，先调用Collections.sort(); 再调用Collections.reverse()
		System.out.println(lt);
		Collections.reverse(lt); //倒置
		System.out.println("倒置之后: " + lt);
		System.out.println(Collections.binarySearch(lt, "a5")); //因为lt默认不是升序排序的，所以调用Collections.binarySearch()方法是不会成功的
		Collections.sort(lt);
		System.out.println("重新排序之后: " + lt);		
		System.out.println(Collections.binarySearch(lt, "a5"));  //记住，使用binarySearch()方法的前提是该容器已升序排序
	}
}
/*
	在JDK 1.6中的运行结果是：
----------------------------
[a0, a1, a2, a3, a4, a5, a6]
[a5, a3, a6, a4, a2, a0, a1]
[a0, a1, a2, a3, a4, a5, a6]
倒置之后: [a6, a5, a4, a3, a2, a1, a0]
-8
重新排序之后: [a0, a1, a2, a3, a4, a5, a6]
5
----------------------------
*/



/*	
	Collections类：
	
		Collection接口 的实现类，如ArrayList,LinkedList本身并没有提供排序，倒置，查找方法，这些方法 是由Collections类来实现的，该类有很多public static方法，可以直接对Collection接口的实现类进行操作
				
		
	类java.util.Collections提供了一些静态方法实现了基于List容器的一些算法
	
	void sort(List) 对List容器内元素排序
	void shuffile(List) 对List容器内的对象进行随机排序
	void reverse(List) 对List容器内元素逆序排序
	
	.....
	
	
	
		
*/
