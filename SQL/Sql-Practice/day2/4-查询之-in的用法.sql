--in 属于若干个孤立的值

select * from emp where sal in (1500,3000,5000)

--等价于 

select * from emp
	where sal=1500 or sal=3000 or sal=5000
	
select * from emp 
	where sal not in (1500,3000,5000)--把sal既不是也不是sal的记录输出
	
--等价于
select * from emp 
	where sal<>1500 and sal<>3000 and sal<>5000
	
--对数据库中不等于有两种表示 ！=  <>  推荐使用<>
