package xyz.zzjava.www;

/*遍历文件目录*/
import java.io.File;
import java.nio.file.Files;
import java.util.Iterator;
import java.util.logging.Level;

public class DiGuiDemo {
	static int level;//定义一个文件目录的层级
	public static void main(String[] args) {
		//创建一个目录
		File file=new File("D:\\workerspace\\zzjava");
		parseFile(file);
	}
	public static void parseFile(File file) {
		
		if (file==null || !file.exists()) {
			return;
		}
		
		level++;//给层级加1
		
		//获得文件对象的子文件
		File[] files=file.listFiles();
		
		//遍历这些子文件
		for(File f:files) {
			for (int i = 0; i <level; i++) {
				//打印层级的缩进
				System.out.print("\t");
			}
			
			//打印文件
			System.out.println(f.getName());
			
			//判断这些子文件是否是目录
			if (f.isDirectory()) {
				//递归的方式遍历
				parseFile(f);
			}
		}
		//本层次遍历完毕，把层次减回来
		level--;
	}
}
