package cn.lsu.lms.mapper;

import java.util.ArrayList;

import cn.lsu.lms.bean.HistoryBook;
import cn.lsu.lms.bean.User;

public interface HistoryMapper {
	
	public void insert(HistoryBook historyBook) throws Exception;
    public ArrayList<HistoryBook> query() throws Exception;
    public void modify(HistoryBook historyBook) throws Exception;
    public void delete(int historyId) throws Exception;
}