package xyz.zzjava;
/*
 * JDBC����MYSQL���ݿ�
 * @autor��zzjava
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.xml.internal.bind.v2.model.core.ID;
public class jdbcDemo {
public static void main(String[] args) {
	Statement stmt=null;
	Connection conn=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");//����������
		//String url="jdbc:mysql://127.0.0.1:3306/test";
		String url="jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8";
		String user="root";
		String password="zzj234812";
		//�������ӣ����Ӷ����ڲ�������Socket������һ��Զ�̵�����.�ȽϺ�ʱ������Connection��������һ��Ҫ�㣩
		//ʵ�ʿ����У�Ϊ�����Ч�ʶ���ʹ�����ӳ����������
		conn=DriverManager.getConnection(url, user, password);
		stmt=conn.createStatement();//ʵ�ʿ����в��ã�����©������������
		String sql="insert into stu_table(stu_num,stu_name,stu_Sex,stu_course,stu_grade) values(5555,'����','��','˰��',100)";
		//SQLע��,Σ��
		/**String stu_num="5 or 1=1";
		String sql="delete from stu_table where stu_num="+stu_num;
		*/
		stmt.execute(sql);
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}finally {
		if (stmt!=null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
}
