package cn.lsu.lms.service;

import java.util.ArrayList;

import cn.lsu.lms.bean.User;

public interface UserService {

	public int Insert(User user) ;
	public ArrayList<User> query(User user);
}
