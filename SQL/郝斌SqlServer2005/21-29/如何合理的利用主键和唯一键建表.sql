drop table student4; --É¾³ýstudent4

create table student4
(
	stu_id int primary key,
	stu_name nvarchar(50) unique not null,
	stu_email nvarchar(50) not null unique,
	stu_address nvarchar(50) 
)