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
	问题一：什么类需要重写：
	
	问题二：为什么要重写

*/
import java.util.*;

class Student //implements Collection 
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
