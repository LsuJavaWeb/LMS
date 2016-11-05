package cn.lsu.lms.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lsu.lms.bean.Book;
import cn.lsu.lms.mapper.BookMapper;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookMapper mapper;

	public int insert(Book book) {
		// 插入书籍方法（出现异常返回1，正常插入返回0）

		try {
			mapper.insert(book);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 1;
		}

		return 0;
	}

	public ArrayList<Book> query(Book book) {
		// 查询书籍方法
		// TODO Auto-generated method stub
		ArrayList<Book> books = null;
		try {
			books = mapper.query(book);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;
	}

	public int modify(Book book) {
		// 修改书籍方法（出现异常返回0，正常返回1）
		// TODO Auto-generated method stub
		int res = 1;
		try {
			mapper.modify(book);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			res = 0;
			e.printStackTrace();
		}
		return res;
	}

	public boolean delete(int bookId) {
		// TODO Auto-generated method stub
		// 删除书籍方法（出现异常返回false，正常删除返回true）
		boolean res = true;
		try {
			mapper.delete(bookId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			res = false;
			e.printStackTrace();
		}
		return res;
	}

}
