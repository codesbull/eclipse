package xyz.zzjava.www;
/*��ν��ָ���쳣�����ǵ����˲����ڵĶ��󣬻�����û�г�ʼ���Ķ������������쳣��
����ڳ�����ʹ����һ������Ϊnull����ʱ���ͻ��������쳣��*/
public class NullPointerExcep {
	//����һ������Ϊnull����test
	static Test test;
public static void main(String[] args) {
	//ʹ��test����talk()����
	System.out.println(test.talk());
}
}
class Test{
	public String talk() {//����һ�������÷���
		return "this is a boy";
	}
}
