46 select deptno from emp;-- Scott表中 14行记录

select 1000 from emp;--Scott表中 14行记录

select distinct deptno from emp;--distinct deptno 会过滤重复的deptno

select distinct comm from emp;--也可以过滤重复的null 或者如果有多个null 只输出一个

select distinct comm,deptno from emp;--把comm和deptno的组合进行过滤

select deptno,distinct comm from emp;--error 逻辑上有冲突
