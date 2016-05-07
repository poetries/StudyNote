
interface It3 extends It1,It2 //接口允许多继承
{
	
}

interface It4
{
	int i = 20;
}

//把继承放前面 接口放后面 从一定程度上单继承
class T extends A implements It4,It3 //implements It4,It3 extends A 这样写是错误的
{
	
}

public class Testinterface_4
{
	public static void main(String[] args)
	{
		System.out.printf("哈哈哈!!\n");
	}
}
