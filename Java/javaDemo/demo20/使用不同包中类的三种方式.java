//使用不同包中类的第一种方式
//使用一个类的全名

package com.ruide;

public class B 
{
	public static void main(String[] args)
	{
		zhangsan.lisi.A aa = new zhangsan.lisi.A();
		aa.m();
	}
}

//使用不同包中类的第二种方式
//使用import语句导入一个包中所有的类

package com.ruide;

import zhangsan.lisi.*;

public class B 
{
	public static void main(String[] args)
	{
		zhangsan.lisi.A aa = new zhangsan.lisi.A();
		aa.m();
	}
}


//使用不同包中类的第三种方式
//使用import导入一个包中特定的类

package com.ruide;

import zhangsan.lisi.A;

public class B 
{
	public static void main(String[] args)
	{
		zhangsan.lisi.A aa = new zhangsan.lisi.A();
		aa.m();
	}
}


/*
	归档工具：
			java归档工具是JDK中提供的一种多用途的存档及压缩工具
			可以将多个文件或目录合并压缩为单个的java归档文件
	
	jar文件的主要作用：
			发布和使用类库
			便于资源的组合和管理
	
*/
