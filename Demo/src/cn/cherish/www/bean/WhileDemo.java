package cn.cherish.www.bean;
public class WhileDemo {
	public static void main(String[] args) {
	/*	int i=1,sum=0;
		while(i<=100)
		{	if(i%2 !=0)   //1~100֮��������    
			//if(i%2==0)  //1~100֮��ż����
				sum+=i;  i++;
		}
		System.out.println("1~100֮����/ż����Ϊ��"+sum);
	*/
		
//do while ʵ��
	/*	int i=1, sum=0;
		do{
			if(i%2==0){sum+=i;}i++;
			}while(i<=100);	
		System.out.println("1~100֮��ż����"+sum);
	*/
//��ӡ100~1000֮�������ˮ�ɻ���
	/*	int i=100;
		do{    //��ø�λ
				int g=i%10;
				//���ʮλ
				int s=(i%100)/10;
				//��ð�λ
				int b=i/100;
				if((g*g*g+s*s*s+b*b*b)==i){
					System.out.println(i);
				}
				i++;
		}while(i<1000);
	*/
//��ӡ100~1000֮������м��ı�����
		/*int i=100;
		do{    //��ø�λ
				int g=i%10;
				//���ʮλ
				int s=(i%100)/10;
				//��ð�λ
				int b=i/100;
				if(g==b){
					System.out.println(i);
				}
				i++;
		}while(i<1000);
		*/
//ʹ��for����ӡ1��100�����е�ż����
	/*	int i,sum=0;
		for(i=1;i<=100;i++){
			if(i%2==0){
				sum+=i;
			}
		}
		System.out.println("1~100֮�������ż����="+sum);
	*/
//��ӡ5��5�е�1
		//���Ƶ�����
	/*for(int j=0;j<5;j++){
		//����ÿ�е�1����5��
		for(int i=0;i<5;i++){
			System.out.print("1");
		}
		System.out.println();	
	 }
	 */
	//�žų˷���
		//�е�ѭ��
		
		
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();//����
		}
	}
}
