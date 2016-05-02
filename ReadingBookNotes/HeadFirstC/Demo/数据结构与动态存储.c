/*

1、使用malloc()动态分配内存 malloc()函数分配空间并给出一个指向这块空间的指针 用这个指针访问数据 用完后 需要free()函数释放存储器
2、记住：在一个地方用了malloc()分配存储器，就应该在后面用free()释放它
3、可以用动态数据结构保存可变数量的数据项 可以很方便在链表这种数据结构中插入数据项
4、在C语言中动态数据结构通常用递归结构来定义  递归结构有一个或多个指向相同结构的指针
5、栈用来保存局部变量，它有计算机管理  
6、堆用来保存长期使用的数据，用malloc()分配堆空间
7、数据会一直留在堆上，直到free()释放它

*/

//使用栈 栈是存储器用来保存局部变量的区域，数据保存在局部变量中，一旦离开函数，变量就会消失
#include<stdio.h>

typedef struct island
{
	char *name;//岛屿名称
	char *opens;//营业时间
	char *closes;//关闭时间
	struct island *next;//定义一个指针 指向下一座岛屿
} island;

//显示岛与的信息

void display(island *p)
{
	for(;p!=NULL;p=p->next)
		printf("Name:%s\n open:%s-%s\n",p->name,p->opens,p->closes);
}

void main()
{
	island amity = {"Amity","09:00","17:00",NULL};
	island craggy = {"craggy","09:00","17:00",NULL};
	island isla_nublar = {"isla numblar","09:00","17:00",NULL};
	island shutter = {"shutter","09:00","17:00",NULL};
	
	//链接以上的岛屿
	amity.next = &craggy;
	craggy.next = &isla_nublar;
	isla_nublar.next = &shutter;

	//在Isla Nublar岛与shutter岛之间插入一次到skull的旅行

	//通过修改指针的值 就可以插入island

	island skull = {"skull","09:00","17:00",NULL};
	isla_nublar.next = &skull;
	skull.next = &shutter;

	display(&amity);
}

