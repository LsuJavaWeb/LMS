package cn.lsu.lms.bean;

import java.util.Date;
public class HistoryBook {
		
	private int bookId ;
	private int userId ;
	private Date borrowTime ;
	private Date returnTime ;
	private int historyId ;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	@Override
	public String toString() {
		return "HistoryBook [bookId=" + bookId + ", userId=" + userId
				+ ", borrowTime=" + borrowTime + ", returnTime=" + returnTime
				+ ", historyId=" + historyId + "]";
	}
	public int getuserId() {
		return userId;
	}
	public void setuserId(int userId) {
		this.userId = userId;
	}
	public Date getBorrowTime() {
		return borrowTime;
	}
	public void setBorrowTime(Date borrowTime) {
		this.borrowTime = borrowTime;
	}
	public Date getReturnTime() {
		return returnTime;
	}
	public void setReturnTime(Date returnTime) {
		this.returnTime = returnTime;
	}
	public int getHistoryId() {
		return historyId;
	}
	public void setHistoryId(int historyId) {
		this.historyId = historyId;
	}

}
