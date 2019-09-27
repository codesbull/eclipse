package demo;

public class PersonDemo {

	public static void main(String[] args) {
		//测试类
		Person p=new Person("张山",21,true);
		Dog d=new Dog ("小黄",3,"黄色",true);
		p.setPetDog(d);
		System.out.println(p);
	}

}
