--�������ƽ�����ʴ���2000�Ĳ��ŵĲ��ű�� ���ŵ�ƽ������
select deptno, avg(sal)
	from emp
	group by deptno
	having avg(sal) > 2000


--�ж�����sql����Ƿ���ȷ
select deptno, avg(sal) as "ƽ������"
	from emp
	group by deptno
	having avg(sal) > 2000


--�ж�����sql����Ƿ���ȷ
select deptno, avg(sal) as "ƽ������"
	from emp
	group by deptno
	having "ƽ������" > 2000

--�ж�����sql����Ƿ���ȷ
select deptno "���ű��", avg(sal) as "ƽ������"
	from emp
	group by deptno
	having deptno > 1


--�ж�����sql����Ƿ���ȷ
select deptno "���ű��", avg(sal) as "ƽ������"
	from emp
	group by deptno
	having "���ű��" > 1



--�ж�����sql����Ƿ���ȷ
select deptno, avg(sal) as "ƽ������"
	from emp
	group by deptno
	having  deptno > 10


--�ж�����sql����Ƿ���ȷ
select deptno, avg(sal) as "ƽ������"
	from emp
	group by deptno
	having count(*) > 3

--�ж�����sql����Ƿ���ȷ
select deptno, avg(sal) as "ƽ������"
	from emp
	group by deptno
	having ename like '%A%'







--������������A�����е�Ա�������ű�ŷ��飬
--ͳ���������ƽ�����ʴ���2000�Ĳ��ŵĲ��ű�� ���ŵ�ƽ������
select deptno, avg(sal) "ƽ������"
	from emp
	where ename not like '%A%'
	group by deptno
	having avg(sal) > 2000

--�ѹ��ʴ���2000��
--ͳ���������ƽ�����ʴ���3000�Ĳ��ŵĲ��ű�� ���ŵ�ƽ������
select deptno, avg(sal) "ƽ������", count(*) "��������", max(sal) "���ŵ���߹���"
	from emp
	where sal > 2000  --where�Ƕ�ԭʼ�ļ�¼����
	group by deptno
	having avg(sal) > 3000  --�Է���֮��ļ�¼����



--�ж���ѡ����Ƿ���ȷ
select deptno, avg(sal) "ƽ������", count(*) "��������", max(sal) "���ŵ���߹���"
	from emp	
	group by deptno
	having avg(sal) > 3000  --�Է���֮��ļ�¼����
	where sal > 2000  --where�Ƕ�ԭʼ�ļ�¼����

�ܼƣ� ����select�Ĳ�����˳���ǲ�����仯�ģ��������ʱ���� 




select * from emp;



select count(*) 
	from emp 
	having avg(sal) > 1000



select ename, sal "����" 
	from emp
	where sal > 2000

select ename, sal "����" 
	from emp
	where "����"  > 2000



select deptno, avg(sal) "ƽ������", count(*) "��������", max(sal) "���ŵ���߹���"
	into emp_2
	from emp
	where sal > 2000  --where�Ƕ�ԭʼ�ļ�¼����
	group by deptno
	having avg(sal) > 3000  --�Է���֮��ļ�¼����

select * from emp_2
