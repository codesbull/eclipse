package demo;

import java.util.Date;

public class Student {
	//��Ա���� 
	private String sno;
	private String sname;
	private Date sbirthday;
	private boolean ssex;
	//���������̬����
	private static String deptName;
	/*��̬������ʵ������������
	 * 1.��̬��������ֱ�ӵ��ã�ʵ���������ɶ�������������ã������ɶ������ã�
	 * 2.��̬�������౻����ʱ��һͬ�����ء������ɵĶ���û��ֱ�ӹ�ϵ��
	 */
	//�޲ι��췽��
	public Student(){
		super();
	}
	//�ܴ��εĹ��췽��
	public Student(String sno, String sname, Date sbirthday, boolean ssex) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sbirthday = sbirthday;
		this.ssex = ssex;
	}
	//ʵ����������Ա����
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Date getSbirthday() {
		return sbirthday;
	}
	public void setSbirthday(Date sbirthday) {
		this.sbirthday = sbirthday;
	}
	public boolean isSsex() {
		return ssex;
	}
	public void setSsex(boolean ssex) {
		this.ssex = ssex;
	}
	//�෽������̬����
	public static String getDeptName() {
		return deptName;
	}
	public static void setDeptName(String deptName) {
		Student.deptName = deptName;
	}

	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", sbirthday=" + sbirthday + ", ssex=" + ssex + "]";
	}
	
	
	
	
	
	

}
