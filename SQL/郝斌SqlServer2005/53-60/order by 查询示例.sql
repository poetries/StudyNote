--asc���������˼ Ĭ�Ͽ��Բ�д  desc�ǽ���

select * from emp order by sal; --Ĭ���ǰ�����������
select * from emp order by deptno, sal; --�Ȱ���deptno�����������deptno��ͬ���ٰ���sal��������

select * from emp order by deptno desc, sal;
	--�Ȱ�deptno�������� ���deptno��ͬ �ٰ���sal��������
	--��סsal�������ǽ���
	--order by a desc, b, c, d    descֻ��a����Ӱ�� ����Ժ����b  c d ����Ӱ��

select * from emp order by deptno, sal desc
	--���⣺desc�Ƿ���deptno����Ӱ��?
	--�𰸣�����
	--�Ȱ�deptno�������deptno��ͬ���ٰ�sal����
	