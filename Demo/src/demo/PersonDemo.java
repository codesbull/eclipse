package demo;

public class PersonDemo {

	public static void main(String[] args) {
		//������
		Person p=new Person("��ɽ",21,true);
		Dog d=new Dog ("С��",3,"��ɫ",true);
		p.setPetDog(d);
		System.out.println(p);
	}

}
