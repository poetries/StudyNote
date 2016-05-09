//数组的拷贝

import java.util.*;

public  class  	TestArry_5
{
	public static void main(String[] args)
	{
		int[] data = {1,3,5,7,2,4,6,8,10,9};
		System.out.println("排序前data数组中的内容是:");
		showArray(data);
		
		Arrays.sort(data);
		System.out.println("排序后data数组中的内容是:");
		showArray(data);
		
	}
	
	public static void showArray(int[] data)
	{
		for(int e:data)//把data数组中的每一个元素取出来赋给e
			System.out.printf("%d\t",e);
		System.out.println("");
	}
}
