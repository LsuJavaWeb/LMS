package cn.lsu.lms.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lsu.lms.bean.HistoryBook;
import cn.lsu.lms.mapper.HistoryMapper;

@Service
public class HistoryServiceImpl implements HistoryService {
	
	@Autowired
	HistoryMapper historyMapper;

	public ArrayList<HistoryBook> query() {
		ArrayList<HistoryBook> historyBooks = null;
		
		try {
			
			historyBooks = historyMapper.query();
//			Iterator<HistoryBook> it=	historyBooks.iterator();
//			for(int i=0;i<historyBooks.size();i++)
//			{
//				
//			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return historyBooks;
	}

	public void modify(HistoryBook historyBook) {
		try {
			historyMapper.modify(historyBook);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void delete(int historyId) {
		try {
			historyMapper.delete(historyId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void insert(HistoryBook historyBook) {
		try {
			historyMapper.insert(historyBook);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
