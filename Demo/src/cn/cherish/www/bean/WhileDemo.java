package cn.cherish.www.bean;
public class WhileDemo {
	public static void main(String[] args) {
	/*	int i=1,sum=0;
		while(i<=100)
		{	if(i%2 !=0)   //1~100之间奇数和    
			//if(i%2==0)  //1~100之间偶数和
				sum+=i;  i++;
		}
		System.out.println("1~100之间奇/偶数和为："+sum);
	*/
		
//do while 实现
	/*	int i=1, sum=0;
		do{
			if(i%2==0){sum+=i;}i++;
			}while(i<=100);	
		System.out.println("1~100之间偶数和"+sum);
	*/
//打印100~1000之间的所有水仙花数
	/*	int i=100;
		do{    //获得个位
				int g=i%10;
				//获得十位
				int s=(i%100)/10;
				//获得百位
				int b=i/100;
				if((g*g*g+s*s*s+b*b*b)==i){
					System.out.println(i);
				}
				i++;
		}while(i<1000);
	*/
//打印100~1000之间的所有夹心饼干数
		/*int i=100;
		do{    //获得个位
				int g=i%10;
				//获得十位
				int s=(i%100)/10;
				//获得百位
				int b=i/100;
				if(g==b){
					System.out.println(i);
				}
				i++;
		}while(i<1000);
		*/
//使用for来打印1到100的所有的偶数和
	/*	int i,sum=0;
		for(i=1;i<=100;i++){
			if(i%2==0){
				sum+=i;
			}
		}
		System.out.println("1~100之间的所有偶数和="+sum);
	*/
//打印5行5列的1
		//控制的是行
	/*for(int j=0;j<5;j++){
		//控制每列的1，有5列
		for(int i=0;i<5;i++){
			System.out.print("1");
		}
		System.out.println();	
	 }
	 */
	//九九乘法表
		//行的循环
		
		
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();//换行
		}
	}
}
