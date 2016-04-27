select "E".ename "员工姓名", "D".dname "部门名称"
	from emp "E"
	join dept "D"
	on "E".deptno = "D".deptno


1.
	select ... from A, B的用法
--emp是14行 8 列  dept是5行 3列
select * from emp, dept

2. 
	select ... from A, B where ... 的用法
--输出5行 11列
select * 
	from emp, dept 
	where empno = 7369

3. 
	select ... from A join B on ... 的用法
--输出11列 70行
select *
	from emp "E"
	join dept "D"  --join是连接
	on 1=1  --on连接条件

--输出2列 70行
select "E".ename "员工姓名", "D".dname "部门名称"
	from emp "E"
	join dept "D"  --join是连接
	on 1=1  --on连接条件  on不能省 有join就必须有on

--判断下面语句是否正确
select deptno
	from emp "E"
	join dept "D"  --join是连接
	on 1=1 

--判断下面语句是否正确
select "部门表".deptno "部门编号"
	from emp "员工表"
	join dept "部门表"  --join是连接
	on 1=1 


--考虑下面语句的输出结果是什么
--答案： 14行 11列
select *
	from emp "E"
	join dept "D"  --join是连接
	on "E".deptno = "D".deptno

--考虑下面语句的输出结果是什么
--答案：14行 2列
select "E".ename "员工姓名", "D".dname "部门名称"
	from emp "E"
	join dept "D"  --join是连接
	on "E".deptno = "D".deptno








select * 
	from emp, dept
	where emp.deptno = dept.deptno

等价于
select * from emp
	join dept
	on emp.deptno = dept.deptno





	

	