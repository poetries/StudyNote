大纲：

为什么需要容器：
	
	数组存在两个缺陷
	数组中元素类型必须相同
	
	容器可以弥补数组的这两个缺陷
	
	举例：假设A是个类名 A[] arr = new A[10]

		  表示分配了一个数组，数组的每一个元素的都是A类对象的引用，但是如果想扩充数组的长度，比如希望数组的长度变成15，我们不能直接在原数组内存的后面追加内存的，必须得另外分配长度为15的内存空间，然后利用System.arraycopy()方法把源数组的内存拷贝到新内存中，很明显，这即耗时耗内存
	
	所以一旦数组内存已分配，你想改变数组的长度，效率就会变得很低	

容器与现实的对应关系：

		数学上，集合类型可以归纳为三种
		
			集（set）
					set集合中不区分元素的顺序，不允许出现重复的元素
			
			列表（List）
					注意List不是链表的意思，而是表示线性结构
					List集合区分元素的顺序，且允许包含重复元素
			
				ArrayList与LinkList比较：
					
					ArrayList与LinkList都实现了List接口中的方法，但两者内部实现不同
					
					ArrayList存取速度快，插入删除慢
					LinkedList存取速度慢，插入删除速度快
					
					
				
			映射（Map）
					映射中保存承兑的“键--值”，映射中不能包含重复的键
					
			java设计了三个接口来对应数学上的三种集合类型 这三种接口名字是：set List Map
			
	
容器的分类和使用
	Collection
		set
		List
		
	Map（没有add（）方法）：
	
		Map接口：
	
			java.util.Map 接口描述了映射结构，Map结构允许以键集、集合或值映射关系的形式查看某个映射的内容
	
		主要方法：
		
			object put(Object key,Object value)
			Object get(Object key)
			boolean isEmpty()
			void clear()
			int size()
			boolean containsKey(Object key)
			boolean containsValue(Object value)
	

	
Collections类

Comparable接口

Iterator接口
