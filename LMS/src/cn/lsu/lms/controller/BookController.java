package cn.lsu.lms.controller;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.lsu.lms.bean.Book;

import cn.lsu.lms.service.BookService;


@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	
	
	@RequestMapping("/bookinsert")
	public ModelAndView  insert(Book book)
	{
		ModelAndView m=new ModelAndView();
		int res=bookService.insert(book);
		System.out.println(res);
			m.addObject("status", res);
			m.setViewName("");
		
		return m;
		
	}
	
	@RequestMapping("/bookdelete")
	public ModelAndView delete(int bookId)
	{
		ModelAndView m=new ModelAndView();
		boolean res=bookService.delete(bookId);
		System.out.println(res);
		m.addObject("status", res);
		m.setViewName("");
		return m;
		
	}
	
	@RequestMapping("/bookquery")
	public ModelAndView query(Book book)
	{
		ModelAndView m=new ModelAndView();
		book=new Book();
		book.setName("ha");
		
		
		book.setName("%"+book.getName()+"%");
		ArrayList<Book> blist=bookService.query(book);
		System.out.println(blist.size());
		m.addObject("result", blist);
		m.setViewName("");
		return m;
	}
	
	@RequestMapping("/bookmodify")
	public ModelAndView modify(Book book)
	{
		ModelAndView m=new ModelAndView();
		int res=bookService.modify(book);
		System.out.println(res);
		m.addObject("status", res);
		m.setViewName("");
		return m;
	}
	
	

}
