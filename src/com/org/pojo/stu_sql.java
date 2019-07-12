package com.org.pojo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public abstract class stu_sql implements stu_benDao {
	
	public void insertDept(stu_ben stu_ben) {
		Connection conn=null;
		 PreparedStatement pstmt=null;
		try {
			conn=stu_database.getConnection();
			String sql="";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, stu_ben.getStu_name());
			pstmt.setString(2, stu_ben.getStu_id());
			pstmt.setString(3,stu_ben.getStu_class());
			pstmt.setString(4,stu_ben.getStu_colle());
			pstmt.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
