package cn.cherish.www.bean;

import java.io.*;
public class Demo1_1 {
 public static void main(String[] args) throws Exception
 {
    Dog dogs[]=new Dog[4];
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
  for(int i=0;i<4;i++)
  {
   dogs[i]=new Dog();
   System.out.println("�������"+(i+1)+"ֻ������");
   
    //�ӿ���̨��ȡ����
    String name=br.readLine();//�쳣����
    
   //�����ָ�������
   dogs[i].setName(name);
   System.out.println("�������"+(i+1)+"ֻ��������");
   String s_weight=br.readLine();
   float weight=Float.parseFloat(s_weight);//Stringתfloat
   //�����ظ�������
   dogs[i].setWeight(weight);
  }
  
  //����������
  float allWeight=0;
  for(int i=0;i<4;i++)
  {
   allWeight+=dogs[i].getWeight();
  }
  ////����ƽ������
  float avgWeight=allWeight/dogs.length;
  System.out.println("�����أ�"+allWeight+"ƽ�����أ�"+avgWeight);
 }
 
 //����һ������
   //public class Dog            �������ڣ���Ϊ: public static class Dog �Ϳ����� 
 public static class Dog
 {
  private String name;
  private float weight;
  public String getName() {
   return name;
  }
  public void setName(String name) {
   this.name = name;
  }
  public float getWeight() {
   return weight;
  }
  public void setWeight(float weight) {
   this.weight = weight;
  }
  
 }
}
