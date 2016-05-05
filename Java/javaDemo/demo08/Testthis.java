/*
	关键字this：
	1、是一个系统隐含的指针被自动附加在非静态的成员函数参数列表中
	2、当前时刻，哪个对象调用函数，那么this就指向当前调用该函数的对象，系统会自动在该函数的
	   列表中添加一个隐藏的this指针,并且把调用该函数的对象的地址赋给this指针，这样一来，在函数内部通过this
	   就可以访问当前正在调用该函数的对象的成员
	 3、静态函数内部，没有this指针
*/

class A
{
	public int i;
	 
	public  void show() //this代表的是当前正在调用show方法的对象
	{
		System.out.printf("i = %d \n",i);//i可以换成this.i
	}
	
	public  A(int j)
	{
		i = j;
	}
}

public class Testthis
{
	public static void main(String[] args)
	{
		A aa1 = new A(10);
		A aa2 = new A(20);
		
		aa1.show(); //aa1.show(aa1);
		aa2.show(); //aa2.show(aa2);
		
		/*
			aa1和aa2在内存中分别有各自的数据成员i，单数aa1和aa2公有的show方法如何知道输出的i应该是那个对象中的i?
			实际上每个非static方法中double隐含这一个this指针，指向当前正在调用该方法的对象
			
		*/
		
		
	}
}
