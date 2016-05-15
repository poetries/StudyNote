-- 查找工资在1500到3000之前的所有员工的信息
--查询中最关键的是顺序

select * from emp
	where sal>=1500 and sal<=3000
	
--等价于
select * from emp
	where sal between 1500 and 3000
	
--查找工资小于3000或大于3000的之间的所有员工的信息

select *from emp
	where sal<1500 or sal>3000
	
	--等价于
	
select *from emp
	where sal not between 1500 and 3000
	
