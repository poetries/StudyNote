select "E".ename "Ա������", "D".dname "��������"
	from emp "E"
	join dept "D"
	on "E".deptno = "D".deptno


1.
	select ... from A, B���÷�
--emp��14�� 8 ��  dept��5�� 3��
select * from emp, dept

2. 
	select ... from A, B where ... ���÷�
--���5�� 11��
select * 
	from emp, dept 
	where empno = 7369

3. 
	select ... from A join B on ... ���÷�
--���11�� 70��
select *
	from emp "E"
	join dept "D"  --join������
	on 1=1  --on��������

--���2�� 70��
select "E".ename "Ա������", "D".dname "��������"
	from emp "E"
	join dept "D"  --join������
	on 1=1  --on��������  on����ʡ ��join�ͱ�����on

--�ж���������Ƿ���ȷ
select deptno
	from emp "E"
	join dept "D"  --join������
	on 1=1 

--�ж���������Ƿ���ȷ
select "���ű�".deptno "���ű��"
	from emp "Ա����"
	join dept "���ű�"  --join������
	on 1=1 


--��������������������ʲô
--�𰸣� 14�� 11��
select *
	from emp "E"
	join dept "D"  --join������
	on "E".deptno = "D".deptno

--��������������������ʲô
--�𰸣�14�� 2��
select "E".ename "Ա������", "D".dname "��������"
	from emp "E"
	join dept "D"  --join������
	on "E".deptno = "D".deptno








select * 
	from emp, dept
	where emp.deptno = dept.deptno

�ȼ���
select * from emp
	join dept
	on emp.deptno = dept.deptno





	

	