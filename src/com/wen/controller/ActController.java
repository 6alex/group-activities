package com.wen.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wen.po.Activity;
import com.wen.po.Approvemessage;
import com.wen.service.ActService;
import com.wen.service.ApproveService;

@Controller
public class ActController {
	@Resource
	ActService as;
	@Resource
	ApproveService approveService;
	
	@RequestMapping("/addact")
	public String add(Model model,Activity act){
		as.addAct(act);
		return "redirect:/getlist";
		
	}
	
	@RequestMapping("/getlist")
	public String getList(Model model){
		List<Activity> list = as.getList();
		model.addAttribute("alist", list);
		return "views/activity.jsp";
		
	}
	
	@RequestMapping("/edit/{aid}")
	public String edit(Model model,@PathVariable int aid){
		Activity act = as.getById(aid);
		model.addAttribute("act", act);
		return "/views/edit.jsp";
		
	}
	
	@RequestMapping("/save")
	public String save(Model model,Activity act){
		as.update(act);
		return "redirect:/getlist";
		
	}
	

	@RequestMapping("/idea/{aid}")
	public String idea(Model model,@PathVariable int aid){
		Activity act = as.getById(aid);
		model.addAttribute("act", act);
		Approvemessage app=approveService.getById(aid);
		model.addAttribute("app", app);
		return "/views/idea.jsp";
		
	}
	
	
}
