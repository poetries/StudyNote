//引用类型的数组  存在两级的指向关系


class MyDate
{
	private int day;
	private int month;
	private int year;
	
	public MyDate(int d,int m,int y)
	{
		day = d;
		month = m;
		year = y;
	}
	
	public void  display()
	{
		System.out.println(day+"-"+month+"-"+year);
	}
}
public  class TestArry_3
{
	public static void main(String[] args)
	{
		MyDate[] m;
		m = new MyDate[10]; //在堆里面分配了10个指针变量 一个指针变量占4个字节
		for(int i = 0;i<10;i++)
		{
			//数组里每一个元素都是一个指针 这个指针指向的是对象
			m[i] = new MyDate(i+1,i+1,1990+i);//生成真正的new对象 保存在数组中
			m[i].display();
		}
	}
}

//引用类型元素组成的一维数组在使用过程中一般存在两级的指向关系，这是理解多维不等数组的基础
