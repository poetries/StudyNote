//文本框相加实现简单的计算

/*
	方法一：
	
	主函数代码过多
	程序逻辑混乱
	
	不推荐
	
*/
import java.awt.*;
import java.awt.event.*; //导入事件包

public class TestTextFile_1
{
	public static TextField tf1,tf2,tf3; //属性是静态的
	
	public static void main(String[] args)
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
		
		//f.addWindowListener(new B())
		
		bn.addActionListener(new MyMonitor());
		
		f.pack();
		f.setVisible(true);//显示
		
		
		
	}
}

//设计监听类

class MyMonitor implements ActionListener//实现接口的方法 接口是特殊的抽象类
{
	public void actionPerformed(ActionEvent e)//方法接收这个事件
	{
		//System.out.printf("哈哈哈\n");
		
		//调用TestTextFile_1类中的静态属性
		String str1 = TestTextFile_1.tf1.getText();//TestTextFile_1类中的静态属性tf1
		String str2 = TestTextFile_1.tf2.getText();
		
		int num1 = Integer.parseInt(str1);//转化为整型
		int num2 = Integer.parseInt(str2);
		
		int num3 = num1 + num2;
		
		Integer it = new Integer(num3);
		String  str3 = it.toString();
		
		TestTextFile_1.tf3.setText(str3);
	}
}	
