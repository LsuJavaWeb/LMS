package cn.lsu.lms.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lsu.lms.bean.User;
import cn.lsu.lms.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper mapper;

	public int insert(User user) {
		// 插入用户方法（出现异常返回1，正常插入返回0）

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
		// 查询用户方法
		// TODO Auto-generated method stub
		ArrayList<User> users = null;
		try {
			users = mapper.query(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}

	public int modify(User user) {
		// 修改用户方法（出现异常返回0，正常返回1）
		// TODO Auto-generated method stub
		int res = 1;
		try {
			mapper.modify(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			res = 0;
			e.printStackTrace();
		}
		return res;
	}

	public boolean delete(int userId) {
		// TODO Auto-generated method stub
		// 删除用户方法（出现异常返回false，正常删除返回true）
		boolean res = true;
		try {
			mapper.delete(userId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			res = false;
			e.printStackTrace();
		}
		return res;
	}

}
