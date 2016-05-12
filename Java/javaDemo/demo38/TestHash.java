/*
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

class B 
{
	private int i;
	
	public B(int i)
	{
		this.i = i;
	}
	
	//重写equals方法
	public boolean equals(Object ob)
	{
		B bb = (B)ob;//接收过来是父类引用 实际指向子类 父类引用转换为子类引用
		return this.i == bb.i;
	}
	
	//重写HashCode()方法
	public int hashCode() //hashCode返回的是当前对象的地址十六进制形式表示
	{
		return new Integer(i).hashCode();
	}
	
	//重写最终导致只要内容一样，他们的哈希码就一样 这样使得容器的放置元素得到解决
}

class Student
{
		private int id;
		private String  name; //所有的String都是一个对象 name也是一个对象
		
		public Student(int id,String name)
		{
			this.id = id;
			this.name = name;
		}
		public int hashCode()
		{
			//return new String(name+id).hashCode();//name 和id一样 这个对象的hash就一样
			
			return id * name.hashCode();
		}
}

public class TestHash
{
	public static void main(String[] args)
	{
		// B bb1 = new B(1);
		// B bb2 = new B(1);
		
		// System.out.println(bb1.equals(bb2));//需要重写equals方法
		// System.out.println(bb1.hashCode() == bb2.hashCode());//需要重写hashCode方法
		
		
		Student st1 = new Student(1,"张建");
		Student st2 = new Student(1,"张建");
		
		System.out.println(st1.hashCode() == st2.hashCode());//true 
		
		
	}
}
