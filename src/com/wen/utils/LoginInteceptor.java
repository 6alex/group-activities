package com.wen.utils;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInteceptor implements HandlerInterceptor{
     public List<String> excutMaperURL;
	
	/*
	 * (non-Javadoc)
	 * ִ����ͼ����֮��ִ��
	 */
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	/*
	 * (non-Javadoc)
	 * ִ��controller֮��ִ��
	 */
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	/**
	 * ����֮ǰִ��
	 */
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		//����·��
		String url=req.getRequestURI();
		int postfix=url.lastIndexOf(".");//����ָ���ַ��ڴ��ַ��������һ�γ��ִ�������
		if(postfix>-1){
			//��̬��Դ�ļ�
			String postFixStr=url.substring(postfix);
			if(excutMaperURL.contains(postFixStr)){
				return true;
			}else{
				return false;
			}
		}else{
			//����
			if(!url.contains("/login")){
				HttpSession session=req.getSession();
				if(session.getAttribute("user")!=null){
					return true;
				}else{
					req.getRequestDispatcher("/index.jsp").forward(req, arg1);
					return false;
				}
			}
		}
		return true;
	}

	public List<String> getExcutMaperURL() {
		return excutMaperURL;
	}

	public void setExcutMaperURL(List<String> excutMaperURL) {
		this.excutMaperURL = excutMaperURL;
	}

}
