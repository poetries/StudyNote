//文本框相加实现简单的计算

/*
	方法三：内部类（强烈推荐）
	
	可以把内部类当作外部类的一个成员
	
*/

import java.awt.*;
import java.awt.event.*; //导入事件包

public class TestTextFile_3
{
	
	public static void main(String[] args)
	{
		new TF().launch();
		
	}
}

//MyMonitor是TF的内部类 在这个类中的可以直接访问tf1 tf2 tf3
//内部类的方法可以访问外部类的属性

class TF
{
	private TextField tf1,tf2,tf3; //属性是静态的
	
	
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
		
		MyMonitor mm = new MyMonitor();
		
		f.addWindowListener(mm);//关闭窗口
		
		bn.addActionListener(mm);//监听事件
		
		f.pack();
		f.setVisible(true);//显示

	}
	
		
	//设计监听类

	//extends  必须写在implements前面 

	class MyMonitor extends WindowAdapter implements ActionListener  //可以实现多个接口  extends WindowAdapter要写在前面
	{
		
		public void actionPerformed(ActionEvent e)//方法接收这个事件
		{
			int num1 = Integer.parseInt(tf1.getText());
			int num2 = Integer.parseInt(tf2.getText());
			
			int num3 = num1 + num2;
			tf3.setText(num3+"");//转换为字符串
			
		
		}
		
		//把接口的抽象方法重写
		public void  windowClosing(WindowEvent e) 
		{
			System.exit(-1);
		}
		
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

