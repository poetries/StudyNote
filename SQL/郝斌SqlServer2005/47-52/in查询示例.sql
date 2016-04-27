select * from emp where sal in (1500, 3000, 5000)
等价于
select * from emp 
	where sal=1500 or sal=3000 or sal=5000

select * from emp where sal not in (1500, 3000, 5000) --把sal既不是1500 也不是3000也不是5000的记录输出
等价于
select * from emp 
	where sal<>1500 and sal<>3000 and sal<>5000
		--数据库中不等于有两种表示：  !=    <>   推荐使用第二种
		--对或取反是并且  对并且取反是或



	