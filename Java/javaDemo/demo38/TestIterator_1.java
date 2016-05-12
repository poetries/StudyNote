import java.util.*;

public class TestIterator_1
{
	//可以遍历所有Collection接口的实现类
	public static void showCollection(Collection c)
	{
		Iterator it = c.iterator();//iterator()方法返回的就是it指针 指向al容器的第一个元素
		while (it.hasNext())//等价于it++ 
		{
			System.out.println(it.next());
		}
	}

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("one");
		al.add(22);
		al.add(new Point(1,1));
		System.out.println("a1 容器的内容是:");
		showCollection(al);
		
		HashSet hs = new HashSet();
		hs.add("one");
		hs.add(22);
		hs.add(new Point(1,1));
		System.out.println("hs容器的内容是:");
		showCollection(hs);
	}
}

class Point
{
	private int i, j;
	
	public Point(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	
	public String toString()
	{
		return "[" + i + ", " + j + "]";
	}
}


/*

	Iterator方法介绍：（Iterator接口的功能为了遍历）

	boolean hasNext()
		是用来判断当前游标的后面是否还是存在元素，如果存在返回真，否则返回假
		

	Object next()
		先返回当前游标右边的元素，然后游标后移一个位置

	void remove()
		删除最近返回的元素，在调用remove之前，我们至少保证先调用一次next方法，而且调用next之后只能调用一次remove方法
		
	remove方法不推荐使用

	
	TreeSet类：
	
		TreeSet类实现了Set接口
		
		TreeSet是一个有序集合，TreeSet中元素将按照升序排序，缺省是安排自然顺序排序，因此TreeSet中元素要实现Comparable接口
		
	记住：所有可以进行排序的类都应该实现Comparable接口
	
	
	TreeSet实例：
	
		Collection 从= new TreeSet()
		c.add("123")
		c.add("456")
		c.add("111")
		c.add("467")
		
		Iterator i = c.iterator()
		while(i.hasNext())
		{
			System.out.println((i.next())
		}

		
	TreeSet和HashSet比较：
	
		HashSet是基于hash算法实现的，其性能通常都优于TreeSet，我们通常使用HashSet，在我们需要排序功能时，我们才使用TreeSet
		
		
*/
