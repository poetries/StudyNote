//子类调用父类构造方法 用super()实现

class A
{
	public int i;
	public int j;
	
	public A()
	{
		
	}
	
	public A(int i,int j)
	{
		this.i = i;
		this.j = j;
	}
}

class B extends A
{
	public int k;
	
	public B()
	{
		
	}
	
	public B(int i,int j,int k)//i，j是从父类继承过来的
	{
		//A(i,j); error
		super(i,j);
		this.k = k;
	}
}

public  class Test_super_2
{
	public static void main(String[] args)
	{
		B bb = new B(1,2,3);
		System.out.printf("%d %d %d\n",bb.i,bb.j,bb.k);
	}
}
