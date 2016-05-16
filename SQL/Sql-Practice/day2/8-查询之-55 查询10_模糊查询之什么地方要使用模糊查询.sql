select * from emp 	where ename like '%A%'  --ename只要含有字母A就输出
select * from emp where ename like 'A%'  --ename只要首字母是A的就输出
select * from emp where ename like '%A'  --ename只要尾字母是A的就输出


select * from emp where ename like '_A%' --ename只要第二个字母是A的就输出
 

select * from emp where ename like '_[A-F]%' --把ename中第二个字符是A或B或C或D或E或F的记录输出 


select * from emp where ename like '_[^A-F]%' --把ename中第二个字符不是A也不是B也不是C也不是D也不是E也不是F的记录输出 




select * from emp where ename like '_[^A-F]%' --把ename中第二个字符不是A也不是B也不是C也不是D也不是E也不是F的记录输出 



create table student
(
	name varchar(20) null
	,age int
);


insert into student values ('张三', 88);
insert into student values ('Tom', 66);
insert into student values ('a_b', 22);
insert into student values ('c%d', 44);
insert into student values ('abc_fe', 56);
insert into student values ('haobin', 25);
insert into student values ('HaoBin', 88);
insert into student values ('c%', 66)
insert into student values ('long''s', 100)
select * from student;

select * from student where name like '%\%%' escape '\'  --把name中包含有%的输出 
select * from student where name like '%\_%' escape '\' --把name中包含有_的输出

