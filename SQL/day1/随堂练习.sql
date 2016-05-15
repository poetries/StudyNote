create table dept
(
	dept_id int primary key,
	dept_name nvarchar(100) not null,
	dept_adress nvarchar(100)
)
create table emp
( 
	emp_id int constraint pk_emp_id_hahah primary key,
	emp_name nvarchar(20) not null,
	emp_sex nchar(1),
	dept_id int constraint fk_dept_id_heihei foreign key references dept(dept_id)
	-- 最后一个字段逗号可写可不写 最好不写 但是oracle必须不能写
)

create table student
(
	stu_id int primary key,
	stu_sal int check (stu_sal>=1000 and stu_sal<=8000),
	-- check 约束 保证事物属性的取值在合法范围内
)

-- 插入 数据
insert into student values (1,1000)
insert into student values(2,5000)
