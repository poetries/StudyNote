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
