create table dept
(
	dept_id int primary key,
	dept_name nvarchar(100) not null,
	dept_adress nvarchar(100)
)
create table emp
( 
  -- constraint  约束
	emp_id int constraint pk_emp_id_hahah primary key,
	emp_name nvarchar(20) not null,
	emp_sex nchar(1),
	dept_id int constraint fk_dept_id_heihei foreign key references dept(dept_id)
	-- 最后一个字段逗号可写可不写 最好不写 但是oracle必须不能写
)

