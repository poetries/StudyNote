//异常的范围

/*
	子类覆盖了基类方法时：
	子类方法抛出异常的范围不能大于基类方法抛出的异常范围
	子类方法可以不抛出异常，也可以只抛出某类方法的部分异常
	但不可以抛出基类方法以外的异常

*/

//自定义异常A
class A extends Exception
{
	
}

//自定义异常B
class B extends Exception
{
	
}

//自定义异常Ｃ
class C extends Exception
{
	
}

class M 
{
	void f() throws A,B 
	{
		
	}
}

/*
	子类覆盖了基类方法时：
	子类方法抛出异常的范围不能大于基类方法抛出的异常范围
	子类方法可以不抛出异常，也可以只抛出某类方法的部分异常
	但不可以抛出基类方法以外的异常

*/

//子类M重写父类M的方法 抛出的异常范围？
class N extends M //这里的问题是N抛出的异常范围比A，B大还是比A，B小
{
	void f() throws A,B //可以throws A或B 也可以throws A,B 也可以不throws
	{
		
	}
}


//多态
class Test 
{
	public void k(M mm)
	{
		try
		{
			mm.f();
		}
		catch(B aa)//先捕获子类的异常
		{
			
		}
		catch(A bb)//在捕获父类的异常 不能倒过来
		{
			
		}
		
	}
}

class TestExcep_10
{
	public static void main(String[] args)
	{
		M m = new M();
		N n = new N();
	}
}

/*
	总结：
	
		1、所有的catch只能有一个被执行
		
		2、有可能所有的catch都没执行
		
		3、先catch子类异常在catch父类异常
			如果先catch父类异常在catch子类异常 则编译报错
			
		4、catch与catch之间是不能有其他代码的
		
		5、重写方法抛出异常的范围不能大于被重写方法排除的异常范围
		
		
		
	异常优点：

		1、常规方法处理错误存在的异常
		
				1、观察常规程序，大部分都花在了出错处理上
				2、只把能够想到的错误考虑到，对以外的情况无法处理
				3、程序可读性较差
				4、出错返回信息量太少，无法更切的了解错误状况或原因
		
		2、异常的优点
		
		//用异常形式处理错误
		
		//最标准的写法每个语句都写一个try catch 
		
		try
		{
			openTheFile;
			determine its size;
			allocate that much memory;
			read-File;
			closeTheFile;
		}
		
		catch(fileopenTailed){dosomething}
		catch(sizeDetermineFailed){dosomething}
		catch(memoryAllocateFailed){dosomething}
		catch(readFailed){dosomething}
		catch(fileCloseFailed){dosomething}
		finally{dosomething}
		
		
		3、异常的优缺点
		
		优点：
			1、强制了程序员考虑程序的安全性与健壮性
			2、增强了陈谷西亚UN对程序的可控性
			3、有利于代码的调试
			4、把错误处理代码从常规代码中分离出来
			
		注意：
			1、异常并不一定能够使程序逻辑更清晰
					因为有时我们必须得编写代码捕捉异常，所以可能会导致程序的逻辑非常混乱
			
			2、异常并不能解决所有问题
		
		
*/
