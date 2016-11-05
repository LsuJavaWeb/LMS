package cn.lsu.lms.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lsu.lms.bean.User;
import cn.lsu.lms.mapper.UserMapper;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper mapper;
	public int Insert(User user) {
	//插入用户方法（出现异常返回1，正常插入返回0）
		
			
			try {
				mapper.insert(user);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return 1;
			}
			
	
	
		return 0;
	}
	public ArrayList<User> query(User user) {
		// TODO Auto-generated method stub
		ArrayList<User> users=null;
		try {
			users= mapper.query(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}

}
