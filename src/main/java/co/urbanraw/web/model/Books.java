package co.urbanraw.web.model;

public class Books {
	
	private int bid;
	private String bname;
	private String aname;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Books [bid=" + bid + ", bname=" + bname + ", aname=" + aname + "]";
	}
	
	
	

}
