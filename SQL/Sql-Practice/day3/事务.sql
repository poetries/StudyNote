create table bank
(
	customerEname nvarchar(200),
	currentMoney money 
)
select * from bank;
delete from bank;

insert into bank values ('张三', 1000);
insert into bank values ('李四', 1);

alter table bank add constraint check_currentMoney check(currentMoney>=1)

update bank set currentMoney=currentMoney-1000 where customerEname='张三'
update bank set currentMoney=currentMoney+1000 where customerEname='李四'

begin transaction
declare @errorSum int
set @errorSum = 0
update bank set currentMoney=currentMoney-1000 
	where customerEname='张三'
set @errorSum = @errorSum + @@error
update bank set currentMoney=currentMoney+1000 
	where customerEname='李四'
set @errorSum = @errorSum + @@error
if (@errorSum <> 0)
	begin
		print '转账失败'
		rollback transaction
	end
else
	begin
		print '转账成功'
		commit transaction
	end
