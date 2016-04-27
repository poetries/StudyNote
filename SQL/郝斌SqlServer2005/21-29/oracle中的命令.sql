create table student2
(
	stu_id int primary key,
	stu_sal int check (stu_sal>=1000 and stu_sal<=8000),
	stu_sex nchar(1) default ('男'),  --()可以省 在数据库中字符串是必须用''括起来的
	stu_name nvarchar2(200) unique 
)
insert into student2 values (4, 6000, '男', null);
insert into student2 values (5, 6000, '男', null);
select * from student2