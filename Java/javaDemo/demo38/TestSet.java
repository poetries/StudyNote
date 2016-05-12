/*
	Set接口：
	
		1、set接口是Collection的子接口，set接口没有提供额外的方法，但实现set接口的容器类中的元素是没有顺序的，且不可重复
		
		2、set容器可以与数学中的“集合”概念相对应
		
		3、J2SDk API中所提供的set容器类有HashSet，TreeSet
		
		HashSet类：
		
			HashSet类实现了set接口
			
			HaskSet容器中的元素是不能重复的，无顺序的
			
			存放如hashSet容器中的类必须要实现equals()和hashCode方法

			
*/

/*
	问题一：什么类需要重写：（需要在这种累类里面放对象）
	
			放到hashSet里面一定要重写
			HashMap
			HashTable
			（凡是前面带Hash的都需要重写）
			
			放到list里面不需要重写
			放大TreeSet里面不需要重写
	
	问题二：为什么要重写equlas()和hashCode()方法 
	
			预备知识：
				散列码：
					Object中的hashCode方法返回该对象的真是地址的整数化表示，这个形象的不是真是的地址的整数值就是哈希码
					
				向HashSet中添加对象时，HashSet先通过该对象的hascode()计算出相应的桶，然后咋诶根据equals方法找到相应的对象，如果容器中已经存在该对象，则不再添加，不存在添加进去
	
	
	问题三：怎么样重写equals()和hashCode()方法
	
			如何重写equals()
			
					public boolean equals(Object obj)
					{
						如果this和obj的内容一模一样的
							返回true
						否则
							返回false
					}
				
			如何重写hashCode()
			
					public int hascode()
					{
						return 当前类中的基本类型数据对象的hashCode()方法
						
					}
					

	
	什么容器必须得重写equals方法和hashCode方法：
	
		添加到TreeSet中的对象和添加到TreeMap中的键都可以不重写equals()方法和hashCode()方法 
		更准确的讲：添加到TreeSet中的额对象和添加到TreeMap中的键是否重写equals()方法 和equals()方法
		以及怎么样重写equals()方法和hashcode方法，对程序没有影响
		
		
	Hashtable HashSet hashMap都必须同时实现equals方法和hashcode方法 TreeSet和TreeMap则不需要实现equals方法和hashCode方法
	
*/

import java.util.*;

class Student 
{
	private int id;
	private String name;
	
	public Student(int id ,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() //重写toString  toString()返回该对象的字符串表示
	{
		return id + " "+name; 
	}
	
	//保证元素不重复
	public boolean equals(Object ob)
	{
		Student st = (Student)ob;
		
		return st.id == this.id && st.name == this.name;
	}
	
	public  int hashCode()
	{
		return id * this.name.hashCode();
	}

}

public class TestSet
{
	public static void main(String[] args)
	{
		//HashSet里面没有set()  get()方法 HashSet实现了Collection方法
		
		//要把Student对象放到set的实现类HashSet() 需要重写equals和hashCode方法
		Set S= new HashSet();  //Set 是接口不能new出对象 要写接口的实现类 假设是HashSet
		
		S.add(new Student(11,"张建"));//
		S.add(new Student(10,"张三"));
		S.add(new Student(13,"李四"));
		S.add(new Student(13,"李四"));
		S.add(new Student(13,"李四"));
		S.add(new Student(13,"李四"));
		
		System.out.println(S);
	}
}
