/*
	函数的重载：同名的函数通过不同的形参做类似的事情
	
	函数重载的要求：
			1、函数的形参个数
			2、函数的形参顺序
			3、函数的形参数据类型
		这三个至少有一个是不一样的
		
		如果两个函数只是函数的返回值不一样，其他一样，这构成函数的重载，并且编译时报错
		

*/


class TestOver
{
	
		static int add(int a,int b)
		{
			return a+b;
		}

		
		static double add(double x,double y)
		{
			return x+y;
		}
		
		static int add(int a,int b,int c)
		{
			return a+b+c;
		}
		
				static int add(int a,int b,int c,int d)
		{
			return a+b+c+d;
		}
		
		public static void main(String[] args)
		{
			System.out.printf("%d \n",add(2,1,3,4));
			System.out.printf("%f \n",add(3.2,4.1));
			System.out.printf("%d \n",add(3,2,1));
		}
}
