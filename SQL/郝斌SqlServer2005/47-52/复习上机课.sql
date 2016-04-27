select * from emp;
select ename from emp;
select ename, * from emp;  --ok 但是在Oracle11G中会出错，因此不建议这样写  
select ename as "姓名", sal from emp;
select ename, 15 from emp;
select 15 from emp; --14行
select 15;  --不推荐
select distinct deptno, comm from emp; -- ok 把deptno和comm的组合不重复的输出
select distinct comm from emp; --ok 
select deptno, distinct comm from emp; --error
