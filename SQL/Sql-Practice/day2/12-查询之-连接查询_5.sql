select top 3 "E".ename,"E".sal,"E".deptno,"D".dname,"S".grade
	from(
		select *
			from emp "E"
			where "E".sal>(select MIN(sal) from emp)
		)"E"
		join dept "D"
		on "E".deptno="D".deptno
		join SALGRADE "S"
		on "E".sal between "S".LOSAL and "S".HISAL
		order by "E".sal
		
		
		
		查询的顺序
		
		select top ...
		from A
		join B
		on ..
		where..
		group by...
		having...
		order by...
