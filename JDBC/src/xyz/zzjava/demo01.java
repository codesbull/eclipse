package xyz.zzjava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.crypto.provider.RSACipher;
/*
 * 测试PrepareStatement的基本用法
 * 
 */
public class demo01 {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");//加载驱动类
			String url="jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8";
			String user="root";
			String password="zzj234812";
			conn=DriverManager.getConnection(url, user, password);
			
			String sql="insert into stu_table (name,pwd) values(?,?)";//?占位符,可以防止SQL注入
			ps=conn.prepareStatement(sql);
			
			//可以使用setObject方法处理参数
			ps.setObject(1, "张诶");
			ps.setObject(2, "12377");
			
			System.out.println("插入记录");
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
