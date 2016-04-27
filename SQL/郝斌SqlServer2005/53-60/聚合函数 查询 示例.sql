select lower(ename) from emp; -- 最终返回的是14行 lower()是单行函数
select max(sal) from emp; --返回1行 max()是多行函数

select * from emp;

select count(*) from emp;  --返回emp表所有记录的个数
select count(deptno) from emp;  --返回值是14 这说明deptno重复的记录也被当做有效的记录
select count(distinct deptno) from emp; --返回值是3  统计deptno不重复的记录的个数
select count(comm) from emp; --返回值是4 这说明comm为null的记录不会被当做有效的记录


select max(sal) "最高工资", min(sal) "最低工资", count(*) "员工人数" from emp; --ok 


select max(sal), lower(ename) from emp;