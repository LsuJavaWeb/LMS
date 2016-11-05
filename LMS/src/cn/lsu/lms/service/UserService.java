package cn.lsu.lms.service;

import java.util.ArrayList;

import cn.lsu.lms.bean.User;

public interface UserService {

	public int insert(User user) ;
	public ArrayList<User> query(User user);
	public int modify(User user);
	public boolean delete(int id);
}
