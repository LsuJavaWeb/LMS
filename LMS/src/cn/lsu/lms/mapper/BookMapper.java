package cn.lsu.lms.mapper;

import java.util.ArrayList;

import cn.lsu.lms.bean.Book;

public interface BookMapper {

	public void insert(Book book) throws Exception;
    public ArrayList<Book> query(Book book) throws Exception;
    public void delete(int bookId) throws Exception;
    public void modify(Book book) throws Exception;
}
