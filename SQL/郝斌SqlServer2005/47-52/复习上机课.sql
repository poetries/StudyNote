select * from emp;
select ename from emp;
select ename, * from emp;  --ok ������Oracle11G�л������˲���������д  
select ename as "����", sal from emp;
select ename, 15 from emp;
select 15 from emp; --14��
select 15;  --���Ƽ�
select distinct deptno, comm from emp; -- ok ��deptno��comm����ϲ��ظ������
select distinct comm from emp; --ok 
select deptno, distinct comm from emp; --error
