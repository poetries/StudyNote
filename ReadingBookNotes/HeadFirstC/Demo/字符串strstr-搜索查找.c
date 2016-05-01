/**
	总结：
	1、可以用char string[..][..]创建数组的数组
	2、第一组方括号用来访问外层数组，第二组方括号用来访问内层数组
	3、有了string.h 可以使用c标准库中的字符串处理函数
	4、字符串数组是 数组的数组
	
        strstr(a,b) 返回字符串b在字符串a中的地址
	strcpy()复制字符串
	strcmp()比较字符串
	strcat()链接字符串
	strchr用来在字字符串中找到某个字符的位置
	strlen()获取字符串的长度

*/

#include<stdio.h>
#include<string>

char tracks[][80] = {
		"I left my heart in Harvard Med School",
		"Netwark,Newark - a wonderful town",
		"Dancing with a Dork",
		"From here to maternity",
		"The girl from Iwo Jima",
	};

void find_track(char search_for[])
	{
		int i;
		for (i = 0; i < 5; i++)
		{
			if (strstr(tracks[i], search_for))  //原数组中字符和用户输入的进行对比查找
				printf("Track %i: %s\n", i, tracks[i]);
		}
	}


int main(void)
{
	char search_for[80];
	printf("Search for: ");
	//fgets(search_for,80,stdin);
	scanf("%s",search_for); //接受用户输入的字符保存在数组中
	find_track(search_for);

	return 0;
}
