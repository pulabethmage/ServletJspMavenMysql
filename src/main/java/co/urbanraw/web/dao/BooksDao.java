package co.urbanraw.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import co.urbanraw.web.model.Books;
import jakarta.servlet.RequestDispatcher;

public class BooksDao {
	
	
	String url = "jdbc:mysql://localhost:3306/jspweb";
	String mysqluser = "root";
	String mysqlpass = "";

	
	public Books getBooks(int bid)
	{
		Books b = new Books();
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, mysqluser, mysqlpass);
			PreparedStatement pst = con.prepareStatement("select * from books_tbl where id="+bid);
		
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())
			{
				b.setBid(rs.getInt("id"));
				b.setBname(rs.getString("book_name"));
				b.setAname(rs.getString("book_tuthr"));
			}
			
			con.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return b;
	}
	
	
	public String addBooks(String bookname,String authorname)
	{
		//System.out.println(bookname +"  "+ authorname);
		
		String resultstring = "";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, mysqluser, mysqlpass);
			PreparedStatement pst = con.prepareStatement("insert into books_tbl (book_tuthr,book_name) values(?,?)");
			
			pst.setString(1, authorname);
			pst.setString(2, bookname);
		
			int result = pst.executeUpdate();
			pst.close();
			con.close();	
			
			
			
			if (result > 0) {
				resultstring = "done";
	        } else {
	        	resultstring = "error";
	        }
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return resultstring;
		
	}
	
}
