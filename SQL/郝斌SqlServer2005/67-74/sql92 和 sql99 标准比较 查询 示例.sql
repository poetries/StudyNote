--�ѹ��ʴ���2000��Ա���������Ͳ��ŵ�������� 
--sql92��ʵ�ַ�ʽ
select "E".ename, "D".dname
	from emp "E", dept "D"
	where "E".sal > 2000 and "E".deptno = "D".deptno

--sql99��ʵ�ַ�ʽ	  
select "E".ename, "D".dname
	from emp "E"
	join dept "D"
	on "E".deptno = "D".deptno
	where "E".sal > 2000




--�ѹ��ʴ���2000��Ա���������Ͳ��ŵ�������� �� ���ʵĵȼ� 
--sql99��׼ ���Ե�����sql92
select "E".ename, "D".dname, "S".grade
	from emp "E"
	join dept "D"
	on "E".deptno = "D".deptno
	join salgrade "S"
	on "E".sal>= "S".losal and "E".sal <= "S".hisal
	where "E".sal > 2000

--�ѹ��ʴ���2000��Ա���������Ͳ��ŵ�������� �� ���ʵĵȼ� 
--sql92��׼
select "E".ename, "D".dname, "S".grade
	from emp "E", dept "D", salgrade "S"
	where "E".sal > 2000  and  "E".deptno = "D".deptno and ("E".sal>= "S".losal and "E".sal <= "S".hisal)






--�������350�� 14�� �����ǳ˻� ������֮��
select *
	from emp "E"
	join dept "D"
	on 1=1
	join salgrade "S"
	on 1=1


select "E".ename, "D".dname, "S".grade
	from emp "E"
	where "E".sal > 2000 --error where����ж��join��ǰ�� ԭ�򲻵ö�֪	
	join dept "D"
	on "E".deptno = "D".deptno
	join salgrade "S"
	on "E".sal>= "S".losal and "E".sal <= "S".hisal
	