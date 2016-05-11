/*

	Collection接口的子接口--List接口
	
	List接口：
	
	List接口是Collection的子接口，实现List接口的容器类中的额元素是有顺序的，而且可重复

	List容器中的元素都对应一个整数型的序号记载其在容器中的位置，可以根据序列号存取容器中的元素
	
	J2SDK 所提供的List容器类有ArrayList，LinkedList等
	
	
	object get(int index)
	object set(int index,object element)
	void add(int idnex,object element)
	int indexOf(object o)
	int lastIndexOf(object o)
	
	
	
	
	Collection接口的子接口--Set接口
	
		因为Set和List都是继承Collection接口，所以Set和List中有很多方法时一样
		
		List接口中有set,indexOf()方法中，但是set接口却只有add方法，没有set,indexOf方法，因为Set是无需不能重复的
	
	
	Map接口：
	
	java.util.Map 接口描述了映射结构，Map结构允许以键集、集合或值映射关系的形式查看某个映射的内容
	
	
	ArrayList和LinkedList比较：
	
		ArrayList和LinkedList都实现了List接口中的方法，但两者内部实现不同
		
		ArrayList存取速度快，插入删除慢
		LinkedList存取速度慢，插入删除速度快
		
		
*/

import java.util.*;

public class TestCollection
{
	public static void main(String[] args)
	{
		Collection c = new LinkedList();
		c.add(new Student("zhangsan", 80));//强烈建议：添加到Collection容器中的对象都应该重写父类Object的toString方法
		
		c.add(66.6);
		System.out.println(c);
	}
}

class Student 
{
	private String name;
	private int age;
	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	//如果把toString方法注释掉了，则程序输出结果会有乱码
	public String toString()	
	{
		return name + " " + age; 
	}
}
