select * from emp;


	



���������ߵ�ǰ����Ա�������е���Ϣ
	select top 3 * from emp order by sal desc; --������������ ��ִ��order by ��ִ��top 


���ʴӸߵ���������������ǵ�4-6��Ա����Ϣ
select top 3 *
	from emp
	where empno not in (select top 3 empno from emp order by sal desc)
	order by sal desc		


���ʴӸߵ���������������ǵ�7-9��Ա����Ϣ
select top 3 *
	from emp
	where empno not in (select top 6 empno from emp order by sal desc)
	order by sal desc	



���ʴӸߵ���������������ǵ�10-12��Ա����Ϣ
select top 3 *
	from emp
	where empno not in (select top 9 empno from emp order by sal desc)
	order by sal desc	

���ʴӸߵ���������������ǵ�13-15��Ա����Ϣ
select top 3 *
	from emp
	where empno not in (select top 12 empno from emp order by sal desc)
	order by sal desc	

�ܽ�
����ÿҳ��ʾn����¼����ǰҪ��ʾ���ǵ�mҳ
������A  ������A_id
select top n *
	from A
	where A_id not in (select top  (m-1)*n   A_id from emp)



1   0
2   3
3   6
4   9
5   12


