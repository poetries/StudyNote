--输出部门编号 部门的平均工资
select deptno, avg(sal) "平均工资"
	from emp
	group by deptno

--error
select *
	from emp
	group by deptno

--error 因为job是组内详细信息
select deptno, avg(sal) "平均工资", job
	from emp
	group by deptno

--ok
select deptno, avg(sal) "平均工资", count(*), sum(sal)
	from emp
	group by deptno


--ok
select deptno, avg(sal) "平均工资", count(*) "部门人数", sum(sal) "部门工资总和"
	from emp
	group by deptno
	having sum(sal) > 9000

--error where子句不应该出现聚合函数
select deptno, avg(sal) "平均工资", count(*) "部门人数", sum(sal) "部门工资总和"
	from emp
	where avg(sal) > 2000  --error 因为where是对原始的数据过滤 不能使用聚合函数 因为还没有分组
	group by deptno
	having sum(sal) > 5000

select deptno, job, count(*)
	from emp
	where sal > 1000
	group by deptno, job
	having count(*) > 1
	order by deptno desc 


	

group by

having