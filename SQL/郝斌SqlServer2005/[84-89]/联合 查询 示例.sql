
输出每个员工的姓名 工资 上司的姓名
select "E1".ename, "E1".sal,  "E2".ename "上司的姓名"
	from emp "E1"
	join emp "E2"
	on "E1".mgr = "E2".empno
union
select ename, sal, '已是最大老板' from emp where mgr is null

select * from emp;

