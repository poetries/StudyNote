/*
要点：

  
*/

#include<stdio.h>
#include<stdlib.h>
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
	fgets(commet,80,stdin);//用fgets读取非结构化文本  80只有80个字符的空间 stdin从标准输入（也就是键盘读取数据）
	sprintf(cmd,"echo %s %s" >> reports.log",commet,now());//sprintf()把字符写到字符串中 cmd格式化字符串保留在cmd数组中 commet注释先出现 now()时间戳后出现 echo %s %s" >> reports.log命令把注释追加到文件底部
	system(cmd);
}
