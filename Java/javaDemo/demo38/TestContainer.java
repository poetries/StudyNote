
import java.util.*;

public class TestContainer
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(1242);
		al.add("zhagnsan");//"zhagnsan".length() 所有的String都可以用带双引号的字符去调用它
		al.add(231.342);
		
		//System.out.println(a1[2]);//error 容器不是数组
		
		System.out.println(al.get(2));
		
		
		//需要把容器当普通的数组看 可以这样写
		
		Object[] obArr = al.toArray();
		System.out.println(obArr[1]);
	}
	
}


/*
	Object[] toArray()
	
		容器不是数组，不能通过下标方式访问容器中的元素
		
		只有数组才可以通过下标来访问
		
		返回一个包含此collection中所有元素的数组
		
	boolean add(object e) 把e添加到当前集合中
	
	boolean remove(Object o)
	
	boolean addAllAll(Collection c) 把c中所有的元素添加到当前集合中
	
	
	boolean removeAll(Collection c)
	
	
	
	Collection接口中方法介绍：
	
		void clear() 把当前容器中的所有元素清除

*/
