用聚合函数 求薪水最高的员工的信息
select * from emp where sal = (select max(sal) from emp)



不准用聚合函数 求薪水最高的员工的信息
select * from emp
	where empno not in (
		select distinct "E1".empno 
			from emp "E1"
			join emp "E2" 
			on "E1".sal< "E2".sal
	)






