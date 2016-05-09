
public  class TestArry_1
{
	public static void main(String[] args)
	{
		//方式一
		int[] arr1; //c语言中这样写：int arr1[]
		
		arr1 = new int[3];
		arr1[0] = 0;
		arr1[1] = 1;
		arr1[2] = 2;
		showArr(arr1);
		System.out.println("*******^^^^^^^^^********");
		
		//方式二 最常用
		int[] arr2 = new int[]{0,1,2};
		showArr(arr2);
		System.out.println("*******^^^^^^^^^********");
		
		//int[3] arr3 = new int[]{0,1,2};//error
		//int[] arr4 = new int[3]{0,1,2};//error
		//int[3] arr5 = new int[3]{0,1,2};//error
		
		//方式三
		
		int[] arr6 = {0,1,2};
		showArr(arr6);
		System.out.println("*******^^^^^^^^^********");
		arr6 = new int[]{5,4,3,2,1,};
		showArr(arr6);
	}
	
		public static void showArr(int[] arr)
		{
			for(int i=0;i<arr.length;++i)//length()不能写这个
				System.out.println(arr[i]);
		}



}


/*
	数组概述：
	
		为什么需要数组
					为了解决大量同类型数据的存储和使用问题
					为了模拟现实世界
		
		什么叫一维数组
					为n个变量连续分配存储空间
					所有变量的数据类型相同
					所有变量所占字节大小相等
		
		数组中的元素可以是基本类型（int char..）变量，也可以是引用类型（指针）变量
		
		
		
*/
