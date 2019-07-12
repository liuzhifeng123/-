package com.org.pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class stu_database {
	private static final String url="jdbc:sqlserver://10.170.21.52\\\\MSSQLSERVER:1433;DatabaseName=test";
	private static final String user="sa";
	private static final String password="123456";
	static {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	static Connection getConnection() {
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(url, user, password);
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
	public static void clodrConnerction(Connection conn) {
		try {
			if(conn!=null) {
				conn.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
