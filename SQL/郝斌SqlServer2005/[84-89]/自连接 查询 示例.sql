�þۺϺ��� ��нˮ��ߵ�Ա������Ϣ
select * from emp where sal = (select max(sal) from emp)



��׼�þۺϺ��� ��нˮ��ߵ�Ա������Ϣ
select * from emp
	where empno not in (
		select distinct "E1".empno 
			from emp "E1"
			join emp "E2" 
			on "E1".sal< "E2".sal
	)






