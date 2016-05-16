--输出部门平均工资大于2000的部门的部门编号 部门的平均工资
select deptno, avg(sal)
	from emp
	group by deptno
	having avg(sal) > 2000


--判断下列sql语句是否正确
select deptno, avg(sal) as "平均工资"
	from emp
	group by deptno
	having avg(sal) > 2000


--判断下列sql语句是否正确
select deptno, avg(sal) as "平均工资"
	from emp
	group by deptno
	having "平均工资" > 2000

--判断下列sql语句是否正确
select deptno "部门编号", avg(sal) as "平均工资"
	from emp
	group by deptno
	having deptno > 1


--判断下列sql语句是否正确
select deptno "部门编号", avg(sal) as "平均工资"
	from emp
	group by deptno
	having "部门编号" > 1



--判断下列sql语句是否正确
select deptno, avg(sal) as "平均工资"
	from emp
	group by deptno
	having  deptno > 10


--判断下列sql语句是否正确
select deptno, avg(sal) as "平均工资"
	from emp
	group by deptno
	having count(*) > 3

--判断下列sql语句是否正确
select deptno, avg(sal) as "平均工资"
	from emp
	group by deptno
	having ename like '%A%'







--把姓名不包含A的所有的员工按部门编号分组，
--统计输出部门平均工资大于2000的部门的部门编号 部门的平均工资
select deptno, avg(sal) "平均工资"
	from emp
	where ename not like '%A%'
	group by deptno
	having avg(sal) > 2000

--把工资大于2000，
--统计输出部门平均工资大于3000的部门的部门编号 部门的平均工资
select deptno, avg(sal) "平均工资", count(*) "部门人数", max(sal) "部门的最高工资"
	from emp
	where sal > 2000  --where是对原始的记录过滤
	group by deptno
	having avg(sal) > 3000  --对分组之后的记录过滤



--判断入选语句是否正确
select deptno, avg(sal) "平均工资", count(*) "部门人数", max(sal) "部门的最高工资"
	from emp	
	group by deptno
	having avg(sal) > 3000  --对分组之后的记录过滤
	where sal > 2000  --where是对原始的记录过滤

总计： 所有select的参数的顺序是不允许变化的，否则编译时出错 




select * from emp;



select count(*) 
	from emp 
	having avg(sal) > 1000



select ename, sal "工资" 
	from emp
	where sal > 2000

select ename, sal "工资" 
	from emp
	where "工资"  > 2000



select deptno, avg(sal) "平均工资", count(*) "部门人数", max(sal) "部门的最高工资"
	into emp_2
	from emp
	where sal > 2000  --where是对原始的记录过滤
	group by deptno
	having avg(sal) > 3000  --对分组之后的记录过滤

select * from emp_2
--输出部门平均工资大于2000的部门的部门编号 部门的平均工资
select deptno, avg(sal)
	from emp
	group by deptno
	having avg(sal) > 2000


--判断下列sql语句是否正确
select deptno, avg(sal) as "平均工资"
	from emp
	group by deptno
	having avg(sal) > 2000


--判断下列sql语句是否正确
select deptno, avg(sal) as "平均工资"
	from emp
	group by deptno
	having "平均工资" > 2000

--判断下列sql语句是否正确
select deptno "部门编号", avg(sal) as "平均工资"
	from emp
	group by deptno
	having deptno > 1


--判断下列sql语句是否正确
select deptno "部门编号", avg(sal) as "平均工资"
	from emp
	group by deptno
	having "部门编号" > 1



--判断下列sql语句是否正确
select deptno, avg(sal) as "平均工资"
	from emp
	group by deptno
	having  deptno > 10


--判断下列sql语句是否正确
select deptno, avg(sal) as "平均工资"
	from emp
	group by deptno
	having count(*) > 3

--判断下列sql语句是否正确
select deptno, avg(sal) as "平均工资"
	from emp
	group by deptno
	having ename like '%A%'







--把姓名不包含A的所有的员工按部门编号分组，
--统计输出部门平均工资大于2000的部门的部门编号 部门的平均工资
select deptno, avg(sal) "平均工资"
	from emp
	where ename not like '%A%'
	group by deptno
	having avg(sal) > 2000

--把工资大于2000，
--统计输出部门平均工资大于3000的部门的部门编号 部门的平均工资
select deptno, avg(sal) "平均工资", count(*) "部门人数", max(sal) "部门的最高工资"
	from emp
	where sal > 2000  --where是对原始的记录过滤
	group by deptno
	having avg(sal) > 3000  --对分组之后的记录过滤



--判断入选语句是否正确
select deptno, avg(sal) "平均工资", count(*) "部门人数", max(sal) "部门的最高工资"
	from emp	
	group by deptno
	having avg(sal) > 3000  --对分组之后的记录过滤
	where sal > 2000  --where是对原始的记录过滤

总计： 所有select的参数的顺序是不允许变化的，否则编译时出错 




select * from emp;



select count(*) 
	from emp 
	having avg(sal) > 1000



select ename, sal "工资" 
	from emp
	where sal > 2000

select ename, sal "工资" 
	from emp
	where "工资"  > 2000



select deptno, avg(sal) "平均工资", count(*) "部门人数", max(sal) "部门的最高工资"
	into emp_2
	from emp
	where sal > 2000  --where是对原始的记录过滤
	group by deptno
	having avg(sal) > 3000  --对分组之后的记录过滤

select * from emp_2
