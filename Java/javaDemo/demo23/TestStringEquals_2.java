//本程序证明了：对象不一样，同样内存，内容一样，可以通过重写equals方法使得输出返回：true
//同一块内存，则object中的equals方法返回true 

class A 
{
	public int i;
	
	public A(int i)
	{
		this.i = i;
	}
	
	public boolean equals(Object obj) //obj 一个指针 已经指向了子类
	{
		//A 是子类 obj是父类
		A aa = (A)obj;//要调用子类中的成员、方法，就得把已经指向父类的引用强制转化为子类引用（这里用了多态知识，之前笔记有）
		
		//这里不能写成obj.i 因为父类object不能访问子类所特有的i
		if(this.i == aa.i)//如果当前对象的i(this就是当前调用A方法的aa1对象)和obj代表的i相等
			return true;
		else
			return false;
	}
}

public class TestStringEquals_2
{
	public static void main(String[] args)
	{
		A aa1 = new A(2);
		A aa2 = new A(2);
		
		System.out.println(aa1.equals(aa2)); //输出结果：false
		//现在重写方法：要求结果返回：true
		
		
	}
}


/*

	【总结：object类的equals方法】
	
	1、所有类都从object中继承了equals方法
	
	2、object类中的equals方法源码：
		
		public boolean equals(Object obj)
		{
			return this == obj;//即当前对象地址和obj地址一样就返回true
			
		}
	
	3、object中的equals方法时直接判断this和obj本身的值是否相等，即用来判断调用equals的对象和形参obj所引用的对象是否
	是同一对象，所谓同一对象就是指内存中同一块存储单元，如果this和obj指向的是同一块内存对象，则返回true，如果this
	和obj指向的不是同一块内存，返回false
	注意： 
		即便是内容完全相等的两块不同的内存对象，也会返回false
	
	4、如果是同一块内存，则object中的equals方法返回true 如果是不同的内存，返回false
	
	
	【何时需要重写equals方法】：
	
		1、用一个类构造出来的不同内存的两个对象，如果内存中的值相等，我们一般也应该认为这两个对象相等，很明显object
		   中的equals()无法完成，object中的equals()方法只有在两个对象时同一块内存时，才返回true
		   ，这时我们就有必要重写父类object中的equals方法
		  
		 2、如果希望不同内存但相同内容的两个对象equals时返回true，则我们需要重写父类的equals方法
		 
*/
