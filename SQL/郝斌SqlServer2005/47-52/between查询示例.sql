--查找工资在1500到3000之间(包括1500和3000)的所有的员工的信息
select * from emp 
	where sal>=1500 and sal<=3000
等价于
select * from emp 
	where sal between 1500 and 3000

--查找工资在小于1500或大于3000之间的所有的员工的信息
select * from emp 
	where sal<1500 or sal>3000
等价于
select * from emp 
	where sal not between 1500 and 3000
	
	