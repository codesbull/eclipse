package xyz.zzjava.www;
import java.io.File;
/*删除一个文件夹下所有文件（不包括目录）*/
public class FileDelete {
	public static void main(String[] args) {
		//创建一个目录
		File file=new File("D:\\aaa");
		parseFile(file);
	}
	public static void parseFile(File file) {
		
		if (file==null || !file.exists()) {
			return;
		}
		
		//获得文件对象的子文件
		File[] files=file.listFiles();
		
		//遍历这些子文件
		for(File f:files) {
			//打印文件
			System.out.println(f.getName());
			
			//判断这些子文件是否是目录
			if (f.isDirectory()) {
				//递归的方式遍历
				parseFile(f);
			}else {
				f.delete();
			}
		}
		
	}
}

