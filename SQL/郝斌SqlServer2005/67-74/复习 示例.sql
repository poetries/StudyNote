--������ű�� ���ŵ�ƽ������
select deptno, avg(sal) "ƽ������"
	from emp
	group by deptno

--error
select *
	from emp
	group by deptno

--error ��Ϊjob��������ϸ��Ϣ
select deptno, avg(sal) "ƽ������", job
	from emp
	group by deptno

--ok
select deptno, avg(sal) "ƽ������", count(*), sum(sal)
	from emp
	group by deptno


--ok
select deptno, avg(sal) "ƽ������", count(*) "��������", sum(sal) "���Ź����ܺ�"
	from emp
	group by deptno
	having sum(sal) > 9000

--error where�Ӿ䲻Ӧ�ó��־ۺϺ���
select deptno, avg(sal) "ƽ������", count(*) "��������", sum(sal) "���Ź����ܺ�"
	from emp
	where avg(sal) > 2000  --error ��Ϊwhere�Ƕ�ԭʼ�����ݹ��� ����ʹ�þۺϺ��� ��Ϊ��û�з���
	group by deptno
	having sum(sal) > 5000

select deptno, job, count(*)
	from emp
	where sal > 1000
	group by deptno, job
	having count(*) > 1
	order by deptno desc 


	

group by

having