package com.org.service;

import java.util.List;

import com.org.pojo.stu_ben;

public interface DeptServise {
	   void insertDept(stu_ben stu_ben);
	    void updateDept(stu_ben stu_ben);
	    void deleteDept(String stu_id);
	    List<stu_ben>  getstu_bens();
	    stu_ben getstu_benByStu_id(String Stu_id);
}
