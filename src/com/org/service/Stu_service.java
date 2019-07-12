package com.org.service;

import java.util.List;

import com.org.pojo.stu_ben;
import com.org.pojo.stu_benDao;
import com.org.pojo.stu_sql;

public class Stu_service  implements DeptServise{

	@Override
	public void insertDept(stu_ben stu_ben) {
		// TODO Auto-generated method stub
		stu_benDao stu_benDao=new stu_sql();
		stu_benDao.insertDept(stu_ben);
		
	}

	@Override
	public void updateDept(stu_ben stu_ben) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDept(String stu_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<stu_ben> getstu_bens() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public stu_ben getstu_benByStu_id(String Stu_id) {
		// TODO Auto-generated method stub
		return null;
	}


}
