select top 5  from emp;

select * from emp where comm is not null

select ename, sal*12+comm from emp;

select ename, sal*12+isnull(comm, 0) "年薪" from emp;
	--isnull(comm, 0) 如果comm是null 就返回零 否则返回comm的值