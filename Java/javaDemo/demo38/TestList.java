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
		List L= new ArrayList();
		L.add(new  Student(11,"张建"));
		L.add(new Student(10,"张三"));
		L.add(new Student(13,"李四"));
		
		
		Collections.sort(L);  //sort 调用compareTo方法
		
		System.out.println(L);
	}
}
