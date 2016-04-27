emp
dept
salgrade

select * from emp, dept -- 70行 11列
select * from dept, emp -- 输出结果等价于 select * from emp, dept

select * from emp, dept where 1=1   --  70行 11列  where中写的过滤条件实际是对(emp, dept)产生的笛卡尔积临时表过滤
select * from emp, dept where empno = 7369 --5行
select * from emp, dept where deptno = 10; --error
select * from emp, dept where emp.deptno = 10;  --5行的倍数
select * from emp, dept where dept.deptno = 10;  --14行


--本语句输出结果等价于  select * from emp, dept where dept.deptno = 10; 
select *
	from emp
	join dept
	on 2=2
	where dept.deptno = 10;




--输出70行11列
select *
	from emp
	join dept
	on 1=1
等价于
select * from emp, dept
等价于
select * from dept, emp
等价于
select *
	from dept
	join emp
	on 1=1



--考虑下面语句的实际含义  以及这样写是否恰当?
select * from emp
	join dept
	on emp.deptno = dept.deptno and emp.sal>2000  --on中既可以写连接条件 也可以写过滤条件 但是不推荐 应该分开写 on中只写连接条件 where中写过滤条件
等价于
select * from emp
	join dept
	on emp.deptno = dept.deptno 
	where emp.sal>2000
等价于
select * from dept
	join emp
	on dept.deptno  = emp.deptno
	where emp.sal>2000
等价于
select *
	from dept,emp
	where dept.deptno  = emp.deptno and emp.sal>2000


--error 有join就必须的有on
select * from emp
	join dept




查询的顺序
select top ....
	from A
	join B
	on ....
	join C
	on ....
	where ......
	group by ...
	having .....
	order by .....

--把工资大于1500的所有的员工按部门分组 把部门平均工资大于2000的最高前2个的部门的编号 部门的名称 部门平均工资的等级
--第一种写法
select "T".*, "D".dname, "S".grade
	from dept "D"
	join (
		select top 2 "E".deptno, avg(sal) "avg_sal"
			from emp "E"
			join dept "D"
			on "E".deptno = "D".deptno
			join salgrade "S"
			on "E".sal between "S".losal and "S".hisal
			where "E".sal > 1500
			group by "E".deptno
			having avg("E".sal) > 2000
			order by avg("E".sal) desc
	) "T"
	on "D".deptno = "T".deptno
	join salgrade "S"
	on "T"."avg_sal" between "S".losal and "S".hisal


--第二种写法
select "T".*, "D".dname, "S".grade
	from dept "D"
	inner join (
		select top 2 deptno, avg(sal)  as "avg_sal"
			from emp 
			where sal > 1500
			group by deptno
			having avg(sal) > 2000
			order by "avg_sal" desc
	) "T"
	on "D".deptno = "T".deptno
	inner join salgrade "S"
	on "T"."avg_sal" between "S".losal and "S".hisal
	

	