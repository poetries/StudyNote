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

	printf("\nFinal total:%.2\n",total);
	printf("Number of items:%hi\n",count);//%i和%d都是表示有符号十进制整数区别在于，%i可以自动将输入的八进制（或者十六进制）转换为十进制，而%d则不会进行转换。

}
