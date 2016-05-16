--把工资大于2000的员工的姓名和部门的名称输出 
--sql92的实现方式
select "E".ename, "D".dname
	from emp "E", dept "D"
	where "E".sal > 2000 and "E".deptno = "D".deptno

--sql99的实现方式	  
select "E".ename, "D".dname
	from emp "E"
	join dept "D"
	on "E".deptno = "D".deptno
	where "E".sal > 2000




--把工资大于2000的员工的姓名和部门的名称输出 和 工资的等级 
--sql99标准 明显的优于sql92
select "E".ename, "D".dname, "S".grade
	from emp "E"
	join dept "D"
	on "E".deptno = "D".deptno
	join salgrade "S"
	on "E".sal>= "S".losal and "E".sal <= "S".hisal
	where "E".sal > 2000

--把工资大于2000的员工的姓名和部门的名称输出 和 工资的等级 
--sql92标准
select "E".ename, "D".dname, "S".grade
	from emp "E", dept "D", salgrade "S"
	where "E".sal > 2000  and  "E".deptno = "D".deptno and ("E".sal>= "S".losal and "E".sal <= "S".hisal)






--输出的是350行 14列 行数是乘积 列数是之和
select *
	from emp "E"
	join dept "D"
	on 1=1
	join salgrade "S"
	on 1=1


select "E".ename, "D".dname, "S".grade
	from emp "E"
	where "E".sal > 2000 --error where不能卸载join的前面 原因不得而知	
	join dept "D"
	on "E".deptno = "D".deptno
	join salgrade "S"
	on "E".sal>= "S".losal and "E".sal <= "S".hisal
	
