package com.wen.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wen.dao.ApprovemessageMapper;
import com.wen.po.Approvemessage;

@Service
public class ApproveServiceImpl implements ApproveService{
	@Resource
	ApprovemessageMapper approvemessageMapper;
	@Override
	public void addApprove(Approvemessage amsg) {
		// TODO Auto-generated method stub
		approvemessageMapper.insert(amsg);
	}
	@Override
	public Approvemessage getById(int aid) {
		// TODO Auto-generated method stub
		return approvemessageMapper.getById(aid);
	}
	
}
