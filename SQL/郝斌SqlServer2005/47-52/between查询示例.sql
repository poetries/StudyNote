--���ҹ�����1500��3000֮��(����1500��3000)�����е�Ա������Ϣ
select * from emp 
	where sal>=1500 and sal<=3000
�ȼ���
select * from emp 
	where sal between 1500 and 3000

--���ҹ�����С��1500�����3000֮������е�Ա������Ϣ
select * from emp 
	where sal<1500 or sal>3000
�ȼ���
select * from emp 
	where sal not between 1500 and 3000
	
	