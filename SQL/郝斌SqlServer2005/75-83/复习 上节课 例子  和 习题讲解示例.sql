内连接
--输出的行数肯定是dept表行数的倍数
select * from emp, dept 	where emp.deptno = 10

--输出的行数肯定是emp表行数的倍数 
select * from emp, dept  --7行
	where dept.deptno = 10  --过滤条件 不是连接条件

考虑如何把上面的sql语句用sql99来实现
--这样写不对
select *
	from emp
	join dept
	on emp.deptno = dept.deptno --也不对 on中指定的是连接条件 7行的连接条件是永远为真 
	having dept.deptno = 10 --error 因为having是对分组之后的过滤 这里没有分组 肯定出错

--这个sql语句和7行的sql语句输出结果是一模一样的
select *
	from emp
	join dept
	on 1=1 
	where dept.deptno = 10


--输出姓名不包含A的所有员工中工资最高的前三名的每个员工的姓名 工资 工资等级 部门名称

select top 3 "E".ename, "E".sal, "S".grade, "D".dname
	from emp "E"
	join dept "D"
	on "E".deptno = "D".deptno
	join salgrade "S"
	on "E".sal between "S".losal and "S".hisal
	where "E".ename not like '%A%'
	order by "E".sal desc


--输出部门名称不包含A的所有员工中工资最高的前三名的每个员工的姓名 工资 工资等级 部门名称
select top 3 "E".ename, "E".sal, "S".grade, "D".dname
	from emp "E"
	join dept "D"
	on "E".deptno = "D".deptno
	join salgrade "S"
	on "E".sal between "S".losal and "S".hisal
	where "D".dname not like '%A%'
	order by "E".sal desc





习题集
第一个习题
--求出每个员工的姓名 部门编号 薪水 和 薪水的等级
select "E".ename, "E".deptno, "E".sal, "S".grade
	from emp "E"
	join salgrade "S"
	on "E".sal >= "S".losal and "E".sal <= "S".hisal




第二个习题
--查找每个部门的编号 该部门所有员工的平均工资 平均工资的等级

select "T".deptno, "T"."avg_Sal" "部门平均工资", "S".grade "工资等级" 
	from (
		select deptno, avg(sal) as "avg_sal"
			from emp
			group by deptno
	) "T"
	join salgrade "S"
	on "T".avg_sal between "S".losal and "S".hisal

等价于

select "T".deptno, "T"."avg_Sal" "部门平均工资", "S".grade "工资等级" 
	from salgrade "S"
	join (
		select deptno, avg(sal) as "avg_sal"
			from emp
			group by deptno
	) "T"
	on "T".avg_sal between "S".losal and "S".hisal
等价于

select "T".deptno, "T"."avg_Sal" "部门平均工资", "S".grade "工资等级" 
	from salgrade "S", (
							select deptno, avg(sal) as "avg_sal"
								from emp
								group by deptno
						) "T"
	where "T".avg_sal between "S".losal and "S".hisal




	

第三个习题
查找每个部门的编号 部门名称 该部门所有员工的平均工资 平均工资的等级
select "T".deptno, "T"."avg_Sal" "部门平均工资", "S".grade "工资等级" , "D".dname "部门名称"
	from (
		select deptno, avg(sal) as "avg_sal"
			from emp
			group by deptno
	) "T"
	join salgrade "S"
	on "T".avg_sal between "S".losal and "S".hisal
	join dept "D"
	on "T".deptno = "D".deptno






第四个习题
求出emp表中所有领导的信息 
select * from emp
	where empno in (select mgr from emp)

思考题
求出emp表中所有非领导的信息
select * from emp
	where empno not in (select mgr from emp)

in与null的组合所带来的问题







第五个习题
求出平均薪水最高的部门的编号和部门的平均工资
--第一种写法
select top 1 deptno "部门的编号",avg(sal)"平均工资"
	from emp
	group by deptno
	order by avg(sal) desc


--第二种写法
select "E".*
	from (	
			select deptno, avg(sal) "avg_sal" 
				from emp 
				group by deptno 
		) "E"
	where "E"."avg_sal" = (
			select max("avg_sal") from (select deptno, avg(sal) "avg_sal" from emp group by deptno) "T"
	)








第六个习题
有一个人工资最低 把这个人排除掉
剩下的人中工资最低的前3个人的姓名 工资 部门编号 部门名称 工资等级 输出		
select top 3 "T".ename, "T".sal, "T".deptno, "D".dname, "S".grade
	from (
		select *
			from emp "E"  --153行
			where sal > ( select min(sal) from emp )
	) "T"  --这里的"E"与153行的"E"是没有冲突的，因为范围不一样
	join dept "D"
	on "T".deptno = "D".deptno
	join salgrade "S"
	on "T".sal between "S".losal and "S".hisal
	order by "T".sal asc

