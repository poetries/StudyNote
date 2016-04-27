create table bank
(
	customerEname nvarchar(200),
	currentMoney money 
)
select * from bank;
delete from bank;

insert into bank values ('����', 1000);
insert into bank values ('����', 1);

alter table bank add constraint check_currentMoney check(currentMoney>=1)

update bank set currentMoney=currentMoney-1000 where customerEname='����'
update bank set currentMoney=currentMoney+1000 where customerEname='����'

begin transaction
declare @errorSum int
set @errorSum = 0
update bank set currentMoney=currentMoney-1000 
	where customerEname='����'
set @errorSum = @errorSum + @@error
update bank set currentMoney=currentMoney+1000 
	where customerEname='����'
set @errorSum = @errorSum + @@error
if (@errorSum <> 0)
	begin
		print 'ת��ʧ��'
		rollback transaction
	end
else
	begin
		print 'ת�˳ɹ�'
		commit transaction
	end