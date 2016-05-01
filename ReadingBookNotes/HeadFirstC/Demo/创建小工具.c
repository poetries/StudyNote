/*
要点：
1、printf()函数把数据发送到标准输出 默认情况下 标准输出会发送到显示器 在命令行可以用> 将标准输出重定向到文件
2、scanf()从标准输入读取数据 默认情况下，标准输入从键盘读取数据 可以在命令行中用< 将标准输入重定向到文件
3、错误标准专门用来输出错误消息 可用2>重定向标准错误


4、main函数有两个版本，一个没有，一个有命令行main(int argc,char *argv[]) argc的值是用来记录数组中元素的个数 一个是参数的计数 
另一个是指针（参数字符串）数组

5、getopt函数帮助你处理命令行 选项 为了定义有效的选项 可以传给getopt()一个字符串 例如：ae:选项后面的冒号  
表示该选项需要接受一个参数 getopt()会用optarg变量记录选项参数


6、可以用 fopen("文件名",模式) 模式：r（读取） w（写入） a（追加） 三种   创建自己的数据流

*/

#include<stdio.h>

int main(void)
{
  float latitude;
  float longitude;
  char info[80];
  int started = 0;//设置初值位0表示假
  
  puts("data=[");
  while(scanf("%f,%f,%79[^\n]",&latitude,&longitude,info) == 3)
  {
	if(started)
		printf(",\n");
	else
		started = 1;
	if((latitude<-90.0) || (latitude>90.0))//判断经度和纬度是否在正确范围内
	{
//		printf("数据出错了:%f\n",latitude);//显示简单错误信息
		fprintf(stderr,"数据出错了:%f\n",latitude);//在标准错误中打印错误信息
		//printf()函数是fprintf()的一个特列 fprintf()可以让你把数据发送到哪里 可以让fprintf()把文本发送到stdout（标准输出） 也可以发送大错误输出
		
		return 2;//退出返回 并将错误信息置为2
	}
	if((latitude <-180.0)||(latitude>180.0))
	{
//		printf("数据出错了:%f\n",latitude);//显示简单错误信息
		fprintf(stderr,"数据出错了:%f\n",longitude);//在标准错误中打印错误信息
		return 2;//退出返回 并将错误信息置为2
	}
	printf("{latitude: %f,longitude: %f,info: %s}",latitude,longitude,info);
  }
  puts("\n]");

  return 0;
}

//用fprintf（）输出私密文件  这个程序可以传送私密消息

#include<stdio.h>

void main()
{
	char word[10];
	int i = 0;
	while(scanf("%9s",word) == 1)
	{
		i = i+1;
		if(i%2)
		   fprintf(stdout,"%s\n",word);
		else
		   fprintf(stderr,"%s\n",word);
	}
	
}
