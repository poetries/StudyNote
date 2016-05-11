import java.io.*;

public class TestData
{
	public static void main(String[] args) throws Exception
	{
		//因为DataOutputStream不是一个字节数组 所以用ByteArrayInputStream实现
		//生成一个字节数组 ByteArrayInputStream没有writeLong方法 
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		//因为ByteArrayInputStream没有writeLong方法  而 DataOutputStream有  所以在DataOutputStream基础上包裹一个流 包裹的一层就做dos  dos 上有个按钮writeLong 只需调用此方法
		//最终把整型写到字节数组里面
		//写到dos这个包裹流所衣服的原始流baos这个类所关联到的字节数组
		DataOutputStream dos = new DataOutputStream(baos);
		
		long m = 12345527454724L;
		dos.writeLong(m);//把m写到dos所关联的流上去 即写到9行造出的字节数组里
		//把m所代表的内存中的二进制写进去
		
		dos.flush();//任何输出流都有flush方法
		byte[] buf2 = baos.toByteArray();
		
		ByteArrayInputStream bais = new ByteArrayInputStream(buf2);//buf2必须写 指定从哪里读
		//读数组内容
		DataInputStream dis = new DataInputStream(bais);
		
		long n ;
		n = dis.readLong();
		//dis.readLong(); 查帮助文档发现readLong没有形参 error
		
		System.out.println("n = "+n);
		
	}
}
