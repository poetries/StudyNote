/*
要点：

  
*/

#include<stdio.h>
#include<stdlib.h
#include<time.h>

char* now()
{
	time_t t;
	time (&t);
	return asctime(localtime (&t));
}

void main()
{
	char commet[80];
	char cmd[120];
	fgets(commet,80,stdin)//用fgets读取非结构化文本 
}
