select * from emp;
	-- * ��ʾ���е�
	-- from emp ��ʾ��emp���ѯ

select empno, ename from emp;

select ename, sal from emp;

select ename, sal*12 as "��н" from emp;
		--as ����ʡ�� ��ס: "��н" ��Ҫд��'��н' Ҳ��Ҫд�� ��н

select ename, sal*12 as "��н", sal "��н", job from emp;

select 888 from emp;
	--ok
	--�����������emp�������  ÿ��ֻ��һ���ֶΣ�ֵ��888

select 5;  --ok 
		   --���Ƽ�	


