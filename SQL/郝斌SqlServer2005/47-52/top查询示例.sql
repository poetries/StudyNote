select * from emp;

select top 5 * from emp;
select top 15 percent * from emp; --�������3��������2��

--�ѹ�����1500��3000֮��(����1500��3000)��Ա���й�����ߵ�ǰ4���˵���Ϣ���
select top 4 * 
	from emp
	where sal between 1500 and 3000
	order by sal desc  --desc���� ��д��Ĭ��������