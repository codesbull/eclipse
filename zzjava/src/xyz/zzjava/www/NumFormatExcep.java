package xyz.zzjava.www;
/*�ڸ�����������д���2��String���͵ı��������ڳ����н��ñ�������ֵǿ��ת��Ϊint���͡�*/
public class NumFormatExcep {
	private String name;
	private String password;
	//�ֱ��������Ӧ��set()��get()����
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
		//������г�ʼ��
		NumFormatExcep r7=new NumFormatExcep();
		String name=r7.getName();
		//��String����ǿ��ת��Ϊint����
		int password=new Integer(r7.getPassword()).intValue();
		System.out.println("�û���Ϊ:"+name+";����Ϊ"+password);
	}
}
