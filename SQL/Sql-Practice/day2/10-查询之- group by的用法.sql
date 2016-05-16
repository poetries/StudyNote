use scott;
select * from emp;

--输出每个部门的编号 和 该部门的平均工资
select deptno, avg(sal) as "部门平均工资" 	
	from emp 
	group by deptno 

-- 判断下面语句是否正确
select deptno, avg(sal) as "部门平均工资", ename
	from emp
	group by deptno 

-- 判断下面语句是否正确
select deptno, ename
	from emp
	group by deptno 


总结： 使用了group by 之后 select 中只能出现分组后的整体信息，不能出现组内的详细信息



group by a, b 的用法
--error
select deptno , job, sal
	from emp
	group by deptno, job

--error
select *
	from emp
	group by deptno, job

--ok
select deptno , job, avg(sal) 
	from emp
	group by deptno, job

--ok
select deptno , job, avg(sal) "平均工资", count(*) "部门人数", sum(sal) "部门的总工资", min(sal) "部门最低工资" 
	from emp
	group by deptno, job
	order by deptno
	

select comm, count(*) 
	from emp
	group by comm

select max(sal) from emp; --默认把所有的信息当做一组
