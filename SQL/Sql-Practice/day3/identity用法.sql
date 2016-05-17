create table student2
(
	student_id int primary key, --必须的为student_id赋值
	student_name nvarchar(200) not null 
)
select * from student2;
insert into student2 values (1, '张三');
insert into student2 values (2, '李四');
insert into student2 values (1, '张三'); --error
insert into student2 values ( '张三'); --error
insert into student2(student_name) values ('张三');--error


create table student3
(
	student_id int primary key identity(100, 5), --必须的为student_id赋值  没有指定的话默认从1开始递增 从100开始 每次递增5
	student_name nvarchar(200) not null 
)
select * from student3
insert into student3 (student_name) values ('张三');
insert into student3 values ('李四') --ok 
delete from student3 where student_name = '李四';
insert into student3 (student_name) values ('王五');
