create table student2
(
	student_id int primary key, --�����Ϊstudent_id��ֵ
	student_name nvarchar(200) not null 
)
select * from student2;
insert into student2 values (1, '����');
insert into student2 values (2, '����');
insert into student2 values (1, '����'); --error
insert into student2 values ( '����'); --error
insert into student2(student_name) values ('����');--error


create table student3
(
	student_id int primary key identity(100, 5), --�����Ϊstudent_id��ֵ
	student_name nvarchar(200) not null 
)
select * from student3
insert into student3 (student_name) values ('����');
insert into student3 values ('����') --ok 
delete from student3 where student_name = '����';
insert into student3 (student_name) values ('����');