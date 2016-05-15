--最前面的若干个记录 专属于sql的语法 不可移植到其他按数据库
select * from emp;

select top 5 * from emp;
select top 15 percent * from emp; --输出的是3个，不是2个

--把工资在1500到3000之间(包括1500和3000)的员工中工资最高的前4个人的信息输出
select top 4 * 
	from emp
	where sal between 1500 and 3000
	order by sal desc  --desc降序 不写则默认是升序
