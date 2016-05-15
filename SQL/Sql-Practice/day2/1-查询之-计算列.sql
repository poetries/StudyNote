select * from emp; -- * 表示所有的  from emp 从emp表查询

select empno,ename from emp; --查询员工编号，姓名

select ename,sal*12 as "年薪",sal "月薪",job from emp --as可以省略 尽量写成双引号

select 5 from emp --输出的行数是emp表的行数 每行只有一个字段，值是5

select 5;--ok  不推荐



select * from emp; -- * 表示所有的  from emp 从emp表查询

select empno,ename from emp; --查询员工编号，姓名

select ename,sal*12 as "年薪",sal "月薪",job from emp --as可以省略 尽量写成双引号

select 5 from emp --输出的行数是emp表的行数 每行只有一个字段，值是5

select 5;--ok  不推荐



注意：

    在oracle中字段的别名不允许用单引号括起来
    但是sqlserver却允许
    为了兼容性 最好用双引号括起来，不要用单引号
