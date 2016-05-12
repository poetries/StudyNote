import java.util.*;

class Student implements Comparable//Comparable比较标准
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
		return id + " "+name; //""
	}
	
	@Override
	public int compareTo(Object o)//比较此对象与指定对象的顺序。如果该对象小于、等于或大于指定对象，则分别返回负整数、零或正整数
	{
		Student st = (Student)o;//把父类的引用强制转换为子类的引用
		
		if(this.id == st.id)//不能写成this.id = o.id  因为o是父类的引用 通过父类的引用不能访问子类特有的
			return 0;
		else if(this.id > st.id)
			return 1;
		else
			return -1;
	}
}

public class TestList
{
	public static void main(String[] args)
	{
		List L= new ArrayList();//List不保证元素重复 需要使用set接口
		L.add(new  Student(11,"张建"));
		L.add(new Student(10,"张三"));
		L.add(new Student(13,"李四"));
		
		
		Collections.sort(L);  //sort 调用compareTo方法
		
		System.out.println(L);
	}
}

/*
	为何要使用Comparable接口：
	
	基本类型数据和String类型数据，他们彼此的比较标准，java语言已经提供好了
	
	用户自定义类对象之间比较的标准java语言本身是没有提供的
	
	所以如果一个容器中含有用户自定义类型的数据，需要对容器中元素进行排序，或者查找某一元素时，须得制定容器中元素与元素之间比较的标准
	
	凡是需要进行对象比较、排序场合均可考虑实现Comparable接口

	Comparable接口介绍：
	
		1、所有课排序的类都实现了java.lang.Comparable接口,Comparable接口中只有一个方法
		
			public int Compare(Object obj)
			
				返回0表示this == obj
				返回整数表示 this > obj
				返回负数this < obj
				
			实现了Comparable接口的类通过实现了compareTo方法从而确定了该类对象的排序方式
	
	

*/
