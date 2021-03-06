//	匿名类

import java.awt.*;
import java.awt.event.*;

public class Testwindow
{
	public static void main(String[] args)
	{
		//包裹该匿名类的方法中的所有final类型的局部变量
		final Frame f = new Frame();
		f.setSize(300,300);
		
		//定义了一个实现抽象类中所有实现方法的对象
		//匿名类 凡是new出来的 不付给一个变量就匿名
		f.addWindowListener(
			new WindowAdapter()
			{
				public void  windowClosing(WindowEvent e) //把接口的抽象方法重写
				{
					f.setVisible(false);//匿名类方法不可以访问外部类中的局部变量（包裹该匿名类的方法中的所有）要在局部变量加上final才可以
					System.exit(-1);
				}
			}
		);
		
		f.setVisible(true);
	}
}





/*

		匿名类是一种特殊的内部类
		
		如果在一个方法内部定一个匿名类，则该匿名类可以访问：
			
			1、外部类的所有成员
			2、包裹该匿名类的方法中的所有final类型的局部变量
				注意：非final类型的局部边来给你无法被匿名类访问
				

				
				

*/
