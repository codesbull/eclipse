package xyz.zzjava;
/*
 * JDBC连接MYSQL数据库
 * @autor：zzjava
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
		Class.forName("com.mysql.jdbc.Driver");//加载驱动类
		//String url="jdbc:mysql://127.0.0.1:3306/test";
		String url="jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8";
		String user="root";
		String password="zzj234812";
		//建立连接（连接对象内部包含了Socket对象，是一个远程的链接.比较耗时，这是Connection对象管理的一个要点）
		//实际开发中，为了提高效率都会使用连接池来管理对象。
		conn=DriverManager.getConnection(url, user, password);
		stmt=conn.createStatement();//实际开发中不用，存在漏洞，容易侵入
		String sql="insert into stu_table(stu_num,stu_name,stu_Sex,stu_course,stu_grade) values(5555,'刘翔','男','税法',100)";
		//SQL注入,危险
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
