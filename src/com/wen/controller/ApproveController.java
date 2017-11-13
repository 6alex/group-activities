package com.wen.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wen.po.Activity;
import com.wen.po.Approvemessage;
import com.wen.service.ActService;
import com.wen.service.ApproveService;

@Controller
public class ApproveController {
	@Resource
	ActService actService;
	@Resource
	ApproveService approveService;
	
	
	@RequestMapping("/approve")
	public String getlist(Model model){
		List<Activity> list = actService.getByState(2);
		if(list!=null){
		model.addAttribute("list", list);
		}else{
			model.addAttribute("msg", "没有待审批的活动");
		}
		return "views/approvelist.jsp";
		
	}
	@RequestMapping("/appedit/{aid}")
	public String appedit(Model model,@PathVariable int aid){
		Activity act = actService.getById(aid);
		model.addAttribute("act", act);
		return "/views/approve.jsp";
		
	}
	
	@RequestMapping("/saveapprove")
	public String save(Model model,Approvemessage amsg,Activity act){
		amsg.setTime(new Date());
		approveService.addApprove(amsg);
		act.setState(amsg.getResult());
		actService.update(act);
		return "views/index.jsp";
		
	}
}
