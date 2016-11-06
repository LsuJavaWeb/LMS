package cn.lsu.lms.service;

import java.util.ArrayList;

import cn.lsu.lms.bean.HistoryBook;

public interface HistoryService {
	
	public ArrayList<HistoryBook> query();
	public void modify(HistoryBook historyBook);
	public void delete(int historyId);
	public void insert(HistoryBook historyBook);

}
