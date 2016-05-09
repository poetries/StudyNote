//数组的拷贝

public  class  	TestArry_4
{
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5};
		int[] b = {-1,-2,-3,-4,-5};
		
		//a数组从0开始的两个两个元素覆盖b数组从1开始的两个元素
		//最终b数组是：-1  1 2 -4 -5 
		System.arraycopy(a,0,b,1,2);
		
		System.out.println("a = ");
		for(int i=0;i<a.length;++i)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("b = ");
		for(int i = 0;i<b.length;++i)
		{
			System.out.println(b[i]);
		}
		 System.out.println("Hello world!");
	}
	
}


/*

	数组的拷贝:
			
		public static void arraycopy(Object arr1,int pos1,Object arr2,int pos2,int length)
	
		将arr1所指向的数组中下标从pos1开始的额总共length个元素覆盖掉arr2所指向的数组中从pos2开始的length个元素
		
	注意：
		arr1是源数组 arr2是目的数组
		arraycopy()全是小写 不能大写
	
	
	
*/
