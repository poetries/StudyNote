//位运算符

class test4
{
	public static void main(String[] args)
	{
		int i = -3; //负数要求补码 0000 0011 取反1111 1100 加1就是补码 所以-3的二进制是 1111 1101
		int j = 11;
		int k =i&j;
		System.out.printf("%d\n",k);
		
	}
}

