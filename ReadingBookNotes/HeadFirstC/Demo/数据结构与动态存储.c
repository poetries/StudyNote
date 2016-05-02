/*



*/


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
