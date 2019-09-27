package xyz.zzjava.www;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileNotFoundExcept {
	public static void main(String[] args) {
		//创建一个文件输入流对象
		FileInputStream fis=null;
		try {//创建一个文件对象
			File file=new File("d:\\lester.txt");
			//初始化文件输入流对象
			fis=new FileInputStream(file);
		}catch(FileNotFoundException e) {//捕获异常
			e.printStackTrace();
		}finally {
			try {
				fis.close();//释放资源
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
