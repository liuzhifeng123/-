package com.org.pojo;

import java.util.List;

public interface stu_benDao {
	void insertDept(stu_ben stu_ben);
	void updateDept(stu_ben stu_ben);
	void deleteDept(String stu_id);
	List<stu_ben> getStu_bnes();
	stu_ben getStu_benByDeptno(String stu_id);
	
}
