select * from emp;
--�������ǿյ�Ա������Ϣ
select * from emp where comm <> null; --���Ϊ�� error
select * from emp where comm != null; --���Ϊ�� error


select * from emp where comm = null;--���Ϊ�� error
	--�ܽ᣺null���ܲ���<>  !=  =����

--null���Բ���is  not is
select * from emp where comm is null; --�������Ϊ�յ�Ա������Ϣ
select * from emp where comm is not null; --�������Ϊ�յ�Ա������Ϣ


--�κ����͵����ݶ�����Ϊnull
create table t1 (name nvarchar(20), cnt int, riqi datetime);  
insert into t1 values (null, null, null)
select * from t1;


select * from emp;
--���ÿ��Ա�������� ��н(�����˽���)  comm������һ��Ľ���
select empno, ename, sal*12+comm "��н" from emp;
	--������֤���ˣ�null���ܲ����κ��������� ��������ԶΪ��
	
 