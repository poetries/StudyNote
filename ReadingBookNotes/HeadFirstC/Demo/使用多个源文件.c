/*
	1、编译大量文件非常的耗时，可以吧目标代码保存在*.o文件中，加快编译速度
	2、make工具可以自动化代码的构建过程 make清楚文件之间的依赖关系 可以编译那些修改过的文件 你需要使用makefile告诉make如何构建代码
	处理makefile的格式要小心 别忘了用tab来缩进 不是空格
	
	3、
	char--是数值（字符编码是一个数字 字符在计算机中以字符编码方式存储）
	short -- 小数用short
	long -- 大数用long
	double-- 高精度浮点数用double
	float--一般浮点数用float
*/

#include<stdio.h>

float total = 0.0;
short count = 0;
short tax_percent = 6;

float add_with_tax(float f)
{
	float tax_rate = 1+tax_percent / 100.0;
	total = total + (f+tax_rate);
	count = count +1;
	return total;
}

void main()
{
	float val;//存放用户输入的价格
	printf("Price of item:");
	while(scanf("%f",&val) == 1)  //scanf 函数成功调用后会返回读入的数的个数while(scanf("%d",&x)==1)
									//的意思就是一旦scanf函数读取成功，就继续读取，否则跳出循环
	{
		printf("Total so far:%.2f\n",add_with_tax(val));
		printf("Price of item:");
	}

	printf("\nFinal total:%.2f\n",total);
	printf("Number of items:%hi\n",count);//%i和%d都是表示有符号十进制整数区别在于，%i可以自动将输入的八进制（或者十六进制）转换为十进制，而%d则不会进行转换。

}
