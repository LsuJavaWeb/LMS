package cn.lsu.lms.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.lsu.lms.bean.User;
import cn.lsu.lms.mapper.UserMapper;
import cn.lsu.lms.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/userinsert")
	public ModelAndView  insert(User user)
	{
		ModelAndView m=new ModelAndView();
		int res=userService.insert(user);
		
			m.addObject("status", res);
			m.setViewName("regist");
		
		return m;
		
	}
	
	@RequestMapping("/userdelete")
	public ModelAndView delete(int userId)
	{
		ModelAndView m=new ModelAndView();
		boolean res=userService.delete(userId);
		m.addObject("status", res);
		m.setViewName("");
		return m;
		
	}
	
	@RequestMapping("/userquery")
	public ModelAndView query(User user)
	{
		ModelAndView m=new ModelAndView();
		ArrayList<User> ulist=userService.query(user);
		m.addObject("result", ulist);
		m.setViewName("");
		return m;
	}
	
	@RequestMapping("/usermodify")
	public ModelAndView modify(User user)
	{
		ModelAndView m=new ModelAndView();
		int res=userService.modify(user);
		m.addObject("status", res);
		m.setViewName("");
		return m;
	}
	
	@RequestMapping("/login")
	public String viewlogin()
	{
		
		return "login";
	}
	
	@RequestMapping("/regist")
	public String viewreg()
	{
		
		return "regist";
	}
	
	@RequestMapping("/check")
	public String logincheck(User user)
	{
		//0表示正常登陆，1表示账户不存在，2表示密码错误
		ArrayList<User>users=userService.query(user);
		if(users.size()==0)
		{
			//用户不存在
			System.out.println("用户不存在");
			return "login";
		}
		else
		{
			if(users.get(0).getPassword().equals(user.getPassword()))
			{
				//正常登陆
				System.out.println("正常登陆");
				return "index";
			}
			else
			{
				//密码错误
				System.out.println("密码错误");
				return "login";
			}
			
		}
		
		
		
	}

}
