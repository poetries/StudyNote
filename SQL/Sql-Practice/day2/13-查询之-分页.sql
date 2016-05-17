select * from emp;


	



输出工资最高的前三个员工的所有的信息
	select top 3 * from emp order by sal desc; --从输出结果来看 先执行order by 后执行top 


工资从高到低排序，输出工资是第4-6的员工信息
select top 3 *
	from emp
	where empno not in (select top 3 empno from emp order by sal desc)
	order by sal desc		


工资从高到低排序，输出工资是第7-9的员工信息
select top 3 *
	from emp
	where empno not in (select top 6 empno from emp order by sal desc)
	order by sal desc	



工资从高到低排序，输出工资是第10-12的员工信息
select top 3 *
	from emp
	where empno not in (select top 9 empno from emp order by sal desc)
	order by sal desc	

工资从高到低排序，输出工资是第13-15的员工信息
select top 3 *
	from emp
	where empno not in (select top 12 empno from emp order by sal desc)
	order by sal desc	

总结
假设每页显示n条记录，当前要显示的是第m页
表名是A  主键是A_id
select top n *
	from A
	where A_id not in (select top  (m-1)*n   A_id from emp)



1   0
2   3
3   6
4   9
5   12


