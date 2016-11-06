package cn.lsu.lms.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.lsu.lms.bean.HistoryBook;
import cn.lsu.lms.service.HistoryService;

@Controller
public class HistoryBookController {
	
	@Autowired
	private HistoryService historyService;
	
	@InitBinder  
	public void initBinder(WebDataBinder binder) {  
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
	    dateFormat.setLenient(false);  
	    binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(dateFormat, true));//true:允许输入空值，false:不能为空值  
	}
	
	@RequestMapping("/historyQuery")
	public ModelAndView query(){
		ModelAndView mav = new ModelAndView("history");
		ArrayList<HistoryBook> historyBooks = historyService.query();
		mav.addObject("historyBooks", historyBooks);
		return mav;
	}
	@RequestMapping("/historyDelete")
	public String delete(@RequestParam(value="historyId",required=false)int historyId){
		historyService.delete(historyId);
		return "redirect:/htest.action";
	}
	
	@RequestMapping("/historyModify")
	public String modify(HistoryBook historyBook){
		historyService.modify(historyBook);
		return "redirect:/htest.action";
	}
	
	@RequestMapping("/historyInsert")
	public String insert(HistoryBook historyBook){
		historyService.insert(historyBook);
		return "redirect:/htest.action";
	}
	@RequestMapping("htest")
	public ModelAndView test(){
		ModelAndView mav = new ModelAndView("history");
		ArrayList<HistoryBook> historyBooks = historyService.query();
		System.out.println(historyBooks.size());
		mav.addObject("hh", "lalla");
		mav.addObject("historyBooks", historyBooks);
		return mav;
	}

}
