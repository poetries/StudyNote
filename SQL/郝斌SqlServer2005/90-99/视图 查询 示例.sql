���ƽ��������ߵĲ��ŵı�źͲ��ŵ�ƽ������
select *
	from (
		select deptno, avg(sal) "avg_sal" 
			from emp 
			group by deptno	
	) "T"
	where "T"."avg_sal" = (
		select max("E"."avg_sal") from (
			select deptno, avg(sal) "avg_sal" 
				from emp 
				group by deptno
		) "E"
	)

create view v$_emp_1 
as
	select deptno, avg(sal) "avg_sal" 
		from emp 
		group by deptno

select * from  v$_emp_1
	where avg_sal  = (select max(avg_sal) from v$_emp_1) 




select deptno, avg(sal) "avg_sal" 
	from emp 
	group by deptno


select * from emp;

create view v$_emp2 
as
	select empno, ename, job, mgr, comm, deptno from emp

select * from v$_emp2	

--error
			create view v$_a
				as 
					select avg(sal) from emp;

			--ok
			create view v$_a
				as 
					select avg(sal) as "avg_sal" from emp;
create table tt
(
	�ֶ����� �������� ��
	�ֶ����� �������� ��
	�ֶ����� �������� ��
	...............
)

create view tt2
	as
		select...........