package toolclass.demo;
/*利用System类对环境属性信息获取
 * System类是抽象类，所以字段和方法都是静态的。其中包含一些有用的方法和字段，它不能被实例化
 * system类提供的getPropertie()和set Propertie()方法可以获取和设置环境属性。
 * */
public class SystemInfo {
	public static void main(String[] args) {
		//通过调用System类的getProperty方法来获取相应的属性值
		System.out.println("用户账户名称："+System.getProperty("user.name"));
		System.out.println("当前用户工作目录："+System.getProperty("user.dir"));
		System.out.println("用户的home路径："+System.getProperty("user.home"));
		System.out.println("类所在路径："+System.getProperty("java.class.path"));
		System.out.println("操作系统的名称："+System.getProperty("os.name"));
		System.out.println("操作系统版本："+System.getProperty("os.version"));
		System.out.println("操作系统架构："+System.getProperty("os.arch"));
		System.out.println("虚拟机实现的版本："+System.getProperty("java.vm.versioon"));
		System.out.println("虚拟机实现的生产商："+System.getProperty("java.vm.vendor"));
		System.out.println("默认的临时文件路径："+System.getProperty("java.io.tmpdir"));
		System.out.println("运行环境规范的名称："+System.getProperty("java.specification.name"));
		System.out.println("Java类格式化的版本号："+System.getProperty("java.class.version"));
		System.out.println("Java运行环境版本："+System.getProperty("java.version"));
		System.out.println("Java运行环境生产商："+System.getProperty("java.vendor"));
		System.out.println("Java的安装路径："+System.getProperty("java.home"));
	}
}
