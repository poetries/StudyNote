create table dept
(
	dept_id int primary key,
	dept_name nvarchar(100) not null,
	dept_address nvarchar(100)
)

create table emp
(  --����д��{
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
	stu_sex nchar(1) default ('��')  --()����ʡ �����ݿ����ַ����Ǳ�����''��������
)

insert into student(stu_id, stu_sal) values (1, 1000);
insert into student values (2, 6000, 'Ů');
insert into student values (3, 6000, 'Ů');
insert into student values (4, 6000, 'Ů');
insert into student values (3, 6000);


create table student2
(
	stu_id int primary key,
	stu_sal int check (stu_sal>=1000 and stu_sal<=8000),
	stu_sex nchar(1) default ('��'),  --()����ʡ �����ݿ����ַ����Ǳ�����''��������
	stu_name nvarchar(200) unique 
)
insert into student2 values (1, 6000, '��', '����');  --ok
insert into student2 values (2, 6000, '��', '����'); --error Υ����ΨһԼ��
insert into student2 values (3, 6000, '��', '����');  --ok
insert into student2 values (null, 6000, '��', '����'); --error ��������Ϊnull  �������Ϣ�ǡ����ܽ�ֵ NULL ������ 'stu_id'��
insert into student2 values (4, 6000, '��', null); --ok ˵�� Ψһ������Ϊ��
insert into student2 values (5, 6000, '��', null);


create table student3
(
	stu_id int primary key,
	stu_sal int check (stu_sal>=1000 and stu_sal<=8000),
	stu_sex nchar(1) default ('��'),  --()����ʡ �����ݿ����ַ����Ǳ�����''��������
	stu_name nvarchar(200) unique not null --uniqe��not null Լ�������������
)
insert into student2 values (3, 6000, '��', null);  --error ֤����: uniqe��not null Լ���������ʹ��

