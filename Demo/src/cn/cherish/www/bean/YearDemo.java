package cn.cherish.www.bean;
	public class YearDemo {
		/*1 3 5 7 8 10 12 31��
		 *4 6 9 11 30��
		 *ƽ��2��28������2��29
		 */
	public static void main(String[] args) {
	
		//int year=Integer.parseInt(args[0]);
		int month=Integer.parseInt(args[0]);
		int year=2016;
		//int month =1;
		int days = 0;
		switch(month){
			case 1:	
			case 3: 
			case 5: 
			case 7:
			case 8:
			case 10:
			case 12:
				days=31;
				break;
			case 4: 
			case 6: 
			case 9: 
			case 11:
				days=30;
				break;
			case 2:
				//������ܱ�400�����������꣬�����ܱ�4���������ܱ�100����Ҳ������
			if(year%400==0 || (year%4==0 && year%100!=0)){
				days=29;
			}else{
				days=28;
			}
			break;
			default:
				System.out.println("��ȷ���·ݵ���ȷ��");
				break;
		}      //�ж��·ݵĺϷ���
		if(days!=0){
			System.out.println(year+"��"+month+"����"+days+"��");
		}
	}
}
