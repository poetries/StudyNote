emp
dept
salgrade

select * from emp, dept -- 70�� 11��
select * from dept, emp -- �������ȼ��� select * from emp, dept

select * from emp, dept where 1=1   --  70�� 11��  where��д�Ĺ�������ʵ���Ƕ�(emp, dept)�����ĵѿ�������ʱ�����
select * from emp, dept where empno = 7369 --5��
select * from emp, dept where deptno = 10; --error
select * from emp, dept where emp.deptno = 10;  --5�еı���
select * from emp, dept where dept.deptno = 10;  --14��


--������������ȼ���  select * from emp, dept where dept.deptno = 10; 
select *
	from emp
	join dept
	on 2=2
	where dept.deptno = 10;




--���70��11��
select *
	from emp
	join dept
	on 1=1
�ȼ���
select * from emp, dept
�ȼ���
select * from dept, emp
�ȼ���
select *
	from dept
	join emp
	on 1=1



--������������ʵ�ʺ���  �Լ�����д�Ƿ�ǡ��?
select * from emp
	join dept
	on emp.deptno = dept.deptno and emp.sal>2000  --on�мȿ���д�������� Ҳ����д�������� ���ǲ��Ƽ� Ӧ�÷ֿ�д on��ֻд�������� where��д��������
�ȼ���
select * from emp
	join dept
	on emp.deptno = dept.deptno 
	where emp.sal>2000
�ȼ���
select * from dept
	join emp
	on dept.deptno  = emp.deptno
	where emp.sal>2000
�ȼ���
select *
	from dept,emp
	where dept.deptno  = emp.deptno and emp.sal>2000


--error ��join�ͱ������on
select * from emp
	join dept




��ѯ��˳��
select top ....
	from A
	join B
	on ....
	join C
	on ....
	where ......
	group by ...
	having .....
	order by .....

--�ѹ��ʴ���1500�����е�Ա�������ŷ��� �Ѳ���ƽ�����ʴ���2000�����ǰ2���Ĳ��ŵı�� ���ŵ����� ����ƽ�����ʵĵȼ�
--��һ��д��
select "T".*, "D".dname, "S".grade
	from dept "D"
	join (
		select top 2 "E".deptno, avg(sal) "avg_sal"
			from emp "E"
			join dept "D"
			on "E".deptno = "D".deptno
			join salgrade "S"
			on "E".sal between "S".losal and "S".hisal
			where "E".sal > 1500
			group by "E".deptno
			having avg("E".sal) > 2000
			order by avg("E".sal) desc
	) "T"
	on "D".deptno = "T".deptno
	join salgrade "S"
	on "T"."avg_sal" between "S".losal and "S".hisal


--�ڶ���д��
select "T".*, "D".dname, "S".grade
	from dept "D"
	inner join (
		select top 2 deptno, avg(sal)  as "avg_sal"
			from emp 
			where sal > 1500
			group by deptno
			having avg(sal) > 2000
			order by "avg_sal" desc
	) "T"
	on "D".deptno = "T".deptno
	inner join salgrade "S"
	on "T"."avg_sal" between "S".losal and "S".hisal
	

	