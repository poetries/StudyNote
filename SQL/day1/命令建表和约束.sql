create table dept
(
	dept_id int primary key,
	dept_name nvarchar(100) not null,
	dept_adress nvarchar(100)
)
create table emp
( 
	-- 主键约束 不允许重复元素 避免数据的冗余
	emp_id int constraint pk_emp_id_hahah primary key,
	emp_name nvarchar(20) not null,
	emp_sex nchar(1),
	-- 外键约束 通过外键约束从语法上保证了本事物所关联的其他事物是一定存在的
	dept_id int constraint fk_dept_id_heihei foreign key references dept(dept_id)
	--  最后一个字段逗号可写可不写 最好不写 但是oracle必须不能写
)

create table student
(
	stu_id int primary key,
	stu_sal int check (stu_sal>=1000 and stu_sal<=8000),
	-- check 约束 保证事物属性的取值在合法范围内
	
        -- 单引号表示的是字符串 双引号表示的额是某一个事物的名字
	 stu_sex nchar(1) default('男')--在数据库中字符串必须用单引号''括起来
	
	
	-- default约束  保证事物的属性一定会有一个值


)

-- 插入 数据
insert into student(stu_id,stu_sal) values (1,1000);
insert into student values(2,5000,'女');
insert into student values(3,5000,'女');
insert into student values(4,5000,'女');



-- 唯一约束 保证了事物的取值不允许重复，但允许其中有一列且有一列为空
create table student2
(
	stu_id int primary key,
	stu_sal int check (stu_sal>=1000 and stu_sal<=8000),
	stu_sex nchar(1) default('男'),
	stu_name nvarchar(20) unique
		
)

insert into student2 values(1,6000,'男','张三')
-- insert into student2 values(2,6000,'男','张三')--error 违反了唯一约束
insert into student2 values(3,6000,'男','李四')--ok
insert into student2 values(null,6000,'男','张三')--error 主键不能为空
insert into student2 values(4,6000,'男','null')--ok  唯一键允许为空



