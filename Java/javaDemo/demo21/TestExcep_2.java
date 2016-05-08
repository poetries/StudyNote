public class TestExcep_2
{
	public static void main(String[] args)
	{
		//int m;//error
		int m = 88;//这里要赋值才不会出错
		
		//java编译器认为 放在try里 很可能执行都不成
		try
		{
			m = 2;
		//	System.out.printf("m = %d\n",m);
		}
		catch(Exception e)
		{
			
		}
		
		System.out.printf("m = %d\n",m);  //error
	}
}
