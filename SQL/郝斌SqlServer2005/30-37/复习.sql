create table student5
(
	stu_id int primary key,
	stu_email nvarchar(200) not null,
	stu_name nvarchar(20) unique,
	stu_sal int check (stu_sal>=1000 and stu_sal<=8000),
	stu_sex nchar(1) default '��'
)
insert student5 values (1, 'hb.g@163.com', 'zhangsan', 5000); --error

select * from student5

insert student5 (stu_id, stu_email, stu_name, stu_sal) values (2, 'hb.g@163.com', 'zhangsan', 5000);


insert student5 (stu_id, stu_email, stu_sal) 
	values (3, 'hb.g@163.com', 5000);  --ok
	--��˵����stu_nameĬ����null Ҳ����˵���һ���ֶβ�дnull Ҳ����not null ��Ĭ����null ��Ĭ������Ϊ�� �û����Բ������ֶθ�ֵ