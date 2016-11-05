package cn.lsu.lms.service;

import java.util.ArrayList;

import cn.lsu.lms.bean.Book;

public interface BookService {

	public int insert(Book book) ;
	public ArrayList<Book> query(Book book);
	public int modify(Book book);
	public boolean delete(int id);
}
