-- 多对多必须通过单独的一张表来表示

-- 多对多关系表  班级是一张表 老师一张表 班级和老师的关系也是一张表

-- 第一张表 班级表

create table banji  --表名称不要使用复数 一般写单数
(
	banji_id int primary key,
	banji_num int not null,
	banji_name nvarchar(100),
)

--第二张表 教师表

create table teacher
(
	teacher_id int primary key,
	teacher_name nvarchar(200)
)

--第三张表 有两列是外键来自不同的表主键 用来模拟班级和教师之间的关系

create table banji_teacher_mapping
(	
	--外键可以有多个 主键只能有一个

	--constraint 约束 fk_banji_id约束的名字 约束的名字可以省略
	banji_id int constraint fk_banji_id foreign key references banji(banji_id),
	teacher_id int foreign key references teacher(teacher_id),
	kecheng nvarchar(20),
	--pk_banji_id_teacher_id主键约束
	constraint pk_banji_id_teacher_id primary key(banji_id,teacher_id,kecheng)--constraint约束  把班级id和教师id 充当主键
	
	
)

--删除表
drop table banji_teacher_mapping

