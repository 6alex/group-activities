package com.wen.service;

import java.util.List;

import com.wen.po.Activity;

public interface ActService {
	void addAct(Activity act);
	List<Activity> getList();
	Activity getById(int aid);
	void update(Activity act);
	List<Activity> getByState(int state);
}
