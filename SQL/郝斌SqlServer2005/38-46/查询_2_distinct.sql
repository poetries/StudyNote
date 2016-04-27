select deptno from emp; --14行记录 不是3行记录

select distinct deptno from emp;  --distince deptno 会过滤掉重复的deptno
select distinct comm from emp;  --distinct也可以过滤掉重复的null  或者说如果有多个null 只输出一个
select distinct comm, deptno from emp;--把comm和deptno的组合进行过滤 
select deptno, distinct comm from emp;--error 逻辑上有冲突

select 10000 from emp; --14行记录



