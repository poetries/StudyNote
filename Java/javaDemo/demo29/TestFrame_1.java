
//有关Frame类中的使用方法1

import java.awt.*;

public class TestFrame_1
{
	public static void main(String[] args)
	{
		Frame f = new Frame("永宣");//造出f容器  按钮文字在标题栏
		//Button btn = new Button("连英");//按钮文字在中间
		
		//f.add(btn);//要显示按钮必须放在容器里面
		//f.setSize(200,200);
		//f.setLocation(50,300); //距离左边 距离上边位置
		f.setBounds(50,300,200,200);//上面两个的综合 setBounds(int x,int y,int width,int height)
		f.setVisible(true);//设置窗口是否可见
		
		f.setBackground(Color.RED);//必须注释Button btn = new Button("连英");f.add(btn);因为按钮默认扩充了整个屏幕 把背景色挡住；额
		
	}
}
