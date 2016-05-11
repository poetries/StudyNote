
import java.io.*;

public class TestObjectIO
{
	public static void main(String[] args)
	{
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		Student ss = new Student("zhansan", 1000, 88.8f);  //注意88.8f不能改为88.8 
		Student ss2 = null;	
				
		try
		{
			FileOutputStream fos = new FileOutputStream("f:/ObjectOut.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(ss);
			
			ois = new ObjectInputStream(new FileInputStream("f:/ObjectOut.txt"));	
			ss2 = (Student)ois.readObject();  //(Student)不能省   ois.readObject();如果ois中的某个成员是transient,则该成员是不会被读取的，因为该成员不会被保存，何来读取之说？！
			
			System.out.println("ss2.sname = " + ss2.sname);
			System.out.println("ss2.sid = " + ss2.sid);
			System.out.println("ss2.sscore = " + ss2.sscore);
		}
		catch (FileNotFoundException e)
		{
			System.out.println("文件没有找到!");
			System.exit(-1);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.exit(-1);
		}
		finally
		{
			try
			{
				oos.close();
				ois.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
				System.exit(-1);
			}
		}		
	}
}

class Student implements Serializable  //如果将implements Serializable 注释掉，则程序编译时就会报错
{
	public String sname = null;
	public int sid = 0;
	transient public float sscore = 0; //表示sscore成员不能被序列化，所谓不能被序列化就是指：“该成员调用ObjectOutputStream 的writeOnbject()时不会被保存，调用ObjectInputStream的readObject()方法时不会被读取”
	
	public Student(String name, int id, float score)
	{
		this.sname = name;
		this.sid = id;
		this.sscore =  score;
	}
}





/*

	对象序列化：
	
	所谓序列化是指：把一个object对象直接转化为字节流，然后把这个字节流直接写入本地硬盘或网络中
	
	如果想要把某个对象序列化，则必须实现Serializable接口
	
	
	Serializable接口中并没有任何方法，这种类型的接口被称为标记接口，如果一个类实现了Serializable接口,潜在含义就是告诉编译器这个类是允许被序列化的，
	如果程序中存在序列该对象的代码，编译器就会进行相应的处理已完成 该对象的序列化的代码，如果该对象没有实现Serializable接口，程序中却存在该对象被序列化的代码，就会报错
	
	在java中transient修饰的成员变量在对象序列化时不被序列化

*/
