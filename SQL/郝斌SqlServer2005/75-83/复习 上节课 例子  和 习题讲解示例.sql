������
--����������϶���dept�������ı���
select * from emp, dept 	where emp.deptno = 10

--����������϶���emp�������ı��� 
select * from emp, dept  --7��
	where dept.deptno = 10  --�������� ������������

������ΰ������sql�����sql99��ʵ��
--����д����
select *
	from emp
	join dept
	on emp.deptno = dept.deptno --Ҳ���� on��ָ�������������� 7�е�������������ԶΪ�� 
	having dept.deptno = 10 --error ��Ϊhaving�ǶԷ���֮��Ĺ��� ����û�з��� �϶�����

--���sql����7�е�sql�����������һģһ����
select *
	from emp
	join dept
	on 1=1 
	where dept.deptno = 10


--�������������A������Ա���й�����ߵ�ǰ������ÿ��Ա�������� ���� ���ʵȼ� ��������

select top 3 "E".ename, "E".sal, "S".grade, "D".dname
	from emp "E"
	join dept "D"
	on "E".deptno = "D".deptno
	join salgrade "S"
	on "E".sal between "S".losal and "S".hisal
	where "E".ename not like '%A%'
	order by "E".sal desc


--����������Ʋ�����A������Ա���й�����ߵ�ǰ������ÿ��Ա�������� ���� ���ʵȼ� ��������
select top 3 "E".ename, "E".sal, "S".grade, "D".dname
	from emp "E"
	join dept "D"
	on "E".deptno = "D".deptno
	join salgrade "S"
	on "E".sal between "S".losal and "S".hisal
	where "D".dname not like '%A%'
	order by "E".sal desc





ϰ�⼯
��һ��ϰ��
--���ÿ��Ա�������� ���ű�� нˮ �� нˮ�ĵȼ�
select "E".ename, "E".deptno, "E".sal, "S".grade
	from emp "E"
	join salgrade "S"
	on "E".sal >= "S".losal and "E".sal <= "S".hisal




�ڶ���ϰ��
--����ÿ�����ŵı�� �ò�������Ա����ƽ������ ƽ�����ʵĵȼ�

select "T".deptno, "T"."avg_Sal" "����ƽ������", "S".grade "���ʵȼ�" 
	from (
		select deptno, avg(sal) as "avg_sal"
			from emp
			group by deptno
	) "T"
	join salgrade "S"
	on "T".avg_sal between "S".losal and "S".hisal

�ȼ���

select "T".deptno, "T"."avg_Sal" "����ƽ������", "S".grade "���ʵȼ�" 
	from salgrade "S"
	join (
		select deptno, avg(sal) as "avg_sal"
			from emp
			group by deptno
	) "T"
	on "T".avg_sal between "S".losal and "S".hisal
�ȼ���

select "T".deptno, "T"."avg_Sal" "����ƽ������", "S".grade "���ʵȼ�" 
	from salgrade "S", (
							select deptno, avg(sal) as "avg_sal"
								from emp
								group by deptno
						) "T"
	where "T".avg_sal between "S".losal and "S".hisal




	

������ϰ��
����ÿ�����ŵı�� �������� �ò�������Ա����ƽ������ ƽ�����ʵĵȼ�
select "T".deptno, "T"."avg_Sal" "����ƽ������", "S".grade "���ʵȼ�" , "D".dname "��������"
	from (
		select deptno, avg(sal) as "avg_sal"
			from emp
			group by deptno
	) "T"
	join salgrade "S"
	on "T".avg_sal between "S".losal and "S".hisal
	join dept "D"
	on "T".deptno = "D".deptno






���ĸ�ϰ��
���emp���������쵼����Ϣ 
select * from emp
	where empno in (select mgr from emp)

˼����
���emp�������з��쵼����Ϣ
select * from emp
	where empno not in (select mgr from emp)

in��null�����������������







�����ϰ��
���ƽ��нˮ��ߵĲ��ŵı�źͲ��ŵ�ƽ������
--��һ��д��
select top 1 deptno "���ŵı��",avg(sal)"ƽ������"
	from emp
	group by deptno
	order by avg(sal) desc


--�ڶ���д��
select "E".*
	from (	
			select deptno, avg(sal) "avg_sal" 
				from emp 
				group by deptno 
		) "E"
	where "E"."avg_sal" = (
			select max("avg_sal") from (select deptno, avg(sal) "avg_sal" from emp group by deptno) "T"
	)








������ϰ��
��һ���˹������ ��������ų���
ʣ�µ����й�����͵�ǰ3���˵����� ���� ���ű�� �������� ���ʵȼ� ���		
select top 3 "T".ename, "T".sal, "T".deptno, "D".dname, "S".grade
	from (
		select *
			from emp "E"  --153��
			where sal > ( select min(sal) from emp )
	) "T"  --�����"E"��153�е�"E"��û�г�ͻ�ģ���Ϊ��Χ��һ��
	join dept "D"
	on "T".deptno = "D".deptno
	join salgrade "S"
	on "T".sal between "S".losal and "S".hisal
	order by "T".sal asc

