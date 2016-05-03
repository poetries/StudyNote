/*
要点：
1、在一些操作系统中，系统调用的代码位于操作系统内核，而对其他操作系统，系统调用可能保存在动态库中
2、内核是计算机中最重要的程序，他主管三样东西：进程（是存贮器中运行的程序）、存贮器、硬件
3、系统调用时操作系统中的函数，当进行系统调用时，相当于用你程序外面的代码
4、system()系统调用可以运行命令提示符 system()用起来方便 但也容易
5、exec()系统调用在运行程序时给了你更多控制权 exec()系统调用有很多版本
6、系统调用出错时通常会返回-1，但不是绝对的
7、系统调用在出错的同时将errno变量设为错误码
8、exec（）函数比system()提供了更多的控制权 exec()函数替换当前进程
9、fork()函数复制当前进程 fork() + exec() 创建子进程
10、
	execl() = 参数列表
	execle() = 参数列表+环境变量
	execlp() = 参数列表+搜素PATH
	execcv() = 参数数组
	execve() = 参数数组 + 环境变量
	execvp() = 参数数组 + 搜素PYTH
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
