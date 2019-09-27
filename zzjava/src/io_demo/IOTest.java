package io_demo;
/*字符输出流举例*/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
public class IOTest {
	public static void main(String[] args) {
		File file=new File("test.txt");//创建一个文件(相对路径)
		/*Writer writer=new FileWriter(file);错误写法
		 * 在IO中都是有异常需要处理的，异常若发生的话，要考虑流的关闭。
		 * 用try-catch-finally来处理。
		 */
		Writer writer=null;
		try {//IO流是需要关闭的，如果不这样设计就不能关闭资源
			writer=new FileWriter(file);
			writer.write("HelloWord");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(writer!=null)//判断writer不是空指针异常
				try {
					writer.close();//在关闭前会执行flush的事情，close自带flush
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
