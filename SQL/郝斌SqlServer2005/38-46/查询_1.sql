select * from emp;
	-- * 表示所有的
	-- from emp 表示从emp表查询

select empno, ename from emp;

select ename, sal from emp;

select ename, sal*12 as "年薪" from emp;
		--as 可以省略 记住: "年薪" 不要写成'年薪' 也不要写成 年薪

select ename, sal*12 as "年薪", sal "月薪", job from emp;

select 888 from emp;
	--ok
	--输出的行数是emp表的行数  每行只有一个字段，值是888

select 5;  --ok 
		   --不推荐	


