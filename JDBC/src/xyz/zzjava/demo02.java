package xyz.zzjava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
 * ����ResultSet�Ļ����÷�
 */
public class demo02 {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");//����������
			String url="jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8";
			String user="root";
			String password="zzj234812";
			conn=DriverManager.getConnection(url, user, password);
			
			String sql="select id,name,pwd from stu_table where id>?";//?ռλ��,���Է�ֹSQLע��
			ps=conn.prepareStatement(sql);
			
			ps.setObject(1, 2);//��id����2�ļ�¼ȡ����
			
			rs=ps.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getInt(1)+"---"+rs.getString(2)+"---"+rs.getString(3));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//��ѭ��resultset-->statement-->connection�����Ĺر�˳��һ��Ҫ��try-catch��fenkaixie��
			if (rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}if (ps!=null) {
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
