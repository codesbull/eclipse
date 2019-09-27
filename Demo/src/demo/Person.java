
package demo;
//public �����ģ�class ��ؼ��֣�Person �Զ�������
public class Person {
	//ʵ����������Ա����
	/*
	 * ����������ı����г�Ա������ʵ������
	 * private ˽�е� ��ֻ�ڱ����пɼ���
	 * ����ʹ��private���Σ�������java�ĺ�����������װ��
	 */
	private String name;
	private int age;
	private boolean sex;
	private Dog  petDog;
	/*
	 * ���췽����
	 * 1.��������������ͬ
	 * 2.û�з���ֵ����
	 * 3.û��return���
	 */
	//��ͬһ�����У�����������ͬ�������б����������˳��ͬʱ���з��������أ�overload��
	public Person(String name, int age, boolean sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public Person(String name, boolean sex, int age) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	//this��ʹ�÷��������Ե��������Ĺ��췽��
	public  Person(){
		this("***",10,true);
	}
	/*���췽������ͨ����������
	 * 1�����췽�������ֺ�������ͬ����ͨ������ֻҪ�����ʶ���Ķ�����򼴿�
	 * 2�����췽��Ҫ�͹ؼ���newһ��ʹ�ã������ɶ�����ͨ�����ĵ��������ɶ�������
	 * 3�����췽��û��return��䣬��ͨ�����ڲ���ҪʱҪ��return���
	 * 4�����췽��û�з���ֵ���ͣ���ͨ���������з���ֵ���ͱ�־��void
	 */
	
	//�ڷ������ж���ı����оֲ�������local variable��
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public Dog getPetDog() {
		return petDog ;
	}
	public void setPetDog(Dog petDog) {
		this.petDog  = petDog;
	}
	
	//��Ա������ʵ������ ��this��ָ��ǰ����
	public void showMessage(){
		System.out.println("**********************");
		System.out.println("name of person ��"+this.name);
		System.out.println("age of person:"+this.age);
		System.out.println("sex of peerson:"+(this.sex?'男':'女'));
		System.out.println("**********************");
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", isSex()=" + isSex() + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
