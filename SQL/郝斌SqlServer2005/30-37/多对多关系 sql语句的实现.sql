--班级表
create table banji
(
	banji_id int primary key,
	banji_num int not null,
	banji_name nvarchar(100)
)

--教师
create table jiaoshi
(
	jiaoshi_id int primary key,
	jiaoshi_name nvarchar(200)
)

--第三张表 用来模拟班级和教师的关系
create table banji_jiaoshi_mapping
(
	banji_id int constraint fk_banji_id foreign key references banji(banji_id),
	jiaoshi_id int foreign key references jiaoshi(jiaoshi_id),
	kecheng nvarchar(20),
	constraint pk_banji_id_jiaoshi_id primary key (banji_id, jiaoshi_id, kecheng)
)



--删除表
drop table banji_jiaoshi_mapping
