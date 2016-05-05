class TestSwitch
{
	public static void main(String[] args)
	{
		switch(1)//第一个switch
		{
			case 1:
				switch(0) //第二个switch
				{
					case 0:
						System.out.printf("00\n");
					case 1:
						System.out.printf("11\n");
						break;
					case 2:
						System.out.printf("33\n");
				}
				break;
			case 2:
				System.out.printf("44\n");
				
		}
		System.out.printf("55\n");
		
	}
}

//结果： 00  11  55
