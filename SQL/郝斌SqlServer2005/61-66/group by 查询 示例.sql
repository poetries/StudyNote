use scott;
select * from emp;

--���ÿ�����ŵı�� �� �ò��ŵ�ƽ������
select deptno, avg(sal) as "����ƽ������" 	
	from emp 
	group by deptno 

-- �ж���������Ƿ���ȷ
select deptno, avg(sal) as "����ƽ������", ename
	from emp
	group by deptno 

-- �ж���������Ƿ���ȷ
select deptno, ename
	from emp
	group by deptno 


�ܽ᣺ ʹ����group by ֮�� select ��ֻ�ܳ��ַ�����������Ϣ�����ܳ������ڵ���ϸ��Ϣ



group by a, b ���÷�
--error
select deptno , job, sal
	from emp
	group by deptno, job

--error
select *
	from emp
	group by deptno, job

--ok
select deptno , job, avg(sal) 
	from emp
	group by deptno, job

--ok
select deptno , job, avg(sal) "ƽ������", count(*) "��������", sum(sal) "���ŵ��ܹ���", min(sal) "������͹���" 
	from emp
	group by deptno, job
	order by deptno
	

select comm, count(*) 
	from emp
	group by comm

select max(sal) from emp; --Ĭ�ϰ����е���Ϣ����һ��