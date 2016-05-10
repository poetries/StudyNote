
/*
文本框相加实现简单的计算

	方法二：
	
	通过在B类中定义A类的属性，就可以达到在B类访问A类成员目的
	但是通过这种方式无法访问A类私有成员
	
	本方式既繁琐又有局限性，不推荐
	
*/

import java.awt.*;
import java.awt.event.*; //导入事件包

public class TestTextFile_2
{
	public static TextField tf1,tf2,tf3; //属性是静态的
	
	public static void main(String[] args)
	{
		TF tf = new TF(); //这里的tf是正在调用launch方法的对象
		tf.launch();//启动
		
	
	}
}

//设计监听类

class MyMonitor implements ActionListener//实现接口的方法 接口是特殊的抽象类
{
	
	private TF tf; //把下面this的地址发送给这里的tf tf指向了那个对象
	
	public MyMonitor(TF tf)
	{
		this.tf = tf;
	}
	
	public void actionPerformed(ActionEvent e)//方法接收这个事件
	{
		String str1 = tf.tf1.getText();//TestTextFile_1类中的静态属性tf1
		String str2 = tf.tf2.getText();
		
		int num1 = Integer.parseInt(str1);//转化为整型
		int num2 = Integer.parseInt(str2);
		
		int num3 = num1 + num2;
		
		tf.tf3.setText(num3+"");

	}
}	


//关闭窗口

class B extends WindowAdapter //e接收aa发送的事件
{
	public void  windowClosing(WindowEvent e) //把接口的抽象方法重写
	{
		System.exit(-1);
	}
}


class TF
{
	public TextField tf1,tf2,tf3; 
	
	public void launch()
	{
		
		tf1 = new TextField(30);
		tf2 = new TextField(30);
		tf3 = new TextField(30);
		Button bn = new Button("=");
		Label Lb = new Label("+");
		
		Frame f = new Frame("文本框相加");
		f.setLayout(new FlowLayout());//Frame 默认布局是BorderLayout 要改成流式布局
		
		f.add(tf1);
		f.add(Lb);
		f.add(tf2);
		f.add(bn);
		f.add(tf3);
		
		f.addWindowListener(new B());//关闭窗口
		
		bn.addActionListener(new MyMonitor(this)); //this是正在调用launch对象的地址
		
		f.pack();
		f.setVisible(true);//显示
		
	}
}


/**********************************************************************************************************************/

//复习

import java.awt.*;
import java.awt.event.*; //导入事件包

public class TestTextFile_3
{
	
	public static void main(String[] args)
	{
		new TF().launch();
		
	}
}

class TF
{
	public TextField tf1,tf2,tf3; //属性是静态的
	
	
	public void launch()
	{
		tf1 = new TextField(30);
		tf2 = new TextField(30);
		tf3 = new TextField(30);
		Button bn = new Button("=");
		Label Lb = new Label("+");
		
		Frame f = new Frame("文本框相加");
		f.setLayout(new FlowLayout());//Frame 默认布局是BorderLayout 要改成流式布局
		
		f.add(tf1);
		f.add(Lb);
		f.add(tf2);
		f.add(bn);
		f.add(tf3);
		
		MyMonitor mm = new MyMonitor(this);
		
		f.addWindowListener(mm);//关闭窗口
		
		bn.addActionListener(mm);//监听事件
		
		f.pack();
		f.setVisible(true);//显示
		
		
		
	}
}


//关闭窗口

/* class B extends WindowAdapter //e接收aa发送的事件
{
	public void  windowClosing(WindowEvent e) //把接口的抽象方法重写
	{
		System.exit(-1);
	}
} */

//设计监听类

//extends  必须写在implements前面 

class MyMonitor extends WindowAdapter implements ActionListener  //可以实现多个接口  extends WindowAdapter要写在前面
{
	//定义TF类的属性 这样能访问TF中的成员
	private TF  tf = null;//初始化
	
	public MyMonitor(TF tf)
	{
		this.tf = tf;
	}
	
	public void actionPerformed(ActionEvent e)//方法接收这个事件
	{
		int num1 = Integer.parseInt(tf.tf1.getText());
		int num2 = Integer.parseInt(tf.tf2.getText());
		
		int num3 = num1 + num2;
		tf.tf3.setText(num3+"");//转换为字符串
		
	
	}
	
	//把接口的抽象方法重写
	public void  windowClosing(WindowEvent e) 
	{
		System.exit(-1);
	}
	
}	
