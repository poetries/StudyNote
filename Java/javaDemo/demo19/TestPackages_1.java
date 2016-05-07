//文件名：TestPackages


package zhangsan.lisi;

class A 
{
	public void f()
	{
		System.out.printf("AAAA\n");
	}
}
class  TestPackages
{
	public static void main(String[] args)
	{
		new A().f();
	}
}

/*
	总结：
	
	1、package语句必须是第一条语句
	
	2、package zhangsan.lisi 表示：
	
				把该文件中所有的类放入zhangsan.lisi这个包中 并且该文件中所有的类真正名字将是包名和类名的组合
	
	3、如：类TestPackages的名字将变成zhangsan.lisi.TestPackages而不再是TestPackages
		
	
	4、编译时尽量使用javac -d TestPackages.java 尽量不使用：java TestPackages.java 因为后者要手动建立包目录
	
		【注】：
		javac -d A.java  
		-d表示自动生成包层 
		.表示这个目录是在当前目录下建立
		
	5、如果不在当前目录下运行程序，则必须保证class文件的最上层目录的父目录位于classpath下
	
		如：不在当前目前下运行程序必须set classpath = 当前目录路径名 （然后在运行即可）
				

*/
