import java.awt.*;
import java.awt.event.*;

class A implements ActionListener //事件监听
{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("今天很开心");
	}
}

class B extends WindowAdapter //e接收aa发送的事件
{
	public void  windowClosing(WindowEvent e) //把接口的抽象方法重写
	{
		System.exit(-1);
	}
}

public class TestButton
{
	public static void main(String[] args)
	{
		Frame f = new Frame();
		Button btn = new Button("OK");
		
		f.add(btn);
		A aa = new A();
		
		//当单击按钮时 btn会把事件封装成一个对象发送给aa
		btn.addActionListener(aa); //告诉事件源可以自动产生那类事件 btn按钮添加鼠标监听器
		
		f.pack();
		f.addWindowListener(new B()); //窗口事件 告诉事件源f可以做那个事件
		
		f.setVisible(true);
	}
}

/*
	事件处理步骤：
	
		假设事件为XXX
			
			1、向事件源注册某种事件的事件监听器对象 addXXXListener()
			
			2、设计好可以处理这种事件的监听器
				
				class 类名 implements XXXListener
				{
					重写XXXLIstener接口中的方法
				}
				
				说明：
					要想设计出能够处理XXX事件的监听器，只需要编写出实现了XXXLIstener接口的类就OK了，因为XXXLIstener接口中已经定义了可以处理XX事件的方法
					
		
	
	事件处理的相关概念：
	
		1、默认情况下事件源不会产生任何事件，程序员需要做两件事
		
			1、告诉事件源可以自动产生那类事件（即向事件源注册某种事件的事件监听器）
			
			2、设计好可以处理这种事件的事件监听器
			
			
		2、一旦完成了这两步操作，当用户对事件源进行操作时，事件源就会自动产生事件，事件源就会把产生的事件封装成一个事件对象，事件源就会把自动封装好的事件对象传递给事件监听器
		
		3、事件监听器收到事件源发过来的事件时，事件监听器就会自动调用相应的事件处理方法对该事件进行处理
		
		
	事件有哪些：
	
		java.awt.event 包中含有所有的事件
		
			常用的事件有：
			
				AcitonEvent 激活组件时发生的事件
				
				KeyEvent 操作键盘发生
				
				MouseEvent 操作鼠标发生
				
				WindowEvent 操作窗口发生
				
		一个事件源可以自动产生哪些事件？第三方软件会提示，不需要记忆
		
			
*/
