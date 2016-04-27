create table dept
(
	dept_id int primary key,
	dept_name nvarchar(100) not null,
	dept_address nvarchar(100)
)

create table emp
(  --不能写成{
	emp_id int constraint pk_emp_id_hahaha primary key,
	emp_name nvarchar(20) not null,
	emp_sex nchar(1) ,
	dept_id int constraint fk_dept_id_heihei foreign key references  dept(dept_id),
)

create table ttt
(
	i int,
	j int
)

create table student
(
	stu_id int primary key,
	stu_sal int check (stu_sal>=1000 and stu_sal<=8000),
	stu_sex nchar(1) default ('男')  --()可以省 在数据库中字符串是必须用''括起来的
)

insert into student(stu_id, stu_sal) values (1, 1000);
insert into student values (2, 6000, '女');
insert into student values (3, 6000, '女');
insert into student values (4, 6000, '女');
insert into student values (3, 6000);


create table student2
(
	stu_id int primary key,
	stu_sal int check (stu_sal>=1000 and stu_sal<=8000),
	stu_sex nchar(1) default ('男'),  --()可以省 在数据库中字符串是必须用''括起来的
	stu_name nvarchar(200) unique 
)
insert into student2 values (1, 6000, '男', '张三');  --ok
insert into student2 values (2, 6000, '男', '张三'); --error 违反了唯一约束
insert into student2 values (3, 6000, '男', '李四');  --ok
insert into student2 values (null, 6000, '男', '王五'); --error 主键不能为null  出错的信息是“不能将值 NULL 插入列 'stu_id'”
insert into student2 values (4, 6000, '男', null); --ok 说明 唯一键允许为空
insert into student2 values (5, 6000, '男', null);


create table student3
(
	stu_id int primary key,
	stu_sal int check (stu_sal>=1000 and stu_sal<=8000),
	stu_sex nchar(1) default ('男'),  --()可以省 在数据库中字符串是必须用''括起来的
	stu_name nvarchar(200) unique not null --uniqe和not null 约束可以组合是用
)
insert into student2 values (3, 6000, '男', null);  --error 证明了: uniqe和not null 约束可以组合使用

