//假设从网上下载的包导入演示：

//要把jar包的当前的目录包的名字设置set classpath=路径 （临时的） 设置到环境变量里面
import zhangsan.lisi.A;

public class test
{
	public static void main(String[] args)
	{
		A aa = new A();
		aa.g();
	}
}

