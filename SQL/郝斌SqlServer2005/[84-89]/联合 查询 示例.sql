
���ÿ��Ա�������� ���� ��˾������
select "E1".ename, "E1".sal,  "E2".ename "��˾������"
	from emp "E1"
	join emp "E2"
	on "E1".mgr = "E2".empno
union
select ename, sal, '��������ϰ�' from emp where mgr is null

select * from emp;

