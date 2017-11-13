package com.wen.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wen.dao.ActivityMapper;
import com.wen.po.Activity;

@Service
public class ActServiceImpl implements ActService{
	@Resource
	ActivityMapper activityMapper;

	@Override
	public void addAct(Activity act) {
		// TODO Auto-generated method stub
		activityMapper.insert(act);
	}

	@Override
	public List<Activity> getList() {
		// TODO Auto-generated method stub
		List<Activity> alist = activityMapper.getList();
		return alist;
	}

	@Override
	public Activity getById(int aid) {
		// TODO Auto-generated method stub
		Activity act = activityMapper.getById(aid);
		return act;
	}

	@Override
	public void update(Activity act) {
		// TODO Auto-generated method stub
		activityMapper.update(act);
	}

	@Override
	public List<Activity> getByState(int state) {
		// TODO Auto-generated method stub
		List<Activity> list = activityMapper.getByState(state);
		return list;
	}

}
