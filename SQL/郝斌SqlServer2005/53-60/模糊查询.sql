select * from emp 	where ename like '%A%'  --enameֻҪ������ĸA�����
select * from emp where ename like 'A%'  --enameֻҪ����ĸ��A�ľ����
select * from emp where ename like '%A'  --enameֻҪβ��ĸ��A�ľ����


select * from emp where ename like '_A%' --enameֻҪ�ڶ�����ĸ��A�ľ����
 

select * from emp where ename like '_[A-F]%' --��ename�еڶ����ַ���A��B��C��D��E��F�ļ�¼��� 


select * from emp where ename like '_[^A-F]%' --��ename�еڶ����ַ�����AҲ����BҲ����CҲ����DҲ����EҲ����F�ļ�¼��� 




select * from emp where ename like '_[^A-F]%' --��ename�еڶ����ַ�����AҲ����BҲ����CҲ����DҲ����EҲ����F�ļ�¼��� 



create table student
(
	name varchar(20) null
	,age int
);


insert into student values ('����', 88);
insert into student values ('Tom', 66);
insert into student values ('a_b', 22);
insert into student values ('c%d', 44);
insert into student values ('abc_fe', 56);
insert into student values ('haobin', 25);
insert into student values ('HaoBin', 88);
insert into student values ('c%', 66)
insert into student values ('long''s', 100)
select * from student;

select * from student where name like '%\%%' escape '\'  --��name�а�����%����� 
select * from student where name like '%\_%' escape '\' --��name�а�����_�����

