package xyz.zzjava.www;
/*在该类的主方法中创建2个String类型的变量，但在程序中将该变量所赋值强制转换为int类型。*/
public class NumFormatExcep {
	private String name;
	private String password;
	//分别生成其对应的set()和get()方法
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		//对其进行初始化
		NumFormatExcep r7=new NumFormatExcep();
		String name=r7.getName();
		//将String类型强制转换为int类型
		int password=new Integer(r7.getPassword()).intValue();
		System.out.println("用户名为:"+name+";密码为"+password);
	}
}
