select top 5  from emp;

select * from emp where comm is not null

select ename, sal*12+comm from emp;

select ename, sal*12+isnull(comm, 0) "��н" from emp;
	--isnull(comm, 0) ���comm��null �ͷ����� ���򷵻�comm��ֵ