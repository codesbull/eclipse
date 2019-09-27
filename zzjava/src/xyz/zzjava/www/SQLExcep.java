package xyz.zzjava.www;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class SQLExcep {
	public static void main(String[] args) {
		//MySQL数据库的URL
		String URL="jdbc:myaql://localhost:3306/mysqltest";
		//MySQL数据库的驱动
		String DRIVER="com.mysql.jdbc.Driver";
		//数据库的用户名
		String USERNAME="admin";
		//数据库的密码
		String PASSWORD="123456";
		Connection conn=null;
		try {
			Class.forName(DRIVER);//加载驱动
			conn=DriverManager.getConnection(URL,USERNAME,PASSWORD);//建立连接
		}catch(SQLException e) {//捕获SQLException异常
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();//释放资源
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
