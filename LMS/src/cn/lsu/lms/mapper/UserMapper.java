package cn.lsu.lms.mapper;

import java.util.ArrayList;

import cn.lsu.lms.bean.User;

public interface UserMapper {
	
	public void insert(User user) throws Exception;
    public ArrayList<User> query(User user) throws Exception;
}