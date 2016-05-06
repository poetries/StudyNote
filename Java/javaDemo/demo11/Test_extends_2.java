class Human
{
	public String  name = "张三";
	public int age = 22;
}

class student extends Human
{

	public double score = 88.9;
}

class Graduate extends student
{
	
	public String daoshi = "周杰伦";
}

public class Test_extends_2
{
	public static void main(String[] args)
	{
		Graduate gd = new Graduate();
		System.out.printf("%s %f\n",gd.name,gd.score);
	}
}
