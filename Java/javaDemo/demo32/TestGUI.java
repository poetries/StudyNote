import java.awt.*;

public class TestGUI
{
	public static void main(String[] args)
	{
		Frame f = new Frame(); //构造一个大容器放下面的东西
		f.setSize(400,400);
		f.setLayout(new GridLayout(2,1));//设置f的布局管理器为GridLayout（网格  两行 一列） 因为他默认的是BorderLayout
		
		Panel p1 = new Panel();//panel布局管理器默认的是FlowLayout  要设置成BorderLayout
		p1.setLayout(new BorderLayout());
		
		Panel p1_1 = new Panel();
		p1_1.setLayout(new GridLayout(2,1));
		
		Button btn1 = new Button("BUTTON1");
		Button btn2 = new Button("BUTTON2");
		Button btn3 = new Button("BUTTON3");
		Button btn4 = new Button("BUTTON4");
		
		p1.add(btn1,BorderLayout.WEST);
		p1_1.add(btn3);
		p1_1.add(btn4);
		p1.add(p1_1);
		p1.add(btn2,BorderLayout.EAST);
		
		Panel p2 = new Panel();
		p2.setLayout(new BorderLayout());
		
		Panel p2_2 = new Panel();
		p2_2.setLayout(new GridLayout(2,2));
		
		Button btn5 = new Button("BUTTON5");
		Button btn6 = new Button("BUTTON6");
		Button btn7 = new Button("BUTTON7");
		Button btn8 = new Button("BUTTON8");
		Button btn9 = new Button("BUTTON9)");
		Button btn10 = new Button("BUTTON10");
		
		
		p2.add(btn5,BorderLayout.WEST);
		p2.add(btn6,BorderLayout.EAST);
		
		p2_2.add(btn7);
		p2_2.add(btn8);
		p2_2.add(btn9);
		p2_2.add(btn10);
		
		p2.add(p2_2);
		
		f.add(p1);
		f.add(p2);
		
		f.pack();
		f.setVisible(true);
		
	}
	
}
