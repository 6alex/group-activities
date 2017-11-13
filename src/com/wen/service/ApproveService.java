package com.wen.service;

import com.wen.po.Approvemessage;

public interface ApproveService {
	void addApprove(Approvemessage amsg);
	Approvemessage getById(int aid);
}
