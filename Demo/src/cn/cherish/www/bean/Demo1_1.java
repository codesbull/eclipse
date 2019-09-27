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
   System.out.println("请输入第"+(i+1)+"只狗名：");
   
    //从控制台读取狗名
    String name=br.readLine();//异常……
    
   //将名字赋给对象
   dogs[i].setName(name);
   System.out.println("请输入第"+(i+1)+"只狗的体重");
   String s_weight=br.readLine();
   float weight=Float.parseFloat(s_weight);//String转float
   //将体重赋给对象
   dogs[i].setWeight(weight);
  }
  
  //计算总体重
  float allWeight=0;
  for(int i=0;i<4;i++)
  {
   allWeight+=dogs[i].getWeight();
  }
  ////计算平均体重
  float avgWeight=allWeight/dogs.length;
  System.out.println("总体重："+allWeight+"平均体重："+avgWeight);
 }
 
 //定义一个狗类
   //public class Dog            问题所在；改为: public static class Dog 就可以了 
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
