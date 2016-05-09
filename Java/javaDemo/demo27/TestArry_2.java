
//基本类型的数组

public  class TestArry_2
{
	public static void main(String[] args)
	{
		int[] s;
		 
		s = new int[10];
		for(int i = 0;i<10;i++)
		{
			s[i] = 2*i+1;
			System.out.println(s[i]);
		}//退出for循环后把1 3 5 7 9 11 13 15 17 19放入数组中
	}

}
