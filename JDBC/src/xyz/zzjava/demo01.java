package xyz.zzjava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.crypto.provider.RSACipher;
/*
 * ����PrepareStatement�Ļ����÷�
 * 
 */
public class demo01 {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");//����������
			String url="jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8";
			String user="root";
			String password="zzj234812";
			conn=DriverManager.getConnection(url, user, password);
			
			String sql="insert into stu_table (name,pwd) values(?,?)";//?ռλ��,���Է�ֹSQLע��
			ps=conn.prepareStatement(sql);
			
			//����ʹ��setObject�����������
			ps.setObject(1, "����");
			ps.setObject(2, "12377");
			
			System.out.println("�����¼");
			ps.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if (ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}if (conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
}
}
